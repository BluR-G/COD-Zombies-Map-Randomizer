package ca.robert;

import ca.robert.CallOfDuty.Game;

public class Map {
  private String map;
  private Game game;

  
  public Map(String map, Game game) {
    this.map = map;
    this.game = game;
  }

  public String getMap() {
    return map;
  }

  public Game getGame() {
    return game;
  }

}
