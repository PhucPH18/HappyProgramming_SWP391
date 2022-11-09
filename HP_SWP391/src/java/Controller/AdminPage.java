/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAL.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.text.DecimalFormat;

/**
 *
 * @author levuh
 */
public class AdminPage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAO dao = new DAO();
        
        int totalMentor = dao.getTotalMentor();
        int totalMentee = dao.getTotalMentee();
        int totalSkill = dao.getTotalSkill();
        int pendingReq = dao.getPendingReq();
        
        int adDeniedReq = dao.getAdDeniedReq();
        int adTotalReq = dao.getAdTotalReq();
        int IPreq = dao.getIPReq();
        int completedReq = dao.getCompletedReq();
        int totalAcc = dao.getTotalAcc();
        int activeAcc = dao.getActiveAcc();
        int dashSkill = dao.getDashSkill();
        int activeSkill = dao.getActiveSkill();
        
        float f = 102.236569f;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float perOfDeniedReq = Float.valueOf(decimalFormat.format((float) adDeniedReq / adTotalReq * 100));
        float perOfIPReq = Float.valueOf(decimalFormat.format((float) IPreq / adTotalReq * 100));
        float perOfComReq = Float.valueOf(decimalFormat.format((float) completedReq / adTotalReq * 100));
        float perOfActiveAcc = Float.valueOf(decimalFormat.format((float) activeAcc / totalAcc * 100));
        float perOfActiveSkill = Float.valueOf(decimalFormat.format((float) activeSkill / dashSkill * 100));
        
        request.setAttribute("totalMentor", totalMentor);
        request.setAttribute("totalMentee", totalMentee);
        request.setAttribute("totalSkill", totalSkill);
        request.setAttribute("pendingReq", pendingReq);
        
        request.setAttribute("perOfDeniedReq", perOfDeniedReq);
        request.setAttribute("perOfIPReq", perOfIPReq);
        request.setAttribute("perOfComReq", perOfComReq);
        request.setAttribute("perOfActiveAcc", perOfActiveAcc);
        request.setAttribute("perOfActiveSkill", perOfActiveSkill);
        
        request.getRequestDispatcher("Admin.jsp").forward(request, response);
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
