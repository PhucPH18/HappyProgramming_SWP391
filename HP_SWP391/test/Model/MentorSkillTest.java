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
public class MentorSkillTest {
    
    public MentorSkillTest() {
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
    public void testGetMentorSkillID() {
        System.out.println("getMentorSkillID");
        MentorSkill instance = new MentorSkill(1, 1, 1, 1, "description");
        int expResult = 1;
        int result = instance.getMentorSkillID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMentorID() {
        System.out.println("getMentorID");
        MentorSkill instance = new MentorSkill(1, 1, 1, 1, "description");
        int expResult = 1;
        int result = instance.getMentorID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSkillID() {
        System.out.println("getSkillID");
        MentorSkill instance = new MentorSkill(1, 1, 1, 1, "description");
        int expResult = 1;
        int result = instance.getSkillID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetYearOfExp() {
        System.out.println("getYearOfExp");
        MentorSkill instance = new MentorSkill(1, 1, 1, 1, "description");
        int expResult = 1;
        int result = instance.getYearOfExp();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        MentorSkill instance = new MentorSkill(1, 1, 1, 1, "description");
        String expResult = "description";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }
    
}
