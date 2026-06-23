/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvtl.utils;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import com.dvtl.quizappv2.App;
import com.dvtl.utils.themes.QuanLyThemes;
import com.dvtl.utils.themes.ThemesAbstractFactory;
import java.io.IOException;
import javafx.scene.Scene;
/**
 *
 * @author admin
 */
public class MyStageSingleton {
    private static MyStageSingleton instance;
    private final Stage stage;
    private MyStageSingleton(){
        this.stage= new Stage();
        this.stage.setTitle("Quiz App");
    }
    public static MyStageSingleton getInstance(){
        if(instance==null) return instance = new MyStageSingleton();
        return instance;
    }
    public void showStage(String fxml){
        if(!this.stage.isShowing()){
            try {
                Scene scene = new Scene(new FXMLLoader(App.class.getResource(fxml + ".fxml")).load());
                
                
                QuanLyThemes.applyTheme(scene);
                
                this.stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
