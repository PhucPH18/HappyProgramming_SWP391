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
public class RatingTest {
    
    public RatingTest() {
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
    public void testGetRateID() {
        System.out.println("getRateID");
        Rating instance = new Rating(1, "comment", 1, 1, 1);
        int expResult = 1;
        int result = instance.getRateID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetComment() {
        System.out.println("getComment");
        Rating instance = new Rating(1, "comment", 1, 1, 1);
        String expResult = "comment";
        String result = instance.getComment();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetStar() {
        System.out.println("getStar");
        Rating instance = new Rating(1, "comment", 1, 1, 1);
        int expResult = 1;
        int result = instance.getStar();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMenteeID() {
        System.out.println("getMenteeID");
        Rating instance = new Rating(1, "comment", 1, 1, 1);
        int expResult = 1;
        int result = instance.getMenteeID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMentorID() {
        System.out.println("getMentorID");
        Rating instance = new Rating(1, "comment", 1, 1, 1);
        int expResult = 1;
        int result = instance.getMentorID();
        assertEquals(expResult, result);
    }
    
}
