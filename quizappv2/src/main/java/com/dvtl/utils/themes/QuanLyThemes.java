/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvtl.utils.themes;

import com.dvtl.quizappv2.App;
import javafx.scene.Scene;

/**
 *
 * @author Asus
 */
public class QuanLyThemes {
    private static ThemesAbstractFactory theme = new DefaultFactory();

   
    public static void setTheme(ThemesAbstractFactory aTheme) {
        theme = aTheme;
    }
    public static void applyTheme(Scene scene){
         scene.getRoot().getStylesheets().clear();
              scene.getRoot().getStylesheets().add(theme.getStylesSheet());
    }
            
}
