package com.nesjn.main;

import javax.swing.JFrame;

public class MainFrame extends JFrame  {

    /**
     * initialized
     */
    public void init() {
        // 设置标题
        this.setTitle("game screen");
        // 设置窗体大小
        this.setSize(500, 500);
        // 设置布局
        this.setLayout(null);
        // 设置窗体关闭程序自动关闭
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 设置窗体居中显示
        this.setLocationRelativeTo(null);
        // 添加主面板
        MainPanel mainJpanel = new MainPanel();
        mainJpanel.init(this);
        // 设置面板大小
        mainJpanel.setBounds(0, 0, 500, 500);
        // 设置主面板可见
        this.add(mainJpanel);
        // 设置窗体可见
        this.setVisible(true);
    }
}
