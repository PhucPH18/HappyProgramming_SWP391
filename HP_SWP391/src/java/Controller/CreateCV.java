/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAL.DAO;
import Model.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
@WebServlet(name = "CreateCV", urlPatterns = {"/createCV"})
public class CreateCV extends HttpServlet {

    DAO dao;

    public void init() {
        dao = new DAO();
    }

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
            out.println("<title>Servlet CreateCV</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreateCV at " + request.getContextPath() + "</h1>");
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
        List<SkillCategory> listS = dao.getSkillCategory();
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("active");
        request.setAttribute("user", user);
        request.setAttribute("listS", listS);
        request.getRequestDispatcher("createCV.jsp").forward(request, response);
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
        HttpSession ses = request.getSession();
        User u = (User) ses.getAttribute("active");
        int uid = u.getUserID();
        int mrID = dao.getMentorRegist().size()+1;
        int msID = dao.getMentorSkill().size();

        int mentorID = dao.getMentorProfile().size();
        String avatar = request.getParameter("avatar");
        String prof = request.getParameter("prof");
        String intro = request.getParameter("intro");
        String lnkdin = request.getParameter("lnkdin");
        String github = request.getParameter("github");

        int skillID1 = Integer.parseInt(request.getParameter("skill1"));
        int yoe1 = Integer.parseInt(request.getParameter("yoe1"));
        String desc1 = request.getParameter("desc1");

        int skillID2 = Integer.parseInt(request.getParameter("skill2"));
        int yoe2 = Integer.parseInt(request.getParameter("yoe2"));
        String desc2 = request.getParameter("desc2");

        int skillID3 = Integer.parseInt(request.getParameter("skill3"));
        int yoe3 = Integer.parseInt(request.getParameter("yoe3"));
        String desc3 = request.getParameter("desc3");

        if (skillID1 != skillID2 && skillID2 != skillID3 && skillID3 != skillID1) {
            dao.CreateMentorRegist(mrID, uid, Date.valueOf(java.time.LocalDate.now()), 0);
            dao.addCV(mentorID, uid, avatar, prof, intro, lnkdin, github);
            dao.addMentorSkills(msID + 1, mentorID, skillID1, yoe1, desc1);
            dao.addMentorSkills(msID + 2, mentorID, skillID2, yoe2, desc2);
            dao.addMentorSkills(msID + 3, mentorID, skillID3, yoe3, desc3);
            request.setAttribute("alert", "Your CV form has been sent, please wait for response!");
            doGet(request, response);
        } else {
            request.setAttribute("alert", "Skill must be different, please try again!");
            doGet(request, response);
        }
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
