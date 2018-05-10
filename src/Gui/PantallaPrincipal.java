
package components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;


public class PantallaPrincipal {
    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Eventos");
        menuBar.add(menu);

        //a group of JMenuItems
        menuItem = new JMenuItem("Crear evento");
        menu.add(menuItem);

        menuItem = new JMenuItem("Editar evento");
        menuItem.setMnemonic(KeyEvent.VK_E);
        menu.add(menuItem);

        menu.addSeparator();
        
        submenu = new JMenu("Buscar evento");

        menuItem = new JMenuItem("Fecha");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Nombre");
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Descripcion");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Lugar");
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Invitado");
        submenu.add(menuItem);
        
        menu.add(submenu);
        
        //Build second menu in the menu bar.
        menu = new JMenu("Alarmas");
        menuBar.add(menu);
        
        menuItem = new JMenuItem("Crear alarma");
        menu.add(menuItem);

        menuItem = new JMenuItem("Editar alarma");
        menuItem.setMnemonic(KeyEvent.VK_E);
        menu.add(menuItem);

        return menuBar;
    }

    public Container createContentPane() {
        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(false);

        //Create a scrolled text area.
        
        scrollPane = new JScrollPane(output);
        
        //Add the text area to the content pane.
        contentPane.add(scrollPane, BorderLayout.CENTER);
        
        return contentPane;
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("RManager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        
        PantallaPrincipal demo = new PantallaPrincipal();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
        

        //Display the window.
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }


}