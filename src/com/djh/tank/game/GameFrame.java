package com.djh.tank.game;

import javax.swing.*;
import java.awt.*;

/**
 * @author ding
 * @date 2022/6/4 10:02
 */


public class GameFrame extends JFrame {
    public GameFrame(){
        super();
        setVisible(true);
        setTitle("坦克大战");
        setSize(800,900);
        setBackground(Color.GREEN);
        setLocation(((1920-800)/2),(1080-900)/2);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
