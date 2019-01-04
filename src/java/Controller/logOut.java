/*
 * Log out Servlet
 */
package Controller;

import Model.Shop;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author goulahyane
 */
public class logOut extends HttpServlet {
    @Inject
    ShopController sc;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        /* log out servlet do tow thigns:
        *   
        *   1- initialise the likedshops to new emty arraylist, that means once the user
        *   loged out, he lose all his preferred shops, because i still working with a single array list,
        *   not query. otherwise next user to sign in will face the previous user preferred shops.
        *   2- Redirect the user to the sign in form.
        *
        */
        sc.setLikedshops(new ArrayList<Shop>()); 
        response.sendRedirect("signin.jsp");
        
    }//doPost 
}
