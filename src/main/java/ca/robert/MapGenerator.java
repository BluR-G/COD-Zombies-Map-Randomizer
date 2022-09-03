package ca.robert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import ca.robert.CallOfDuty.Game;

public class MapGenerator {
  public List<Map> addMapsToArray(List<Game> gameSelected){
    List<Map> maps = new ArrayList<Map>();
    for(Game game : gameSelected){
      switch(game){
        case WORLD_AT_WAR:
          maps.addAll(addWorldAtWarMaps());
          break;
        case BLACK_OPS_1:
          maps.addAll(addBlackOpsOneMaps());
          break;
        case BLACK_OPS_2:
          maps.addAll(addBlackOpsTwoMaps());
          break;
        case BLACK_OPS_3:
          maps.addAll(addBlackOpsThreeMaps());
          break;
        case BLACK_OPS_4:
          maps.addAll(addBlackOpsFourMaps());
          break;
        case COLD_WAR:
          maps.addAll(addColdWarMaps());
          break;
        default:
          throw new IllegalArgumentException("Non Appropiate Game Selection");
      }
    }
    Collections.shuffle(maps);
    return maps;

  }

  private List<Map> addWorldAtWarMaps() {
    List<Map> worldAtWarMaps = new ArrayList<Map>();
    worldAtWarMaps.add(new Map("Natch Der Untoten", Game.WORLD_AT_WAR));
    worldAtWarMaps.add(new Map("Verruckt", Game.WORLD_AT_WAR));
    worldAtWarMaps.add(new Map("Shi No Numa", Game.WORLD_AT_WAR));
    worldAtWarMaps.add(new Map("Der Riese", Game.WORLD_AT_WAR));
    return worldAtWarMaps;
  }

  private List<Map> addBlackOpsOneMaps() {
    List<Map> blackOpsOneMaps = new ArrayList<Map>();
    blackOpsOneMaps.add(new Map("Kino Der Untoten", Game.BLACK_OPS_1));
    blackOpsOneMaps.add(new Map("Five", Game.BLACK_OPS_1));
    blackOpsOneMaps.add(new Map("Ascension", Game.BLACK_OPS_1));
    blackOpsOneMaps.add(new Map("Call of the Dead", Game.BLACK_OPS_1));
    blackOpsOneMaps.add(new Map("Shangri-La", Game.BLACK_OPS_1));
    blackOpsOneMaps.add(new Map("Moon", Game.BLACK_OPS_1));
    blackOpsOneMaps.add(new Map("Natch Der Untoten", Game.BLACK_OPS_1));
    blackOpsOneMaps.add(new Map("Verruckt", Game.BLACK_OPS_1));
    blackOpsOneMaps.add(new Map("Shi No Numa", Game.BLACK_OPS_1));
    blackOpsOneMaps.add(new Map("Der Riese", Game.BLACK_OPS_1));
    return blackOpsOneMaps;
  }

  private List<Map> addBlackOpsTwoMaps() {
    List<Map> blackOpsTwoMaps = new ArrayList<Map>();
    blackOpsTwoMaps.add(new Map("TranZit", Game.BLACK_OPS_2));
    blackOpsTwoMaps.add(new Map("Bus Depot", Game.BLACK_OPS_2));
    blackOpsTwoMaps.add(new Map("Farm", Game.BLACK_OPS_2));
    blackOpsTwoMaps.add(new Map("Town", Game.BLACK_OPS_2));
    blackOpsTwoMaps.add(new Map("Nuketown", Game.BLACK_OPS_2));
    blackOpsTwoMaps.add(new Map("Die Rise", Game.BLACK_OPS_2));
    blackOpsTwoMaps.add(new Map("Mob of the Dead", Game.BLACK_OPS_2));
    blackOpsTwoMaps.add(new Map("Buried", Game.BLACK_OPS_2));
    blackOpsTwoMaps.add(new Map("Origins", Game.BLACK_OPS_2));
    return blackOpsTwoMaps;
  }

  private List<Map> addBlackOpsThreeMaps() {
    List<Map> blackOpsThreeMaps = new ArrayList<Map>();
    blackOpsThreeMaps.add(new Map("Shadows of Evil", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("The Giant", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Der Eisendrache", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Zetsubou No Shima", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Revelations", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Nacht Der Untoten", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Verruckt", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Shi No Numa", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Kino Der Untoten", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Ascension", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Shangri La", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Moon", Game.BLACK_OPS_3));
    blackOpsThreeMaps.add(new Map("Origins", Game.BLACK_OPS_3));
    return blackOpsThreeMaps;
  }

  private List<Map> addBlackOpsFourMaps() {
    List<Map> blackOpsFourMaps = new ArrayList<Map>();
    blackOpsFourMaps.add(new Map("Voyage of Despair", Game.BLACK_OPS_4));
    blackOpsFourMaps.add(new Map("IX", Game.BLACK_OPS_4));
    blackOpsFourMaps.add(new Map("Blood of the Dead", Game.BLACK_OPS_4));
    blackOpsFourMaps.add(new Map("Classified", Game.BLACK_OPS_4));
    blackOpsFourMaps.add(new Map("Dead of the Night", Game.BLACK_OPS_4));
    blackOpsFourMaps.add(new Map("Ancient Evil", Game.BLACK_OPS_4));
    blackOpsFourMaps.add(new Map("Alpha Omega", Game.BLACK_OPS_4));
    blackOpsFourMaps.add(new Map("Tag Der Toten", Game.BLACK_OPS_4));
    return blackOpsFourMaps;
  }

  private List<Map> addColdWarMaps() {
    List<Map> coldWarMaps = new ArrayList<Map>();
    coldWarMaps.add(new Map("Die Maschine", Game.COLD_WAR));
    coldWarMaps.add(new Map("Firebase Z", Game.COLD_WAR));
    coldWarMaps.add(new Map("Outbreak", Game.COLD_WAR));
    coldWarMaps.add(new Map("Mauer Der Toten", Game.COLD_WAR));
    coldWarMaps.add(new Map("Forsaken", Game.COLD_WAR));
    return coldWarMaps;
  }
}
