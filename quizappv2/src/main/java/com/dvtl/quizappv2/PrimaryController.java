package com.dvtl.quizappv2;

import com.dvtl.utils.MyAlert;
import com.dvtl.utils.themes.ManagerThemes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{

    @FXML private ComboBox<ManagerThemes> cbThemes;
      @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void managQuestions(ActionEvent e){
        MyAlert.getInstance().showAlert("coming soon");
    }
   public void practice(ActionEvent e){
       MyAlert.getInstance().showAlert("coming soon");
   }
   public void exam(ActionEvent e){
       MyAlert.getInstance().showAlert("coming soon");
   }

  
    

  
}
