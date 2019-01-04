/*
 *  This servlet redirect to the shops form.jsp page and get the data from shops list in shop controller.
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
public class ShopServlet extends HttpServlet {


    @Inject
    ShopController sc;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("shops",sc.getShops()); //
        request.getRequestDispatcher("shops.jsp").forward(request, response);

    }
}
