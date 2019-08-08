package com.nesjn.main;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MainIconLoad {

    public static Image getIcon(String name) {
        return new ImageIcon(name).getImage();
    }

}
