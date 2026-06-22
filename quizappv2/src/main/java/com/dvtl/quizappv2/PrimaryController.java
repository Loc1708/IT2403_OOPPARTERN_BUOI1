package com.dvtl.quizappv2;

import com.dvtl.utils.MyAlert;
import com.dvtl.utils.themes.DarkFactory;
import com.dvtl.utils.themes.ManagerThemes;
import static com.dvtl.utils.themes.ManagerThemes.DARK;
import static com.dvtl.utils.themes.ManagerThemes.LIGHT;
import com.dvtl.utils.themes.QuanLyThemes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{

    @FXML private ComboBox<ManagerThemes> cbThemes;
    
      @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ManagerThemes.values()));
        
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
   public void changeTheme(ActionEvent e){
       this.cbThemes.getSelectionModel().getSelectedItem().updateThemes(this.cbThemes.getScene());
     
   }
  
}

  

