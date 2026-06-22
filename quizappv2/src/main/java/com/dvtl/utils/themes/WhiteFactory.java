/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvtl.utils.themes;

import com.dvtl.quizappv2.App;

/**
 *
 * @author Asus
 */
public class WhiteFactory extends ThemesAbstractFactory{

    @Override
    public String getStylesSheet() {
        return App.class.getResource("whitestyle.css").toExternalForm();
    }
    
}
