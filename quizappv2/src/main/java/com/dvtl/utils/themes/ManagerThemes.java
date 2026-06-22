/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.dvtl.utils.themes;

import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public enum ManagerThemes {
    DEFAULT {
        @Override
        public void updateThemes(Scene scene) {
             QuanLyThemes.setTheme(new DefaultFactory());
               QuanLyThemes.applyTheme(scene);
        }
    }, DARK {
        @Override
        public void updateThemes(Scene scene) {
             QuanLyThemes.setTheme(new DarkFactory());
               QuanLyThemes.applyTheme(scene);
        }
    },LIGHT {
        @Override
        public void updateThemes(Scene scene) {
             QuanLyThemes.setTheme(new WhiteFactory());
               QuanLyThemes.applyTheme(scene);
        }
    };
    public abstract void updateThemes(Scene scene);
}
