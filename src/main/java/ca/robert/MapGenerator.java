package ca.robert;

import java.util.ArrayList;
import java.util.Collections;
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
    worldAtWarMaps.add(new Map("Natch Der Untoten", Game.WORLD_AT_WAR, "src/main/resources/ca/robert/img/WAW/Nacht_Der_Untoten.png"));
    worldAtWarMaps.add(new Map("Verruckt", Game.WORLD_AT_WAR, "src/main/resources/ca/robert/img/WAW/Verruckt.png"));
    worldAtWarMaps.add(new Map("Shi No Numa", Game.WORLD_AT_WAR, "src/main/resources/ca/robert/img/WAW/Shi_No_Numa.png"));
    worldAtWarMaps.add(new Map("Der Riese", Game.WORLD_AT_WAR, "src/main/resources/ca/robert/img/WAW/Der_Riese.png"));
    return worldAtWarMaps;
  }

  private List<Map> addBlackOpsOneMaps() {
    List<Map> blackOpsOneMaps = new ArrayList<Map>();
    blackOpsOneMaps.add(new Map("Kino Der Untoten", Game.BLACK_OPS_1, "src/main/resources/ca/robert/img/BO1/Kino_Der_Toten_BO1.png"));
    blackOpsOneMaps.add(new Map("Five", Game.BLACK_OPS_1, "src/main/resources/ca/robert/img/BO1/Five_BO1.png"));
    blackOpsOneMaps.add(new Map("Ascension", Game.BLACK_OPS_1, "src/main/resources/ca/robert/img/BO1/Ascension_BO1.png"));
    blackOpsOneMaps.add(new Map("Call of the Dead", Game.BLACK_OPS_1, "src/main/resources/ca/robert/img/BO1/Call_of_the_Dead_BO1.png"));
    blackOpsOneMaps.add(new Map("Shangri-La", Game.BLACK_OPS_1, "src/main/resources/ca/robert/img/BO1/Shangri-La_BO1.png"));
    blackOpsOneMaps.add(new Map("Moon", Game.BLACK_OPS_1, "src/main/resources/ca/robert/img/BO1/Moon_BO1.png"));
    blackOpsOneMaps.add(new Map("Natch Der Untoten", Game.BLACK_OPS_1, "src/main/resources/ca/robert/img/WAW/Nacht_Der_Untoten.png"));
    blackOpsOneMaps.add(new Map("Verruckt", Game.BLACK_OPS_1, "src/main/resources/ca/robert/img/WAW/Verruckt.png"));
    blackOpsOneMaps.add(new Map("Shi No Numa", Game.BLACK_OPS_1, "src/main/resources/ca/robert/img/WAW/Shi_No_Numa.png"));
    blackOpsOneMaps.add(new Map("Der Riese", Game.BLACK_OPS_1, "src/main/resources/ca/robert/img/WAW/Der_Riese.png"));
    return blackOpsOneMaps;
  }

  private List<Map> addBlackOpsTwoMaps() {
    List<Map> blackOpsTwoMaps = new ArrayList<Map>();
    blackOpsTwoMaps.add(new Map("TranZit", Game.BLACK_OPS_2, "src/main/resources/ca/robert/img/BO2/Buried_BO2.png"));
    blackOpsTwoMaps.add(new Map("Bus Depot", Game.BLACK_OPS_2, "src/main/resources/ca/robert/img/BO2/Bus_Depot_BO2.png"));
    blackOpsTwoMaps.add(new Map("Farm", Game.BLACK_OPS_2, "src/main/resources/ca/robert/img/BO2/Farm_BO2.png"));
    blackOpsTwoMaps.add(new Map("Town", Game.BLACK_OPS_2, "src/main/resources/ca/robert/img/BO2/Town_BO2.png"));
    blackOpsTwoMaps.add(new Map("Nuketown", Game.BLACK_OPS_2, "src/main/resources/ca/robert/img/BO2/Nuketown_BO2.png"));
    blackOpsTwoMaps.add(new Map("Die Rise", Game.BLACK_OPS_2, "src/main/resources/ca/robert/img/BO2/Die_Rise_BO2.png"));
    blackOpsTwoMaps.add(new Map("Mob of the Dead", Game.BLACK_OPS_2, "src/main/resources/ca/robert/img/BO2/Mob_of_the_Dead_BO2.png"));
    blackOpsTwoMaps.add(new Map("Buried", Game.BLACK_OPS_2, "src/main/resources/ca/robert/img/BO2/Buried_BO2.png"));
    blackOpsTwoMaps.add(new Map("Origins", Game.BLACK_OPS_2,"src/main/resources/ca/robert/img/BO2/Origins_BO2.png"));
    return blackOpsTwoMaps;
  }

  private List<Map> addBlackOpsThreeMaps() {
    List<Map> blackOpsThreeMaps = new ArrayList<Map>();
    blackOpsThreeMaps.add(new Map("Shadows of Evil", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Shadows_of_Evil_BO3.png"));
    blackOpsThreeMaps.add(new Map("The Giant", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/The_Giant_BO3.png"));
    blackOpsThreeMaps.add(new Map("Der Eisendrache", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Der_Eisendrache_BO3.png"));
    blackOpsThreeMaps.add(new Map("Zetsubou No Shima", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Zetsubou_No_Shima_BO3.png"));
    blackOpsThreeMaps.add(new Map("Gorod Krovi", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Gorod_Krovi_BO3.png"));
    blackOpsThreeMaps.add(new Map("Revelations", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Revelations_BO3.png"));
    blackOpsThreeMaps.add(new Map("Nacht Der Untoten", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Nacht_Der_Untoten_BO3.png"));
    blackOpsThreeMaps.add(new Map("Verruckt", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Verruckt_BO3.png"));
    blackOpsThreeMaps.add(new Map("Shi No Numa", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Shi_No_Numa_BO3.png"));
    blackOpsThreeMaps.add(new Map("Kino Der Untoten", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Kino_Der_Untoten_BO3.png"));
    blackOpsThreeMaps.add(new Map("Ascension", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Ascension_BO3.png"));
    blackOpsThreeMaps.add(new Map("Shangri-La", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Shangri_La_BO3.png"));
    blackOpsThreeMaps.add(new Map("Moon", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Moon_BO3.png"));
    blackOpsThreeMaps.add(new Map("Origins", Game.BLACK_OPS_3, "src/main/resources/ca/robert/img/BO3/Origins_BO3.png"));
    return blackOpsThreeMaps;
  }

  private List<Map> addBlackOpsFourMaps() {
    List<Map> blackOpsFourMaps = new ArrayList<Map>();
    blackOpsFourMaps.add(new Map("Voyage of Despair", Game.BLACK_OPS_4, "src/main/resources/ca/robert/img/BO4/Voyage_of_Despair_BO4.png"));
    blackOpsFourMaps.add(new Map("IX", Game.BLACK_OPS_4, "src/main/resources/ca/robert/img/BO4/IX_BO4.png"));
    blackOpsFourMaps.add(new Map("Blood of the Dead", Game.BLACK_OPS_4, "src/main/resources/ca/robert/img/BO4/Blood_of_the_Dead_BO4.png"));
    blackOpsFourMaps.add(new Map("Classified", Game.BLACK_OPS_4, "src/main/resources/ca/robert/img/BO4/Classified_BO4.png"));
    blackOpsFourMaps.add(new Map("Dead of the Night", Game.BLACK_OPS_4, "src/main/resources/ca/robert/img/BO4/Dead_of_the_Night_BO4.png"));
    blackOpsFourMaps.add(new Map("Ancient Evil", Game.BLACK_OPS_4, "src/main/resources/ca/robert/img/BO4/Ancient_Evil_BO4.png"));
    blackOpsFourMaps.add(new Map("Alpha Omega", Game.BLACK_OPS_4, "src/main/resources/ca/robert/img/BO4/Alpha_Omega_BO4.png"));
    blackOpsFourMaps.add(new Map("Tag Der Toten", Game.BLACK_OPS_4, "src/main/resources/ca/robert/img/BO4/Tag_Der_Toten_BO4.png"));
    return blackOpsFourMaps;
  }

  private List<Map> addColdWarMaps() {
    List<Map> coldWarMaps = new ArrayList<Map>();
    coldWarMaps.add(new Map("Die Maschine", Game.COLD_WAR, "src/main/resources/ca/robert/img/CW/Die_Maschine_CW.png"));
    coldWarMaps.add(new Map("Firebase Z", Game.COLD_WAR, "src/main/resources/ca/robert/img/CW/Firebase_Z_CW.png"));
    coldWarMaps.add(new Map("Outbreak", Game.COLD_WAR, "src/main/resources/ca/robert/img/CW/Outbreak_CW.png"));
    coldWarMaps.add(new Map("Mauer Der Toten", Game.COLD_WAR, "src/main/resources/ca/robert/img/CW/Mauer_Der_Toten_CW.png"));
    coldWarMaps.add(new Map("Forsaken", Game.COLD_WAR, "src/main/resources/ca/robert/img/CW/Forsaken_CW.png"));
    return coldWarMaps;
  }
}
