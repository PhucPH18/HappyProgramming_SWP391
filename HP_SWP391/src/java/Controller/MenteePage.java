/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAL.DAO;
import Model.*;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author levuh
 */
public class MenteePage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAO dao = new DAO();
        List<SkillCategory> listS = dao.getSkillCategory();
        List<User> listU = dao.getUser();
        List<MentorProfile> listMP = dao.getMentorProfile();
        List<RequestSkill> listRS = dao.getRequestSkill();

        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("active");
        int menteeID = u.getUserID();
        int menteeCompleteReq = dao.menteeCompletedReq(menteeID);

        ArrayList<Request> reqList = new ArrayList<>();
        for (Request r : dao.getRequest()) {
            if (r.getMenteeID() == menteeID) {
                reqList.add(r);
            }
        }
        
        ArrayList<MentorRegist> mrList = new ArrayList<>();
        for (MentorRegist mr : dao.getMentorRegist()) {
            if (mr.getMenteeID() == menteeID) {
                mrList.add(mr);
            }
        }
        
        request.setAttribute("menteeCompleteReq", menteeCompleteReq);
        request.setAttribute("reqList", reqList);
        request.setAttribute("mrList", mrList);
        request.setAttribute("size", reqList.size());
        request.setAttribute("listS", listS);
        request.setAttribute("listU", listU);
        request.setAttribute("listMP", listMP);
        request.setAttribute("listRS", listRS);
        request.getRequestDispatcher("Mentee.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
