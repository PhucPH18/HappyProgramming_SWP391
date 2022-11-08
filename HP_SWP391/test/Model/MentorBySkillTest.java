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
public class MentorBySkillTest {
    
    public MentorBySkillTest() {
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
    public void testGetAvatar() {
        System.out.println("getAvatar");
        MentorBySkill instance = new MentorBySkill("avatar", "fullName", "intro"
                , true, "email", "gitHub", 0);
        String expResult = "avatar";
        String result = instance.getAvatar();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        MentorBySkill instance = new MentorBySkill("avatar", "fullName", "intro"
                , true, "email", "gitHub", 0);
        String expResult = "fullName";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIntro() {
        System.out.println("getIntro");
        MentorBySkill instance = new MentorBySkill("avatar", "fullName", "intro"
                , true, "email", "gitHub", 0);
        String expResult = "intro";
        String result = instance.getIntro();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsGender() {
        System.out.println("isGender");
        MentorBySkill instance = new MentorBySkill("avatar", "fullName", "intro"
                , true, "email", "gitHub", 0);
        boolean expResult = true;
        boolean result = instance.isGender();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        MentorBySkill instance = new MentorBySkill("avatar", "fullName", "intro"
                , true, "email", "gitHub", 0);
        String expResult = "email";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGitHub() {
        System.out.println("getGitHub");
        MentorBySkill instance = new MentorBySkill("avatar", "fullName", "intro"
                , true, "email", "gitHub", 0);
        String expResult = "gitHub";
        String result = instance.getGitHub();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetYearsOfExp() {
        System.out.println("getYearsOfExp");
        MentorBySkill instance = new MentorBySkill("avatar", "fullName", "intro"
                , true, "email", "gitHub", 0);
        int expResult = 0;
        int result = instance.getYearsOfExp();
        assertEquals(expResult, result);
    }

}
