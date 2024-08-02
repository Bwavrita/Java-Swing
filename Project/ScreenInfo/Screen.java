package ScreenInfo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Persistence.UserPersistence;
import ScreenInfo.ActionButton.ActionButtonLogin;
import ScreenInfo.ActionButton.ActionButtonRegister;
import ScreenInfo.ActionButton.ActionButtonRegisterOnLogin;
import UserInfo.UserManagement;

public class Screen extends JFrame {
    private UserManagement userManagement;
    private UserPersistence userPersistence;

    public Screen(String txt, UserManagement userManagement,UserPersistence userPersistence) {
        super(txt);
        this.userManagement = userManagement;
        this.userPersistence = userPersistence;
    }
    
    public void loginScreen() {
        this.setSize(900, 480);
        this.getContentPane().setBackground(new Color(54, 54, 54));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        JPanel insidePanel = new JPanel(new GridBagLayout());
        insidePanel.setBackground(new Color(105, 105, 105));
        insidePanel.setPreferredSize(new Dimension(500, 250));

        GridBagConstraints inG = new GridBagConstraints();
        inG.insets = new Insets(10, 10, 10, 10);
        inG.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLabel = new JLabel("<html><font color ='white'>User:</font></html>");
        inG.gridx = 0;
        inG.gridy = 0;
        inG.anchor = GridBagConstraints.EAST;
        insidePanel.add(userLabel, inG);

        JTextField userField = new JTextField(20);
        inG.gridx = 1;
        inG.gridy = 0;
        inG.gridwidth = 2;
        inG.anchor = GridBagConstraints.WEST;
        insidePanel.add(userField, inG);

        JLabel passLabel = new JLabel("<html><font color ='white'>Password:</font></html>");
        inG.gridx = 0;
        inG.gridy = 1;
        inG.gridwidth = 1;
        inG.anchor = GridBagConstraints.EAST;
        insidePanel.add(passLabel, inG);

        JPasswordField passField = new JPasswordField(20);
        inG.gridx = 1;
        inG.gridy = 1;
        inG.gridwidth = 2;
        inG.anchor = GridBagConstraints.WEST;
        insidePanel.add(passField, inG);

        JButton loginButton = new JButton("Login");
        inG.gridx = 1;
        inG.gridy = 2;
        inG.gridwidth = 1;
        loginButton.addActionListener(new ActionButtonLogin(userManagement, userField, passField,this,userPersistence));
        insidePanel.add(loginButton, inG);

        JButton registerButton = new JButton("Register");
        inG.gridx = 2;
        inG.gridy = 2;
        inG.gridwidth = 1;
        registerButton.addActionListener(new ActionButtonRegisterOnLogin(this , userManagement,userPersistence));
        insidePanel.add(registerButton, inG);

        g.gridx = 0;
        g.gridy = 0;
        g.weightx = 1.0;
        g.weighty = 1.0;
        g.anchor = GridBagConstraints.CENTER;
        this.add(insidePanel, g);

        this.validate();
        this.repaint();
        this.setVisible(true);
    }
    
    public void registerScreen() {
        this.setSize(900, 480);
        this.getContentPane().setBackground(new Color(54, 54, 54));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        JPanel insidePanel = new JPanel(new GridBagLayout());
        insidePanel.setBackground(new Color(105, 105, 105));
        insidePanel.setPreferredSize(new Dimension(500, 300));

        GridBagConstraints inG = new GridBagConstraints();
        inG.insets = new Insets(10, 10, 10, 10);
        inG.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLabel = new JLabel("<html><font color ='white'>User:</font></html>");
        inG.gridx = 0;
        inG.gridy = 0;
        inG.anchor = GridBagConstraints.EAST;
        insidePanel.add(userLabel, inG);

        JTextField userField = new JTextField(20);
        inG.gridx = 1;
        inG.gridy = 0;
        inG.gridwidth = 2;
        inG.anchor = GridBagConstraints.WEST;
        insidePanel.add(userField, inG);

        JLabel emailLabel = new JLabel("<html><font color ='white'>Email:</font></html>");
        inG.gridx = 0;
        inG.gridy = 1;
        inG.gridwidth = 1;
        inG.anchor = GridBagConstraints.EAST;
        insidePanel.add(emailLabel, inG);

        JTextField emailField = new JTextField(20);
        inG.gridx = 1;
        inG.gridy = 1;
        inG.gridwidth = 2;
        inG.anchor = GridBagConstraints.WEST;
        insidePanel.add(emailField, inG);

        JLabel passLabel = new JLabel("<html><font color ='white'>Password:</font></html>");
        inG.gridx = 0;
        inG.gridy = 2;
        inG.gridwidth = 1;
        inG.anchor = GridBagConstraints.EAST;
        insidePanel.add(passLabel, inG);

        JPasswordField passField = new JPasswordField(20);
        inG.gridx = 1;
        inG.gridy = 2;
        inG.gridwidth = 2;
        inG.anchor = GridBagConstraints.WEST;
        insidePanel.add(passField, inG);

        JLabel secPassLabel = new JLabel("<html><font color ='white'>Confirm password:</font></html>");
        inG.gridx = 0;
        inG.gridy = 3;
        inG.gridwidth = 1;
        inG.anchor = GridBagConstraints.EAST;
        insidePanel.add(secPassLabel, inG);

        JPasswordField secPassField = new JPasswordField(20);
        inG.gridx = 1;
        inG.gridy = 3;
        inG.gridwidth = 2;
        inG.anchor = GridBagConstraints.WEST;
        insidePanel.add(secPassField, inG);

        JButton registerButton = new JButton("Register");
        inG.gridx = 1;
        inG.gridy = 4;
        inG.gridwidth = 2;
        registerButton.addActionListener(new ActionButtonRegister(userManagement, userField, emailField, passField, secPassField, this,userPersistence));
        inG.anchor = GridBagConstraints.CENTER;
        insidePanel.add(registerButton, inG);

        g.gridx = 0;
        g.gridy = 0;
        g.weightx = 1.0;
        g.weighty = 1.0;
        g.anchor = GridBagConstraints.CENTER;
        this.add(insidePanel, g);

        this.validate();
        this.repaint();
        this.setVisible(true);
    }

    public void smileScreen() {
        this.setSize(900, 480);
        this.getContentPane().setBackground(new Color(54, 54, 54));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        
        JPanel smilePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.YELLOW);
                g.fillOval(150, 50, 300, 300); // Desenhar o rosto

                g.setColor(Color.BLACK);
                g.fillOval(220, 130, 30, 30); // Olho esquerdo
                g.fillOval(350, 130, 30, 30); // Olho direito

                g.drawArc(230, 200, 150, 100, 0, -180); // Sorriso
            }
        };

        smilePanel.setPreferredSize(new Dimension(600, 400));
        smilePanel.setBackground(new Color(54, 54, 54));

        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.anchor = GridBagConstraints.CENTER;
        this.add(smilePanel, g);

        this.setVisible(true);
        }
    }