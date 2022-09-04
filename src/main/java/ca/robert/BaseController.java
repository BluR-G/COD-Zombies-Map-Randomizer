package ca.robert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ca.robert.CallOfDuty.Game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class BaseController {

    @FXML private Button btnDecider;
    @FXML private CheckBox ckbBlackOpsFour;
    @FXML private CheckBox ckbBlackOpsOne;
    @FXML private CheckBox ckbBlackOpsThree;
    @FXML private CheckBox ckbBlackOpsTwo;
    @FXML private CheckBox ckbColdWar;
    @FXML private CheckBox ckbWorldAtWar;
    @FXML private ImageView mapImageView;
    @FXML private TextField mapName;



    @FXML void mapDecide(ActionEvent event) throws InterruptedException {
        btnDecider.setDisable(true);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                mapName.setStyle("-fx-text-fill: black;");
                List<Game> gameSelected = new ArrayList<Game>();
                MapGenerator generator = new MapGenerator();
                Random rand = new Random();
                

                if(ckbWorldAtWar.isSelected()){
                    gameSelected.add(Game.WORLD_AT_WAR);
                } 
                if(ckbBlackOpsOne.isSelected()){
                    gameSelected.add(Game.BLACK_OPS_1);
                }
                if(ckbBlackOpsTwo.isSelected()){
                    gameSelected.add(Game.BLACK_OPS_2);
                }
                if(ckbBlackOpsThree.isSelected()){
                    gameSelected.add(Game.BLACK_OPS_3);
                }
                if(ckbBlackOpsFour.isSelected()){
                    gameSelected.add(Game.BLACK_OPS_4);
                }
                if(ckbBlackOpsFour.isSelected()){
                    gameSelected.add(Game.COLD_WAR);
                }
                int index = 0;
                List<Map> maps = generator.addMapsToArray(gameSelected);
                int finalIndex = rand.nextInt(maps.size());
                for(int i = 0; i < 150; i++){
                    index = postMap(index, maps);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("Info: i: "+ i + ", index" + index + "");
                    }
                }
                for(int i = 0; i < 30; i++){
                    index = postMap(index, maps);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("Info: i: "+ i + ", index" + index + "");
                    }
                }
                for(int i = 0; i < 20; i++){
                    index = postMap(index, maps);
                    try {
                        Thread.sleep(90);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("Info: i: "+ i + ", index" + index + "");
                    }
                }
                for(int i = 0; i < 10; i++){
                    index = postMap(index, maps);
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("Info: i: "+ i + ", index" + index + "");
                    }
                }

                Map finalMap = maps.get(finalIndex);
                mapName.setText(finalMap.getMap() + " (" + finalMap.getGameStr() + ")");
                btnDecider.setDisable(false);
                mapName.setStyle("-fx-text-fill: green;");
            }

            private int postMap(int index, List<Map> maps) {
                if(index >= maps.size()){
                    index = 0;
                }
                Map map = maps.get(index);
                index++;
                mapName.setText(map.getMap());
                return index;
            }
            
        });
        t.start();
        

    }

    @FXML void enableButton(ActionEvent event) {
        CheckBox[] ckbArr = new CheckBox[] {ckbWorldAtWar, ckbBlackOpsOne, ckbBlackOpsTwo,ckbBlackOpsThree,ckbBlackOpsFour,ckbColdWar};
        boolean isChecked = false;

        for(CheckBox ckb : ckbArr){
            if(ckb.isSelected()){
                btnDecider.setDisable(false);
                isChecked = true;
                break;
            }
        } 
        if(!isChecked){
            btnDecider.setDisable(true);
        }
    }
}
