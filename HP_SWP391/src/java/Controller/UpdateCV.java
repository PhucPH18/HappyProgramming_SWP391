/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAL.DAO;
import Model.MentorProfile;
import Model.MentorRegist;
import Model.MentorSkill;
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
 * @author DELL
 */
public class UpdateCV extends HttpServlet {

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
            out.println("<title>Servlet UpdateCV</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateCV at " + request.getContextPath() + "</h1>");
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
        DAO dao = new DAO();
        List<SkillCategory> listS = dao.getSkillCategory();
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("active");

        MentorProfile mp = new MentorProfile();
        int mentorID = 0;
        for (MentorProfile m : dao.getMentorProfile()) {
            if (m.getUserID() == user.getUserID()) {
                mp = m;
                mentorID = m.getMentorID();
            }
        }

        ArrayList<MentorSkill> msList = new ArrayList<>();
        for (MentorSkill m : dao.getMentorSkill()) {
            if (m.getMentorID() == mentorID) {
                msList.add(m);
            }
        }

        MentorSkill ms1 = msList.get(0);
        MentorSkill ms2 = msList.get(1);
        MentorSkill ms3 = msList.get(2);

        request.setAttribute("msList", msList);
        request.setAttribute("mp", mp);
        request.setAttribute("ms1", ms1);
        request.setAttribute("ms2", ms2);
        request.setAttribute("ms3", ms3);
        request.setAttribute("user", user);
        request.setAttribute("listS", listS);
        request.getRequestDispatcher("UpdateCV.jsp").forward(request, response);
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
        HttpSession ses = request.getSession();
        User u = (User) ses.getAttribute("active");
        int uid = u.getUserID();
        int mrID = 0;
        int mentorID = 0;
        
        for(MentorRegist mr : dao.getMentorRegist()){
            if(mr.getMenteeID() == uid){
                mrID = mr.getRegistID();
            }
        }
        
        for(MentorProfile mp : dao.getMentorProfile()){
            if(mp.getUserID() == uid){
                mentorID = mp.getMentorID();
            }
        }
        
        String avatar = request.getParameter("avatar");
        String prof = request.getParameter("prof");
        String intro = request.getParameter("intro");
        String lnkdin = request.getParameter("lnkdin");
        String github = request.getParameter("github");

        int msID1 = Integer.parseInt(request.getParameter("msID1"));
        int skillID1 = Integer.parseInt(request.getParameter("skill1"));
        int yoe1 = Integer.parseInt(request.getParameter("yoe1"));
        String desc1 = request.getParameter("desc1");

        int msID2 = Integer.parseInt(request.getParameter("msID2"));
        int skillID2 = Integer.parseInt(request.getParameter("skill2"));
        int yoe2 = Integer.parseInt(request.getParameter("yoe2"));
        String desc2 = request.getParameter("desc2");

        int msID3 = Integer.parseInt(request.getParameter("msID3"));
        int skillID3 = Integer.parseInt(request.getParameter("skill3"));
        int yoe3 = Integer.parseInt(request.getParameter("yoe3"));
        String desc3 = request.getParameter("desc3");

        if (skillID1 != skillID2 && skillID2 != skillID3 && skillID3 != skillID1) {
            dao.updateMentorRegist(mrID, uid, Date.valueOf(java.time.LocalDate.now()), 0);
            dao.updateCV(mentorID, uid, avatar, prof, intro, lnkdin, github);
            dao.updateMentorSkill(6, mentorID, 3, yoe1, desc1);
            dao.updateMentorSkill(msID2, mentorID, skillID2, yoe2, desc2);
            dao.updateMentorSkill(msID3, mentorID, skillID3, yoe3, desc3);
            request.setAttribute("alert", "Your CV form has been updated!");
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
