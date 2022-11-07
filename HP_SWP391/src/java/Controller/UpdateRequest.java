/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAL.DAO;
import Model.Request;
import Model.RequestSkill;
import Model.SkillCategory;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author DELL
 */
public class UpdateRequest extends HttpServlet {

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
            out.println("<title>Servlet UpdateRequest</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateRequest at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("active");
        int role = u.getRole();
        
        List<SkillCategory> listS = dao.getSkillCategory();
        List<RequestSkill> listRS = dao.getRequestSkill();
        request.setAttribute("listS", listS);
        Request req = new Request();
        int rID = Integer.parseInt(request.getParameter("rid"));
        for (Request r : dao.getRequest()) {
            if (r.getRequestID() == rID) {
                req = r;
            }
        }
        request.setAttribute("role", role);
        request.setAttribute("req", req);
        request.setAttribute("scList", dao.getSkillCategory());
        request.setAttribute("listRS", listRS);
        request.getRequestDispatcher("UpdateRequest.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("active");
        int requestID = Integer.parseInt(request.getParameter("rid"));
        String link = request.getParameter("link");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        int skillID = Integer.parseInt(request.getParameter("skillID"));
        dao.updateRequestFromMentee(requestID, link, title, content, skillID);
        if (user.getRole() == 2) {
            response.sendRedirect("MentorRequest");
        }
        if (user.getRole() == 3) {
            response.sendRedirect("mentee");
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
