package Controller;

import DAL.DAO;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class StaticReqController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DAO dao = new DAO();
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("active");
        int id = u.getUserID();
        
        int acceptedReq = dao.mentorAcceptedReq(id);
        int canceledReq = dao.mentorCanceledReq(id);
        int invitedReq = dao.mentorTotalReq(id);
        int completedReq = dao.mentorCompletedReq(id);

        request.setAttribute("acceptedReq", acceptedReq);
        request.setAttribute("invitedReq", invitedReq);
        request.setAttribute("canceledReq", canceledReq);
        request.setAttribute("completedReq", completedReq);
        request.getRequestDispatcher("staticRequest.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
