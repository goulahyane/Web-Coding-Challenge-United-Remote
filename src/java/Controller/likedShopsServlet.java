/*
 *  The servlet responsible of like action in the shops list.
 *
 */
package Controller;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author goulahyane
 */

public class likedShopsServlet extends HttpServlet {

    String id;
    @Inject
    ShopController sc;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /* 
        * Every shop have an Id, if we press the like button, the id is gathered by getParameter method
        * then for the selected id, we change the boolean liked to true in using the liked method from the shop Controller
        * and using the last method, it will be added to a Array list called preferred shops.
        * And refershing the shops.jsp, so he can add more shops to his preferred list.
        */
        id = request.getParameter("id");
        sc.liked(id);
        request.setAttribute("shops", sc.getShops());
        request.getRequestDispatcher("shops.jsp").forward(request, response);
        
        
    }//doPost

}
