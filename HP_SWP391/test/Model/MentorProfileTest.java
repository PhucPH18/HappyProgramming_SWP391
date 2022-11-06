/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

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
public class MentorProfileTest {
    
    public MentorProfileTest() {
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
    public void testGetMentorID() {
        System.out.println("getMentorID");
        MentorProfile instance = new MentorProfile(1, 1, "avatar", "introduction",
                "LinkedIn", "GitHub" , "Profession");
        int expResult = 1;
        int result = instance.getMentorID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        MentorProfile instance = new MentorProfile(1, 1, "avatar", "introduction",
                "LinkedIn", "GitHub" , "Profession");
        int expResult = 1;
        int result = instance.getUserID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAvatar() {
        System.out.println("getAvatar");
        MentorProfile instance = new MentorProfile(1, 1, "avatar", "introduction",
                "LinkedIn", "GitHub" , "Profession");
        String expResult = "avatar";
        String result = instance.getAvatar();
        assertEquals(expResult, result);
    }


    @Test
    public void testGetIntroduction() {
        System.out.println("getIntroduction");
        MentorProfile instance = new MentorProfile(1, 1, "avatar", "introduction",
                "LinkedIn", "GitHub" , "Profession");
        String expResult = "introduction";
        String result = instance.getIntroduction();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLinkedIn() {
        System.out.println("getLinkedIn");
        MentorProfile instance = new MentorProfile(1, 1, "avatar", "introduction",
                "LinkedIn", "GitHub" , "Profession");
        String expResult = "LinkedIn";
        String result = instance.getLinkedIn();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGitHub() {
        System.out.println("getGitHub");
        MentorProfile instance = new MentorProfile(1, 1, "avatar", "introduction",
                "LinkedIn", "GitHub" , "Profession");
        String expResult = "GitHub";
        String result = instance.getGitHub();
        assertEquals(expResult, result);
    }

}
