/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.assignment.pkg3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abdul
 */
public class STAssignment3Test {
    

    @Before
    public void beforeDisplay() {
        System.out.println("Function are being tested.");
    }
    
    @After
    public void afterDisplay() {
        System.out.println("Function are successfully tested.");
    }

    /**
     * Test of caluculateKDA method, of class STAssignment3.
     */
    @Test
    public void testCaluculateKDA() {
        System.out.println("caluculateKDA");
       
        float result1 = STAssignment3.caluculateKDA(14,0,11 );
        float result2 = STAssignment3.caluculateKDA(25,8 ,13 );
        float result3 = STAssignment3.caluculateKDA(12,3 ,15);
        float result4 = STAssignment3.caluculateKDA(10,10 ,5 );
        float result5 = STAssignment3.caluculateKDA(20,2 ,-1 );
        float result6 = STAssignment3.caluculateKDA(35,4 ,6 );
        float result7 = STAssignment3.caluculateKDA(30,-1 ,8 );
        float result8 = STAssignment3.caluculateKDA(28,0 ,7 );
        float result9 = STAssignment3.caluculateKDA(29,5 , 9);
        
        assertEquals("Invalid Range",0.0, result1, 0.0);
        assertEquals("Invalid Range",0.0, result2, 0.0);
        assertEquals("Invalid Range",0.0, result3, 0.0);
        assertEquals("Invalid Range",0.0, result4, 0.0);
        assertEquals("Invalid Range",0.0, result5, 0.0);
        assertEquals("Invalid Range",0.0, result6, 0.0);
        assertEquals("Invalid Range",0.0, result7, 0.0);
        assertEquals("Invalid Range",0.0, result8, 0.0);
        assertEquals("KDA Calculated",7.0, result9, 0.0);
        
    }

    /**
     * Test of baronDragonRatio method, of class STAssignment3.
     */
    @Test
    public void testBaronDragonRatio() {
        System.out.println("baronDragonRatio");

        float result1 = STAssignment3.baronDragonRatio(-1, 5);
        float result2 = STAssignment3.baronDragonRatio(2, -1);
        float result3 = STAssignment3.baronDragonRatio(4, 3);
        float result4 = STAssignment3.baronDragonRatio(2, 4);
     
              
        assertEquals("Invalid Range",0.0, result1, 0.0);
        assertEquals("Invalid Range",0.0, result2, 0.0);
        assertEquals("Invalid Range",0.0, result3, 0.0);
        assertEquals("BaronDragon ratio calculated",3.0, result4, 0.0);
        
      
    }

    /**
     * Test of rankCalculation method, of class STAssignment3.
     */
    @Test
    public void testRankCalculation() {
        System.out.println("rankCalculation");
       
        boolean result1 = STAssignment3.rankCalculation(5, 4);
        boolean result2 = STAssignment3.rankCalculation(15, 5);
        boolean result3 = STAssignment3.rankCalculation(2, 2);
        boolean result4 = STAssignment3.rankCalculation(20, 3);
        assertEquals("Invalid Range",false, result1);
        assertEquals("Invalid Range",false, result2);
        assertEquals("Invalid Range",false, result3);
        assertEquals("Rank Calculated And Displayed",true, result4);
      
    }
}
