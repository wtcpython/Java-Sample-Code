package com.wtc.landlord;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.wtc.landlord.util.User;
import com.wtc.landlord.util.Utils;

public class LoginJFrame extends JFrame implements MouseListener {
    static ArrayList<User> allUsers = new ArrayList<>();

    static {
        allUsers.add(new User("zhangsan", "123"));
        allUsers.add(new User("lisi", "1234"));
    }
    JButton login = new JButton();
    JButton register = new JButton();
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JTextField code = new JTextField();

    // 正确的验证码
    JLabel rightCode = new JLabel();

    public LoginJFrame() {
        // 初始化界面
        initJFrame();
        // 在这个界面中添加内容
        initView();
        // 让当前界面显示出来
        this.setVisible(true);
    }

    public void initView() {
        // 设置字体
        Font font = new Font("Microsoft YaHei", Font.BOLD, 16);

        // 1. 添加用户名文字
        JLabel usernameText = new JLabel("用户名");
        usernameText.setForeground(Color.white);
        usernameText.setFont(font);
        usernameText.setBounds(140, 55, 55, 22);
        this.getContentPane().add(usernameText);

        // 2.添加用户名输入框
        username.setBounds(223, 46, 200, 30);
        this.getContentPane().add(username);

        // 3.添加密码文字
        JLabel passwordText = new JLabel("密码");
        passwordText.setForeground(Color.white);
        passwordText.setFont(font);
        passwordText.setBounds(197, 95, 40, 22);
        this.getContentPane().add(passwordText);

        // 4.密码输入框
        password.setBounds(263, 87, 160, 30);
        this.getContentPane().add(password);

        // 验证码提示
        JLabel codeText = new JLabel("验证码");
        codeText.setForeground(Color.white);
        codeText.setFont(font);
        codeText.setBounds(215, 142, 55, 22);
        this.getContentPane().add(codeText);

        // 验证码的输入框
        code.setBounds(291, 133, 100, 30);
        this.getContentPane().add(code);

        // 设置颜色
        rightCode.setForeground(Color.RED);
        // 设置字体
        rightCode.setFont(font);
        // 设置内容
        this.setCaptcha();
        // 绑定鼠标事件
        rightCode.addMouseListener(this);
        // 位置和宽高
        rightCode.setBounds(400, 133, 100, 30);
        // 添加到界面
        this.getContentPane().add(rightCode);

        // 5.添加登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("./image/login/loginButton.png"));
        // 去除按钮的边框
        login.setBorderPainted(false);
        // 去除按钮的背景
        login.setContentAreaFilled(false);
        // 给登录按钮绑定鼠标事件
        login.addMouseListener(this);
        this.getContentPane().add(login);

        // 6.添加注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("./image/login/registerButton.png"));
        // 去除按钮的边框
        register.setBorderPainted(false);
        // 去除按钮的背景
        register.setContentAreaFilled(false);
        // 给注册按钮绑定鼠标事件
        register.addMouseListener(this);
        this.getContentPane().add(register);

        // 7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("./image/login/background.png"));
        background.setBounds(0, 0, 633, 423);
        this.getContentPane().add(background);
    }

    public void initJFrame() {
        this.setSize(633, 423);
        this.setResizable(false);
        this.setTitle("斗地主游戏 V1.0登录");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }

    public void setCaptcha() {
        System.out.println("设置新的验证码");
        String code = Utils.getCaptcha();
        rightCode.setText(code);
    }

    public void showWarning(String content) {
        JOptionPane.showMessageDialog(this, content, "警告", JOptionPane.WARNING_MESSAGE);
        this.setCaptcha();
    }

    // 点击
    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            System.out.println("点击了登录按钮");
            // 获取两个文本输入框中的内容
            String usernameInput = username.getText();
            String passwordInput = new String(password.getPassword());
            // 获取用户输入的验证码
            String codeInput = code.getText();

            // 判断用户名和密码是否为空
            if (usernameInput.isEmpty() || passwordInput.isEmpty()) {
                showWarning("用户名或者密码为空");
                return;
            }

            // 判断验证码是否为空
            if (codeInput.isEmpty()) {
                showWarning("验证码不能为空");
                return;
            }

            // 判断验证码是否正确
            if (!codeInput.equals(rightCode.getText())) {
                showWarning("验证码输入错误");
                return;
            }

            // 判断集合中是否包含当前用户对象
            // 其实就是验证用户名和密码是否相同
            // contains底层是依赖equals方法判断的，所以需要重写equals方法
            User userInfo = new User(usernameInput, passwordInput);
            if (allUsers.contains(userInfo)) {
                // 关闭当前登录界面
                this.setVisible(false);
                // 打开游戏的主界面
                new GameJFrame();
            } else {
                showWarning("用户名或密码错误");
            }
        } else if (source == register) {
            System.out.println("点击了注册按钮");
        } else if (source == rightCode) {
            this.setCaptcha();
        }
    }

    // 按住不松
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("./image/login/loginButtonPressed.png"));
        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("./image/login/registerButtonPressed.png"));
        }
    }

    // 松开按钮
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("./image/login/loginButton.png"));
        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("./image/login/registerButton.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
