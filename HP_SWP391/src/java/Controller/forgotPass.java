/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author admin
 */
@WebServlet(name = "forgotPass", urlPatterns = {"/forgot"})
public class forgotPass extends HttpServlet {

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
            request.getRequestDispatcher("forgotPassword.jsp").forward(request, response);
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
        String email = request.getParameter("email");
        String otp;
        HttpSession ses = request.getSession();
        if (email != null || !email.equals("")) {
            Random ran = new Random();
            //otpval = ran.nextInt(1255650);
            int num = ran.nextInt(999999);
            otp = String.format("%06d", num);
            
            String to = email;
            Properties pp = new Properties();
            pp.put("mail.smtp.host", "smtp.gmail.com");
            pp.put("mail.smtp.socketFactory.port", "465");
            pp.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            pp.put("mail.smtp.auth", "true");
            pp.put("mail.smtp.port", "465");
            Session session = Session.getDefaultInstance(pp, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("khanh.zzz.gotosleep@gmail.com", "xrluqnneksldzmqi");
                }
            });
            try {
                MimeMessage msg = new MimeMessage(session);
                msg.setFrom(new InternetAddress(email));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                msg.setSubject("Recover Password");
                msg.setText("Here is your recovery code: "+otp);
                Transport.send(msg);
                System.out.println("Message sent successfully");
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
            request.setAttribute("message", "Recovery code has been sent to your email!");
            ses.setAttribute("otp", otp);
            ses.setAttribute("email", email);
            request.getRequestDispatcher("recoveryCode.jsp").forward(request, response);
        }
        processRequest(request, response);
    }
}
