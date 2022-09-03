package ca.robert;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import ca.robert.CallOfDuty.Game;

public class MapGenerator {
  public List<Map> addMapsToArray(List<Game> gameSelected){
    List<Map> maps = new LinkedList<Map>();
    for(Game game : gameSelected){
      switch(game){
        case WORLD_AT_WAR:
          maps.addAll(addWorldAtWarMaps());
          break;
        case BLACK_OPS_1:
          break;
        case BLACK_OPS_2:
          break;
        case BLACK_OPS_3:
          break;
        case BLACK_OPS_4:
          break;
        case COLD_WAR:
          break;
        default:
          throw new IllegalArgumentException("Non Appropiate Game Selection");

      }

    }
    return null;

  }

  private List<Map> addWorldAtWarMaps() {
    List<Map> worldAtWarMaps = new LinkedList<Map>();
    worldAtWarMaps.add(new Map("Natch Der Untoten", Game.WORLD_AT_WAR));
    worldAtWarMaps.add(new Map("Verruckt", Game.WORLD_AT_WAR));
    worldAtWarMaps.add(new Map("Shi No Numa", Game.WORLD_AT_WAR));
    worldAtWarMaps.add(new Map("Der Riese", Game.WORLD_AT_WAR));
    return worldAtWarMaps;
  }
}
