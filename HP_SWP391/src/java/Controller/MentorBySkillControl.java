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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author levuh
 */
public class MentorBySkillControl extends HttpServlet {

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
        String skillID = request.getParameter("sID");
        DAO dao = new DAO();
        List<SkillCategory> listS = dao.getSkillCategory();
        List<MentorBySkill> listM = new ArrayList<>();
        List<User> listU = dao.getUser();
        List<MentorProfile> listMP = dao.getMentorProfile();
        
        for(MentorBySkill mbs: dao.getMentorBySkill(skillID)){
            for(User u : dao.getUser()){
                for(MentorRegist mr : dao.getMentorRegist()){
                    if(mbs.getEmail().equals(u.getEmail()) && u.getUserID() == mr.getMenteeID()
                            && mr.getStatus() == 2){
                        listM.add(mbs);
                    }
                }
            }
        }

        request.setAttribute("listS", listS);
        request.setAttribute("listM", listM);
        request.setAttribute("listU", listU);
        request.setAttribute("listMP", listMP);
        request.getRequestDispatcher("MentorBySkill.jsp").forward(request, response);

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
        processRequest(request, response);
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
        processRequest(request, response);
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
