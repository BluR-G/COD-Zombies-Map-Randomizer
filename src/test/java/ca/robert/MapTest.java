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
        Map map = new Map("test", Game.BLACK_OPS_1, "test");
        String expectedGame = "Black Ops 1";
        String actualGame = map.getGameStr();
        assertEquals(expectedGame, actualGame);
    }

    @Test
    public void testGetGameStrFail() {
        Map map = new Map("test", Game.COLD_WAR, "test");
        String expectedGame = "World at War";
        String actualGame = map.getGameStr();
        assertNotEquals(expectedGame, actualGame);
    }

    @Test
    public void testGetImgSrcFoundImage() {
        String expectedImgSrc = "src/main/resources/ca/robert/img/WAW/Nacht_Der_Untoten_WaW.png";
        Map map = new Map("test", Game.WORLD_AT_WAR, expectedImgSrc);
        assertEquals(expectedImgSrc, map.getImgSrc());
    }

    @Test
    public void testGetImgSrcDefaultImage1() {
        String expectedImgSrc = "src/main/resources/ca/robert/img/UI/default_map_image.jpg";
        Map map = new Map("test", Game.WORLD_AT_WAR, "test");
        assertEquals(expectedImgSrc, map.getImgSrc());
    }

    @Test
    public void testGetImgSrcDefaultImage2() {
        String expectedImgSrc = "src/main/resources/ca/robert/img/UI/default_map_image.jpg";
        Map map = new Map("test", Game.WORLD_AT_WAR, "src/main/resources/ca/robert/img/WAW/");
        assertEquals(expectedImgSrc, map.getImgSrc());
    }
    
}
