/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.banking;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Chriszano Cleophas
 */
public class AccountRunTest {
    
    private Account ac1;
    private Account ac2;
    private Account ac3;
    
    @BeforeEach
    public void setUp() {
        ac1 = new Account();
        ac2 = new Account();
        ac3 = ac1;
    }
    
    @Test
    public void testEquality(){
        
        assertEquals(ac1, ac3);
    }
    
    @Test
    public void testIdentity(){
        assertSame(ac1, ac3);
    }
    
    @Test
    public void failTest(){
        if(ac1 == null){
            fail("Account 1 is null");
        }
        
        try {
      ac1.equals(-1);
      fail("SORRY TRY AGAIN!");
    } catch (IllegalArgumentException e) {
      // handle exception
    }
    }
    
 
    @Test
    public void shouldTimeout_SinceRuleIsPrioritized(int timeout) {
        timeout = 20000;
        sleep(10000);
    }

    private void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            fail("Test Time Out!");
        }
    }
    
    @Disabled("Disable until bugg is fixed")
    @Test
    public void testDisable(){
        assertEquals(ac1, ac3);
    }
    
    
    
}
