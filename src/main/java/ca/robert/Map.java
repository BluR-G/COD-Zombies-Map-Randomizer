package ca.robert;

import java.io.File;

import ca.robert.CallOfDuty.Game;

public class Map {
  private String map;
  private String imgSrc;
  private Game game;

  public Map(String map, Game game, String imgSrc) {
    this.map = map;
    this.game = game;
    String validatedImgStr = doesImageExist(imgSrc);
    this.imgSrc = validatedImgStr;
  }

  private String doesImageExist(String imgSrc) {
    File mapFile = new File(imgSrc);
    if (!mapFile.exists() || mapFile.isDirectory()) {
      String defaultImageSrc = "src/main/resources/ca/robert/img/UI/default_map_image.jpg";
      File defaultImageFile = new File(defaultImageSrc);
      if (!defaultImageFile.exists() || defaultImageFile.isDirectory()) {
        throw new IllegalArgumentException("File doesn't exist");
      }
      imgSrc = defaultImageSrc;
    }
    return imgSrc;
  }

  public String getMap() {
    return map;
  }

  public Game getGame() {
    return game;
  }

  public String getImgSrc() {
    return imgSrc;
  }

  public String getGameStr() {
    switch (game) {
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
