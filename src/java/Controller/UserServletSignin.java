/*
    Sign in Servlet 
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author goulahyane
 */
@WebServlet("/UserServletSignin")
public class UserServletSignin extends HttpServlet {

    private String mail;
    private String password;
    UserController uc;
    @Inject
    ShopController sc;
    boolean signIn;

    public void init() throws ServletException {
        uc = new UserController();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Gather tow important informations in order to sign in.
        mail = request.getParameter("mail");
        password = request.getParameter("password");

        try {
            //receiving true or false from the signin method, defined in user Controller.
            signIn = uc.signin(mail, password); 
        } catch (Exception ex) {
            Logger.getLogger(UserServletSignup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*
        * If signin method return true, it means that the users is already signed up, he can move forward
        * to see the listed shops. Otherwise he will be notified by a message shown bellow the form to correct
        * his informations or to sign up first.
        */
        if (signIn) {
            sc.initshops();
            request.setAttribute("shops", sc.getShops());
            request.getRequestDispatcher("shops.jsp").forward(request, response);
            response.sendRedirect("shops.jsp");

        } else {
            request.setAttribute("message", "No User Found with specified Cridential"); 
            request.getRequestDispatcher("signin.jsp").forward(request, response);
            response.sendRedirect("signin.jsp");
        }

    }//doPost
}
