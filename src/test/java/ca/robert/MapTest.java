/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.robert;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robert
 */
public class MapTest {
    
    public MapTest() {
    }

    /**
     * Test of getMap method, of class Map.
     */
    @Test
    public void testGetMap() {
        System.out.println("getMap");
        Map instance = null;
        String expResult = "";
        String result = instance.getMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGame method, of class Map.
     */
    @Test
    public void testGetGame() {
        System.out.println("getGame");
        Map instance = null;
        CallOfDuty.Game expResult = null;
        CallOfDuty.Game result = instance.getGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameStr method, of class Map.
     */
    @Test
    public void testGetGameStr() {
        System.out.println("getGameStr");
        Map instance = null;
        String expResult = "";
        String result = instance.getGameStr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
