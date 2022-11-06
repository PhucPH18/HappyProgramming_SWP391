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
public class UserTest {
    
    public UserTest() {
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
    public void testGetUserID() {
        System.out.println("getUserID");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        int expResult = 1;
        int result = instance.getUserID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        String expResult = "phucph";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFullname() {
        System.out.println("getFullname");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        String expResult = "Pham Hong Phuc";
        String result = instance.getFullname();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsGender() {
        System.out.println("isGender");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        boolean expResult = true;
        boolean result = instance.isGender();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        String expResult = "0128376291";
        String result = instance.getPhone();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        String expResult = "phucph@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDob() {
        System.out.println("getDob");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        Date expResult = Date.valueOf("2002-12-16");
        Date result = instance.getDob();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        String expResult = "Hai Phong";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        boolean expResult = true;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRole() {
        System.out.println("getRole");
        User instance = new User(1, "phucph", "123", "Pham Hong Phuc", true, "0128376291",
            "phucph@gmail.com", Date.valueOf("2002-12-16"), "Hai Phong", true,0);
        int expResult = 0;
        int result = instance.getRole();
        assertEquals(expResult, result);
    }

}
