package ca.robert;

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

    }

    @FXML void enableButton(ActionEvent event) {
        boolean isChecked = false;
        CheckBox[] ckbArr = new CheckBox[]
        {ckbWorldAtWar, ckbBlackOpsOne, ckbBlackOpsTwo,ckbBlackOpsThree,ckbBlackOpsFour,ckbColdWar};

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

    public void load() {

    }

}
