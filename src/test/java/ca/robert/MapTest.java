/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.robert;

import org.junit.Test;

import ca.robert.CallOfDuty.Game;

import static org.junit.Assert.*;

/**
 *
 * @author Robert
 */
public class MapTest {
    
    public MapTest() {
    }


    @Test
    public void testGetGameStrPass() {
        Map map = new Map("test", Game.BLACK_OPS_1);
        String expectedGame = "Black Ops 1";
        String actualGame = map.getGameStr();
        assertEquals(expectedGame, actualGame);
    }

    @Test
    public void testGetGameStrFail() {
        Map map = new Map("test", Game.COLD_WAR);
        String expectedGame = "World at War";
        String actualGame = map.getGameStr();
        assertNotEquals(expectedGame, actualGame);
    }
    
}
