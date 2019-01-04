/*
*   This servlet Load the list of preferred shops from Arraylist, and load the jsp page. 
*
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author goulahyane
 */
public class preferredShopsServlet extends HttpServlet {

    @Inject
    ShopController sc;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("preferredShops",sc.getLikedshops());
        request.getRequestDispatcher("preferredShop.jsp").forward(request, response);

    }//doPost

}
