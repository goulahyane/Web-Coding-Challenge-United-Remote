/*
    This is the User Model.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author goulahyane
 */
public class User implements Serializable {

    //Attributes
    private String firstName;
    private String secondName;
    private String mail;
    private String password;

    public User() {
    }

    public User(String firstName, String secondName, String mail, String password) { //Constructor
        this.firstName = firstName;
        this.secondName = secondName;
        this.mail = mail;
        this.password = password;
    }
    
    //Getters & Setters
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
