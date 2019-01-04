/*
* This servlet in the responsible for the user sign up.
* The servlet gathers data from the jsp from, and initialise a list of users, then add informations about 
*  users to list created in user Controller.
*/
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author goulahyane
 */
@WebServlet("/UserServletSignup")
public class UserServletSignup extends HttpServlet {
    
    //Attributes
    private String firstName;
    private String secondName;
    private String mail;
    private String password;
    UserController uc;
    boolean signUp;
    
    //The init method, once the servlet executed, she create a new instance of user Controller.
    public void init() throws ServletException {
        uc = new UserController();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Gathering data from the request
        firstName = request.getParameter("firstName");
        secondName = request.getParameter("secondName");
        mail = request.getParameter("mail");
        password = request.getParameter("password");

        try {
            signUp = uc.signup(firstName, secondName, mail, password);
        } catch (Exception ex) {
            Logger.getLogger(UserServletSignup.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*
        * If sign up method (from the user controller) return a true, it means the user never existed in the list of users
        * otherwise it redirect you to the same sign up jsp page, with an error indication message shown bellow the form.    
        */
        
        if (signUp) {
            response.sendRedirect("signin.jsp");
        } else {
            request.setAttribute("message", "User Already Exist Please User an other mail!");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
            response.sendRedirect("signup.jsp");
        }
    }//doPost
}
