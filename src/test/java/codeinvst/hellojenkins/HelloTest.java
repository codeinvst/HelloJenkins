/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeinvst.hellojenkins;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cam
 */
public class HelloTest {
    
    public HelloTest() {
    }

    @Test
    public void testGetMsg() {
        assertNotNull(Hello.getMsg());
    }
    
}
