/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAL.DAO;
import Model.User;
import Model.sendEmail;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class SignUpControl extends HttpServlet {

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
            out.println("<title>Servlet SignUpControl</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUpControl at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
        request.getRequestDispatcher("SignUp.jsp").forward(request, response);
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
//        processRequest(request, response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String rePass = request.getParameter("repass");
        String fullName = request.getParameter("fullname");
        boolean gender = request.getParameter("gender").equals("m");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        Date dob = Date.valueOf(request.getParameter("dob"));
        String address = request.getParameter("address");

        if (!password.equals(rePass)) {
            request.setAttribute("alert", "Password and Confirm Password don't match, please try again!");
            doGet(request, response);
        } else {
            DAO dao = new DAO();
            User us1 = null;
            User us2 = null;
            ArrayList<User> listU = dao.getUser();
            for (User u : listU) {
                if (u.getUsername().trim().equals(username)) {
                    us1 = u;
                }
                if (u.getEmail().trim().equals(email)) {
                    us2 = u;
                }
            }
            int id = listU.size() + 1;
            if (us1 != null) {
                request.setAttribute("alert", "Username exist, please try again!");
                doGet(request, response);
            }
            if (us2 != null) {
                request.setAttribute("alert", "Email exist, please try again!");
                doGet(request, response);
            }
            if (us1 == null && us2 == null) {
                dao.CreateUser(id, username, password, fullName, gender, phone, email, dob, address, false, 0);

                String code = sendEmail.getRandom();

                boolean test = sendEmail.sendEmail(email, code);
                if (test) {
                    HttpSession session = request.getSession();
                    if (session.getAttribute("verifying") != null) {
                        session.removeAttribute("verifying");
                    }
                    session.setAttribute("verifying", code);
                    if (session.getAttribute("verifyingUsername") != null) {
                        session.removeAttribute("verifyingUsername");
                    }
                    session.setAttribute("verifyingUsername", username);
                    request.getRequestDispatcher("Verify.jsp").forward(request, response);
                } else {
                    request.setAttribute("alert", "Error at sending email!");
                    doGet(request, response);
                }
            }
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
