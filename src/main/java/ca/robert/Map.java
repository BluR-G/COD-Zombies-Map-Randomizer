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

  public String getGameStr() {
    switch(game){
      case WORLD_AT_WAR:
        return "World at War";
      case BLACK_OPS_1:
        return "Black Ops 1";
      case BLACK_OPS_2:
        return "Black Ops 2";
      case BLACK_OPS_3:
        return "Black Ops 3";
      case BLACK_OPS_4:
        return "Black Ops 4";
      case COLD_WAR:
        return "Cold War";
      default:
        throw new IllegalArgumentException("Non Appropiate Game Selection");
    }
  }

}
