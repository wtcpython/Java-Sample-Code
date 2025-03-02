package com.wtc.landlord;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PokerCard extends JLabel implements MouseListener {
    // 游戏主界面
    GameJFrame gameJFrame;
    // 牌名
    String name;
    // 牌面显示是正面还是反面
    boolean isup;
    // 是否可点击
    boolean isClickEnabled = false;
    // 点击状态
    boolean clicked = false;

    public PokerCard() {
    }

    public PokerCard(GameJFrame gameJFrame, String name, boolean isup) {
        this.gameJFrame = gameJFrame;
        this.name = name;
        this.isup = isup;
        flipCard(isup);

        this.setSize(71, 96);
        this.setVisible(true);
        this.addMouseListener(this);
    }

    // 显示牌面，isup 决定是否为正面
    public void flipCard(boolean isup) {
        if (isup) {
            this.setIcon(new ImageIcon("./image/poker/" + name + ".png"));
        } else {
            this.setIcon(new ImageIcon("./image/poker/rear.png"));
        }
        this.isup = isup;
    }

    // 点击牌时，向上移 20 像素
    // 再次点击，下降 20 像素
    @Override
    public void mouseClicked(MouseEvent e) {
        if (isClickEnabled) {
            Point from = this.getLocation();
            int step;
            if (clicked) {
                step = 20;
            } else {
                step = -20;
            }
            clicked = !clicked;
            Point to = new Point(from.x, from.y + step);
            this.setLocation(to);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public GameJFrame getGameJFrame() {
        return gameJFrame;
    }

    public void setGameJFrame(GameJFrame gameJFrame) {
        this.gameJFrame = gameJFrame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsup() {
        return isup;
    }

    public void setIsup(boolean isup) {
        this.isup = isup;
    }

    public boolean isClickEnabled() {
        return isClickEnabled;
    }

    public void setClickEnabled(boolean isClickEnabled) {
        this.isClickEnabled = isClickEnabled;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    @Override
    public String toString() {
        return "PokerCard{gameJFrame = " + gameJFrame + ", name = " + name + ", isup = " + isup + ", isClickEnabled = "
                + isClickEnabled + ", clicked = " + clicked + "}";
    }
}
