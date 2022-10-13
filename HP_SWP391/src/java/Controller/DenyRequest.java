
package Controller;

import DAL.DAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DenyRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAO dao = new DAO();
        String requestID = request.getParameter("requestID");
        dao.denyRequest(requestID);
        response.sendRedirect("request");
    }
    
        @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
