/*
 * This servlet is about removing a liked store from the preferred list.
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
public class removeLikedShop extends HttpServlet {
    
    String id;
    @Inject
    ShopController sc;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        * Every Preferred shop from the list, have a unique id, so to delete it from the list of preferred shops
        * we gather the id, then we give it as argument to the remove method in order to delete it from the list.
        * then loading the rest of data from the preferred list, and refreshing the page.
        */
        id = request.getParameter("id");
        sc.remove(id);
        request.setAttribute("preferredShops", sc.getLikedshops());
        request.getRequestDispatcher("preferredShop.jsp").forward(request, response);

    }//doPost

}
