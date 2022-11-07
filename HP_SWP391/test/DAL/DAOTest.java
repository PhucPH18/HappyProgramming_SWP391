/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import Model.MentorBySkill;
import Model.MentorProfile;
import Model.MentorSkill;
import Model.Rating;
import Model.Request;
import Model.RequestSkill;
import Model.SkillCategory;
import Model.Transaction;
import Model.User;
import java.sql.Date;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class DAOTest {

    public DAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetMentorProfile() {
        System.out.println("getMentorProfile");
        DAO instance = new DAO();
        MentorProfile mp0 = new MentorProfile(0, 0, ".", ".", null, null,".");
        MentorProfile mp1 = new MentorProfile(1, 3, "waiting", "Master of coding", null, null,"Developer");
        MentorProfile mp2 = new MentorProfile(2, 2, "waiting", "Fullstack Dev", null, null,"AI Engineer");
        ArrayList<MentorProfile> expResultList = new ArrayList<>();
        expResultList.add(mp0);
        expResultList.add(mp1);
        expResultList.add(mp2);
        String expResult = expResultList.toString();
        String result = instance.getMentorProfile().toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMentorSkill() {
        System.out.println("getMentorSkill");
        DAO instance = new DAO();
        ArrayList<MentorSkill> expResultList = new ArrayList<>();
        MentorSkill ms1 = new MentorSkill(1, 1, 4, 10, "master of java coding");
        MentorSkill ms2 = new MentorSkill(2, 1, 5, 6, "having WED201c certificate on cousera");
        MentorSkill ms3 = new MentorSkill(3, 1, 7, 12, "having WED201c certificate on cousera");
        MentorSkill ms4 = new MentorSkill(4, 2, 5, 1, "Fullstack Dev");
        MentorSkill ms5 = new MentorSkill(5, 2, 7, 1, "Fullstack Dev");
        expResultList.add(ms1);
        expResultList.add(ms2);
        expResultList.add(ms3);
        expResultList.add(ms4);
        expResultList.add(ms5);
        String expResult = expResultList.toString();
        String result = instance.getMentorSkill().toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRating() {
        System.out.println("getRating");
        DAO instance = new DAO();
        ArrayList<Rating> expResultList = new ArrayList<>();
        Rating r1 = new Rating(1, "1234", 4, 6, 1);
        Rating r2 = new Rating(2, "123", 5, 6, 0);
        expResultList.add(r1);
        expResultList.add(r2);
        String expResult = expResultList.toString();
        String result = instance.getRating().toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRequestSkill() {
        System.out.println("getRequestSkill");
        DAO instance = new DAO();
        ArrayList<RequestSkill> expResultList = new ArrayList<>();
        RequestSkill rs1 = new RequestSkill(1, 1, 4);
        RequestSkill rs2 = new RequestSkill(2, 1, 5);
        RequestSkill rs3 = new RequestSkill(3, 1, 7);
        RequestSkill rs4 = new RequestSkill(4, 6, 6);
        RequestSkill rs5 = new RequestSkill(5, 7, 1);
        expResultList.add(rs1);
        expResultList.add(rs2);
        expResultList.add(rs3);
        expResultList.add(rs4);
        expResultList.add(rs5);
        String expResult = expResultList.toString();
        String result = instance.getRequestSkill().toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSkillCategory() {
        System.out.println("getSkillCategory");
        DAO instance = new DAO();
        ArrayList<SkillCategory> expResultList = new ArrayList<>();
        expResultList.add(new SkillCategory(1, "C", true));
        expResultList.add(new SkillCategory(2, "C++", true));
        expResultList.add(new SkillCategory(3, "C#", true));
        expResultList.add(new SkillCategory(4, "Java", true));
        expResultList.add(new SkillCategory(5, "Javascript", true));
        expResultList.add(new SkillCategory(6, "Python", true));
        expResultList.add(new SkillCategory(7, "HTML/CSS", true));
        expResultList.add(new SkillCategory(8, "ASP.NET", true));
        String expResult = expResultList.toString();
        String result = instance.getSkillCategory().toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testLogin1() {
        System.out.println("login1");
        String user = "phucph";
        String pass = "123";
        DAO instance = new DAO();
        String expResult = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
                "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true, 0) + "";
        String result = instance.login(user, pass) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogin2() {
        System.out.println("login2");
        String user = "phucph";
        String pass = "";
        DAO instance = new DAO();
        String expResult = "null";
        String result = instance.login(user, pass) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogin3() {
        System.out.println("login3");
        String user = "";
        String pass = "123";
        DAO instance = new DAO();
        String expResult = "null";
        String result = instance.login(user, pass) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogin4() {
        System.out.println("login4");
        String user = "";
        String pass = "";
        DAO instance = new DAO();
        String expResult = "null";
        String result = instance.login(user, pass) + "";
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSkillBySkillID() {
        System.out.println("getSkillBySkillID");
        int skillID = 1;
        DAO instance = new DAO();
        String expResult = new SkillCategory(1, "C", true) + "";
        String result = instance.getSkillBySkillID(skillID) + "";
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdatePassword1() {
        System.out.println("updatePassword1");
        String newpass = "123456";
        String email = "admin@gmail.com";
        DAO instance = new DAO();
        boolean expResult = true;
        boolean result = instance.updatePassword(newpass, email);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testUpdatePassword2() {
        System.out.println("updatePassword2");
        String newpass = "123456";
        String email = null;
        DAO instance = new DAO();
        boolean expResult = false;
        boolean result = instance.updatePassword(newpass, email);
        assertEquals(expResult, result);
    }
    @Test
    public void testUpdatePassword3() {
        System.out.println("updatePassword3");
        String newpass = null;
        String email = "admin@gmail.com";
        DAO instance = new DAO();
        boolean expResult = false;
        boolean result = instance.updatePassword(newpass, email);
        assertEquals(expResult, result);
    }
    @Test
    public void testUpdatePassword4() {
        System.out.println("updatePassword4");
        String newpass = null;
        String email = null;
        DAO instance = new DAO();
        boolean expResult = false;
        boolean result = instance.updatePassword(newpass, email);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckEmailExist1() {
        System.out.println("checkEmailExist1");
        String email = "phucph@gmail.com";
        DAO instance = new DAO();
        String expResult = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
                "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true, 0) + "";
        String result = instance.checkEmailExist(email) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckEmailExist2() {
        System.out.println("checkEmailExist2");
        String email = null;
        DAO instance = new DAO();
        String expResult = null + "";
        String result = instance.checkEmailExist(email) + "";
        assertEquals(expResult, result);
    }
    

    @Test
    public void testGetUserByID1() {
        System.out.println("getUserByID");
        int id = 1;
        DAO instance = new DAO();
        String expResult = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
                "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true, 0) + "";
        String result = instance.getUserByID(id) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetUserByID2() {
        System.out.println("getUserByID");
        int id = -1;
        DAO instance = new DAO();
        String expResult = null + "";
        String result = instance.getUserByID(id) + "";
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckRatingExist1() {
        System.out.println("checkRatingExist1");
        int menteeID = 6;
        int mentorID = 1;
        DAO instance = new DAO();
        String expResult = new Rating(1, "okay", 4, 6, 1) + "";
        String result = instance.checkRatingExist(menteeID, mentorID) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckRatingExist2() {
        System.out.println("checkRatingExist2");
        int menteeID = 6;
        int mentorID = -1;
        DAO instance = new DAO();
        String expResult = null + "";
        String result = instance.checkRatingExist(menteeID, mentorID) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckRatingExist3() {
        System.out.println("checkRatingExist3");
        int menteeID = -1;
        int mentorID = 1;
        DAO instance = new DAO();
        String expResult = null + "";
        String result = instance.checkRatingExist(menteeID, mentorID) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckRatingExist4() {
        System.out.println("checkRatingExist4");
        int menteeID = -1;
        int mentorID = -1;
        DAO instance = new DAO();
        String expResult = null + "";
        String result = instance.checkRatingExist(menteeID, mentorID) + "";
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMentorByUID() {
        System.out.println("getMentorByUID");
        int uid = 0;
        DAO instance = new DAO();
        String expResult = new MentorProfile(0, 0, ".", ".", null, null,"") + "";
        String result = instance.getMentorByUID(uid) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testUpdateNewPassword1() {
        System.out.println("updateNewPassword1");
        String newpass = "1234";
        int uid = 0;
        DAO instance = new DAO();
        String expResult = "true";
        String result = instance.updateNewPassword(newpass, uid) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testUpdateNewPassword2() {
        System.out.println("updateNewPassword2");
        String newpass = null;
        int uid = 0;
        DAO instance = new DAO();
        String expResult = "false";
        String result = instance.updateNewPassword(newpass, uid) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testUpdateNewPassword3() {
        System.out.println("updateNewPassword3");
        String newpass = "1234";
        int uid = -1;
        DAO instance = new DAO();
        String expResult = "false";
        String result = instance.updateNewPassword(newpass, uid) + "";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testUpdateNewPassword4() {
        System.out.println("updateNewPassword4");
        String newpass = null ;
        int uid = 0;
        DAO instance = new DAO();
        String expResult = "false";
        String result = instance.updateNewPassword(newpass, uid) + "";
        assertEquals(expResult, result);
    }
    
}
