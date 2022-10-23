/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author DELL
 */
public class sendEmail {

    public static String getRandom() {
        Random r = new Random();
        int number = r.nextInt(999999);
        return String.format("%06d", number);
    }

    public static boolean sendEmail(String toEmail, String code) {
        boolean test = false;

        String fromEmail = "phucphhe161524@fpt.edu.vn";
        String password = "phucph161202";

        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.ssl.protocols", "TLSv1.2");
            props.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getInstance(props,
                    new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            }
            );

            Message mess = new MimeMessage(session);

            mess.setFrom(new InternetAddress(fromEmail));
            mess.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));

            mess.setSubject("Verification Email");
            mess.setText("Thanks for using Happy Programming. Your verification code is: " + code);

            Transport.send(mess);
            test = true;

        } catch (Exception e) {
            System.out.println("Error at sending email" + e.getMessage());
        }
        return test;
    }
}
