package com.wtc.guiwindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import javax.swing.event.MouseInputListener;

public class MainJFrame extends JFrame implements MouseInputListener, KeyListener, ActionListener {

    public JButton jbt1 = new JButton("点我");

    JMenuItem resetJMenuItem = new JMenuItem("重置");
    JMenuItem bilibiliJMenuItem = new JMenuItem("B 站");

    private int WIDTH = 800;
    private int HEIGHT = 600;

    public MainJFrame() {
        initJFrame();

        initJMenuBar();

        jbt1.setBounds(0, 0, 100, 50);
        jbt1.addMouseListener(this);
        jbt1.addKeyListener(this);

        getContentPane().add(jbt1);

        setVisible(true);
    }

    public void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu funcJMenu = new JMenu("功能菜单");

        resetJMenuItem.addActionListener(this);
        funcJMenu.add(resetJMenuItem);

        jMenuBar.add(funcJMenu);

        JMenu aboutJMenu = new JMenu("关于");

        bilibiliJMenuItem.addActionListener(this);
        aboutJMenu.add(bilibiliJMenuItem);

        jMenuBar.add(aboutJMenu);

        setJMenuBar(jMenuBar);
    }

    public void initJFrame() {
        setTitle("Java Window");

        setSize(WIDTH, HEIGHT);

        setAlwaysOnTop(true);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        setResizable(false);

        setLayout(null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("按钮被点击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("点击");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进入");
        Random r = new Random();
        int x = r.nextInt(WIDTH - jbt1.getWidth() * 2);
        int y = r.nextInt(HEIGHT - jbt1.getHeight() * 2);
        jbt1.setLocation(x, y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标离开");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        int key = e.getKeyCode();
        System.out.println(key);
        System.out.println("现在按的是" + (char) key);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();

        if (object == resetJMenuItem) {
            jbt1.setLocation((WIDTH - jbt1.getWidth()) / 2, (HEIGHT - jbt1.getHeight()) / 2);
        } else if (object == bilibiliJMenuItem) {
            JDialog jDialog = new JDialog();

            // ImageIcon img = new ImageIcon("./bilibili_qr.png");
            ImageIcon img = new ImageIcon(MainJFrame.class.getResource("/bilibili_qr.png"));

            JLabel jLabel = new JLabel(img);
            jLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());

            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(img.getIconWidth() + 50, img.getIconHeight() + 50);
            jDialog.setResizable(false);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }
}
