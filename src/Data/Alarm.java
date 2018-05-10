/**
 *
 * @author Andres
 */
public class Alarm {
    private int tipoAlarma;
    private Date diaNotificacion;

    public String getTipoAlarma() {
        return tipoAlarma;
    }

    public void setTipoAlarma(String tipoAlarma) {
        this.tipoAlarma = tipoAlarma;
    }

    public Date getDiaNotificacion() {
        return diaNotificacion;
    }

    public void setDiaNotificacion(Date diaNotificacion) {
        this.diaNotificacion = diaNotificacion;
    }

    public Alarm(String tipoAlarma, Date diaNotificacion) {
        if(tipoAlarma.equals("correo")){
            this.tipoAlarma = 1;
        }else if(tipoAlarma.equals("sonido"){
            this.tipoAlarma = 0;
        }else if(tipoAlarma.equals("both"){
            this.tipoAlarma = 2;
        }
        this.diaNotificacion = diaNotificacion;
    }
    
    private static void mailNotification(String destinatario, String asunto, String cuerpo) {
    // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
    private String remitente = "nomcuenta";  //Para la dirección nomcuenta@gmail.com

    Properties props = System.getProperties();
    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
    props.put("mail.smtp.user", remitente);
    props.put("mail.smtp.clave", "miClaveDeGMail");    //La clave de la cuenta
    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

    Session session = Session.getDefaultInstance(props);
    MimeMessage message = new MimeMessage(session);

    try {
        message.setFrom(new InternetAddress(remitente));
        message.addRecipient(Message.RecipientType.TO, destinatario);   //Se podrían añadir varios de la misma manera
        message.setSubject(asunto);
        message.setText(cuerpo);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", remitente, clave);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    catch (MessagingException me) {
        me.printStackTrace();   //Si se produce un error
    }
}
                 
    
    
    
}