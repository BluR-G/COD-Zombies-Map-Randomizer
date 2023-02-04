package ca.robert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ca.robert.CallOfDuty.Game;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BaseController {

    @FXML
    Button btnDecider;
    @FXML
    CheckBox ckbBlackOpsFour;
    @FXML
    CheckBox ckbBlackOpsOne;
    @FXML
    CheckBox ckbBlackOpsThree;
    @FXML
    CheckBox ckbBlackOpsTwo;
    @FXML
    CheckBox ckbColdWar;
    @FXML
    CheckBox ckbWorldAtWar;
    @FXML
    ImageView mapImageView;
    @FXML
    TextField mapName;

    @FXML
    void mapDecide(ActionEvent event) throws InterruptedException {

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                setAllNodes(true);
                mapName.setStyle("-fx-text-fill: black;");
                List<Game> gameSelected = new ArrayList<Game>();
                MapGenerator generator = new MapGenerator();
                Random rand = new Random();

                addMapsToList(gameSelected);
                try {
                    int mapsIndex = 0;
                    List<Map> maps = generator.addMapsToArray(gameSelected);
                    if (!maps.isEmpty()) {
                        int finalIndex = rand.nextInt(maps.size());

                        int iFrame = 0;
                        int[] delayAdd = { 0, 30, 70, 130 };
                        int[] delayDuration = { 150, 30, 20, 10 };
                        int dAPos = 0;
                        int initialDelay = 20;

                        while (dAPos < 4) {
                            mapsIndex = postMap(mapsIndex, maps);

                            Thread.sleep(initialDelay + delayAdd[dAPos]);
                            if (iFrame++ > delayDuration[dAPos]) {
                                dAPos++;
                                iFrame = 0;
                            }

                        }
                        Map finalMap = maps.get(finalIndex);
                        FileInputStream finalMapImageStream = new FileInputStream(finalMap.getImgSrc());
                        Image finalMapImage = new Image(finalMapImageStream);
                        
                        Platform.runLater(() -> {
                            mapName.setText(finalMap.getMap() + " (" + finalMap.getGameStr() + ")");
                            mapImageView.setImage(finalMapImage);
                            setAllNodes(false);
                            mapName.setStyle("-fx-text-fill: green;");
                        });
                    }



                } catch (Exception e) {
                    e.printStackTrace();
                    setAllNodes(false);
                    mapName.setText("");
                }
            }

        });
        t.start();

    }

    private void addMapsToList(List<Game> gameSelected) {
        if (ckbWorldAtWar.isSelected()) {
            gameSelected.add(Game.WORLD_AT_WAR);
        }
        if (ckbBlackOpsOne.isSelected()) {
            gameSelected.add(Game.BLACK_OPS_1);
        }
        if (ckbBlackOpsTwo.isSelected()) {
            gameSelected.add(Game.BLACK_OPS_2);
        }
        if (ckbBlackOpsThree.isSelected()) {
            gameSelected.add(Game.BLACK_OPS_3);
        }
        if (ckbBlackOpsFour.isSelected()) {
            gameSelected.add(Game.BLACK_OPS_4);
        }
        if (ckbBlackOpsFour.isSelected()) {
            gameSelected.add(Game.COLD_WAR);
        }
    }

    private void setAllNodes(boolean condition) {
        btnDecider.setDisable(condition);
        ckbBlackOpsFour.setDisable(condition);
        ckbBlackOpsOne.setDisable(condition);
        ckbBlackOpsThree.setDisable(condition);
        ckbBlackOpsTwo.setDisable(condition);
        ckbColdWar.setDisable(condition);
        ckbWorldAtWar.setDisable(condition);
    }

    private int postMap(int index, List<Map> maps) throws FileNotFoundException {
        if (index >= maps.size()) {
            index = 0;
        }
        Map map = maps.get(index);
        index++;
        FileInputStream mapImageStream = new FileInputStream(map.getImgSrc());
        Image mapImage = new Image(mapImageStream);
        mapImageView.setImage(mapImage);
        Platform.runLater(() -> {
            mapName.setText(map.getMap());
        });

        return index;
    }

    @FXML
    void enableButton(ActionEvent event) {
        CheckBox[] ckbArr = new CheckBox[] { ckbWorldAtWar, ckbBlackOpsOne, ckbBlackOpsTwo, ckbBlackOpsThree,
                ckbBlackOpsFour, ckbColdWar };
        boolean isChecked = false;

        for (CheckBox ckb : ckbArr) {
            if (ckb.isSelected()) {
                btnDecider.setDisable(false);
                isChecked = true;
                break;
            }
        }
        if (!isChecked) {
            btnDecider.setDisable(true);
        }
    }
}
