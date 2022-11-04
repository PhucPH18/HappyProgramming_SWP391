/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAL.DAO;
import Model.MentorProfile;
import Model.MentorProfile1;
import Model.SkillCategory;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI KATANA
 */
public class Update_Mentor_Profile extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Update_Mentor_Profile</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Update_Mentor_Profile at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        int mentorID = Integer.parseInt(request.getParameter("kid"));

        int mentorID = 1;
        MentorProfile mp = new DAO().getMentorByMentorID(mentorID);
        ArrayList<MentorProfile1> listMentorSkill = new DAO().getProfileMentorByMentorID(mentorID);
        request.setAttribute("mp", mp);
        request.setAttribute("listMentorSkill", listMentorSkill);
        request.getRequestDispatcher("Update_Mentor_Profile.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAO dao = new DAO();

        //int mentorID =1;
        int mentorID = Integer.parseInt(request.getParameter("mid"));
        ArrayList<MentorProfile1> listMentorSkill = new DAO().getProfileMentorByMentorID(mentorID);

        String avt = request.getParameter("Avatar");
        String git = request.getParameter("GitHub");
        String link = request.getParameter("LinkedIn");
        String intro = request.getParameter("introduction");
        dao.UpdateMentorProfile(mentorID, avt, intro, link, git);
        for (MentorProfile1 mentorProfile1 : listMentorSkill) {
            int skillId = Integer.parseInt(request.getParameter("sid"));
            String skillName = request.getParameter("skill");
            String des = request.getParameter("des");
            int year = Integer.parseInt(request.getParameter("year"));
            String status = request.getParameter("status");
            dao.UpdateSkillCategory(skillName, status, skillId);
            dao.UpdateMentorSkill(des, year, skillId);
        }
        processRequest(request, response);
        //request.getRequestDispatcher("Update_Mentor_Profile?mid=1").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
