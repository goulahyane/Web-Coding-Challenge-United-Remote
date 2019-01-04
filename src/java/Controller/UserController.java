/*
    User Controller
    Here i Create a List that stores Users informations (names, mails, passwords, ..), Am not using a
    data base in both controllers.
 */
package Controller;

import java.io.Serializable;
import Model.User;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author goulahyane
 */

@Named("userController")
@SessionScoped  //

public class UserController implements Serializable {

    public static ArrayList<User> users = new ArrayList<User>();

    public UserController() {
    }
    
    //Sign up method: checks if a user is already signed up, if not, the uses will be added to the arraylist of users declared above.
    public boolean signup(String FirstName, String SecondName, String Mail, String Password) throws Exception {
        boolean x = true;
        if (users.size() == 0) {
            users.add(new User(FirstName, SecondName, Mail, Password));
            return x;
        } else {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getMail().equals(Mail)) {
                    x = false;
                    break;
                }
            }
            users.add(new User(FirstName, SecondName, Mail, Password));
            return x;
        }
    }//signup

    
    //Sign in method: Check if user already in Array list so he can sign in!
    public boolean signin(String Mail, String Password) throws Exception {
        boolean x = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getPassword().equals(Password) && users.get(i).getMail().equals(Mail)) {
                x = true;
                break;
            }
        }
        return x;
    }//signin
}
