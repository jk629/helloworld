package com.nesjn.main;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

    private MainFrame mainFrame;

    public void init(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("/resource/plane.PNG");
        g.drawImage(img.getImage(), 0, 0, 40, 40, this);
    }

}
