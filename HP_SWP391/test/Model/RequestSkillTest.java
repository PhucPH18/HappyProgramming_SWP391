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
public class RequestSkillTest {
    
    public RequestSkillTest() {
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
    public void testGetRequestSkillID() {
        System.out.println("getRequestSkillID");
        RequestSkill instance = new RequestSkill(1,1,1);
        int expResult = 1;
        int result = instance.getRequestSkillID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRequestID() {
        System.out.println("getRequestID");
        RequestSkill instance = new RequestSkill(1,1,1);
        int expResult = 1;
        int result = instance.getRequestID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSkillID() {
        System.out.println("getSkillID");
        RequestSkill instance = new RequestSkill(1,1,1);
        int expResult = 1;
        int result = instance.getSkillID();
        assertEquals(expResult, result);
    }

}
