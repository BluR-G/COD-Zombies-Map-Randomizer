/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.robert;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robert
 */
public class MapGeneratorTest {
    
    public MapGeneratorTest() {
    }

    /**
     * Test of addMapsToArray method, of class MapGenerator.
     */
    @Test
    public void testAddMapsToArray() {
        System.out.println("addMapsToArray");
        List<CallOfDuty.Game> gameSelected = null;
        MapGenerator instance = new MapGenerator();
        List<Map> expResult = null;
        List<Map> result = instance.addMapsToArray(gameSelected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
