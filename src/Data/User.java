/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author Esteban
 */
public class User extends Person implements Serializable{

    private String occupation;
    private String contact;
    private String password;

    public User(String occupation, String contact, String name, String emailAddress) {
        super(name, emailAddress);
        this.occupation = occupation.trim();
        this.contact = contact.trim();
    }
    
    public User(String name,String emailAddress)
    {
        this(null,null,name,emailAddress);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation.trim();
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password.trim();
    }
    
}
