/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import java.sql.Date;
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
public class RequestTest {
    
    public RequestTest() {
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
    public void testGetRequestID() {
        System.out.println("getRequestID");
        Request instance = new Request(1, 1, 1, Date.valueOf("2002-01-01"),
                0, "link", "title", "content",1);
        int expResult = 1;
        int result = instance.getRequestID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMentorID() {
        System.out.println("getMentorID");
        Request instance = new Request(1, 1, 1, Date.valueOf("2002-01-01"),
                0, "link", "title", "content",1);
        int expResult = 1;
        int result = instance.getMentorID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMenteeID() {
        System.out.println("getMenteeID");
        Request instance = new Request(1, 1, 1, Date.valueOf("2002-01-01"),
                0, "link", "title", "content",1);
        int expResult = 1;
        int result = instance.getMenteeID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Request instance = new Request(1, 1, 1, Date.valueOf("2002-01-01"),
                0, "link", "title", "content",1);
        Date expResult = Date.valueOf("2002-01-01");
        Date result = instance.getDate();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Request instance = new Request(1, 1, 1, Date.valueOf("2002-01-01"),
                0, "link", "title", "content",1);
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLink() {
        System.out.println("getLink");
        Request instance = new Request(1, 1, 1, Date.valueOf("2002-01-01"),
                0, "link", "title", "content",1);
        String expResult = "link";
        String result = instance.getLink();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Request instance = new Request(1, 1, 1, Date.valueOf("2002-01-01"),
                0, "link", "title", "content",1);
        String expResult = "title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetContent() {
        System.out.println("getContent");
        Request instance = new Request(1, 1, 1, Date.valueOf("2002-01-01"),
                0, "link", "title", "content",1);
        String expResult = "content";
        String result = instance.getContent();
        assertEquals(expResult, result);
    }
    
}
