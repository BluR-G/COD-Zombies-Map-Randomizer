package ca.robert;

import java.util.ArrayList;
import java.util.List;

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



    @FXML void mapDecide(ActionEvent event) {
        List<Game> gameSelected = new ArrayList<Game>();
        MapGenerator generator = new MapGenerator();

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

        List<Map> maps = generator.addMapsToArray(gameSelected);
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
