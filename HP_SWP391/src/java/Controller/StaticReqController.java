package Controller;

import DAL.DAO;
import Model.MentorProfile;
import Model.User;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.text.DecimalFormat;

public class StaticReqController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DAO dao = new DAO();
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("active");
        int id = 0;
        for (MentorProfile mp : dao.getMentorProfile()) {
            if (mp.getUserID() == u.getUserID()) {
                id = mp.getMentorID();
            }
        }

        int onGoingReq = dao.mentorOnGoingReq(id);
        int canceledReq = dao.mentorCanceledReq(id);
        int invitedReq = dao.mentorTotalReq(id);
        int completedReq = dao.mentorCompletedReq(id);
        
        float perOfCancelReq = 0;
        float perOfComReq = 0;
        
        float f = 102.236569f;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        if (invitedReq != 0) {
            perOfCancelReq = Float.valueOf(decimalFormat.format((float) canceledReq / invitedReq * 100));
            perOfComReq = Float.valueOf(decimalFormat.format((float) completedReq / invitedReq * 100));
        }

        request.setAttribute("perOfCancelReq", perOfCancelReq);
        request.setAttribute("perOfComReq", perOfComReq);
        request.setAttribute("acceptedReq", onGoingReq);
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
