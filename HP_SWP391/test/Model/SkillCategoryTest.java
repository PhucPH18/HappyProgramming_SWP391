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
public class SkillCategoryTest {
    
    public SkillCategoryTest() {
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
    public void testGetSkillID() {
        System.out.println("getSkillID");
        SkillCategory instance = new SkillCategory(1, "C", true);
        int expResult = 1;
        int result = instance.getSkillID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSkillName() {
        System.out.println("getSkillName");
        SkillCategory instance = new SkillCategory(1, "C", true);
        String expResult = "C";
        String result = instance.getSkillName();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        SkillCategory instance = new SkillCategory(1, "C", true);
        boolean expResult = true;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
    }
    
}
