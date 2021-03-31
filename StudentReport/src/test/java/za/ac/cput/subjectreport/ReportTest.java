/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.subjectreport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Beverley
 */

public class ReportTest {
    
    Report edrico = null;
    Report edrico2 = null;
    public ReportTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        edrico = new Report();
        edrico2 = new Report();
        edrico = edrico2;
    }
    
    @AfterEach
    public void tearDown() {
    }
       
    @Test
    public void equalityTest(){
        assertEquals(edrico, edrico2);
    }

    @Test
    public void identityTest(){

        assertSame(edrico, edrico2);
    }

    //failing test    
    @Test
    public void CellNumberVerifier(){
    
       boolean result = edrico.CellNumberVerifier("a0812831764");
       assertEquals(true, result);
    }
    
    public void timeoutTest()
    {
        
    }

    @Test
    @Disabled
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
}
