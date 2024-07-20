package TesteSwing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Screen extends JFrame {
    JButton loginButton;
    JTextField userField; // Area de texto para colocar o usuario
    JPasswordField passField; // Area de texto para colocar a senha
    JLabel userLabel; // Fica ao lado do texto do usuario
    JLabel passLabel; // Fica ao lado do texto da senha

    public Screen(String txt) {
        super(txt); // Chama a função para colocar o titulo na janela
        this.setSize(900, 480);
        this.getContentPane().setBackground(new Color(54, 54, 54));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Null para inicializar no centro
        this.setLayout(new GridBagLayout()); // Gerenciador de localizador
        GridBagConstraints g = new GridBagConstraints();

        JPanel paineldeDentro = new JPanel(new GridBagLayout());
        paineldeDentro.setBackground(new Color(105, 105, 105)); // Setar a cor do painel de dentro
        paineldeDentro.setPreferredSize(new Dimension(500, 250)); // Setar a dimensão do painel de dentro

        GridBagConstraints inG = new GridBagConstraints();
        inG.insets = new Insets(10, 10, 10, 10); // Determinar a distanciar no painel interno
        inG.fill = GridBagConstraints.HORIZONTAL; // Determinar no painel interno

        userLabel = new JLabel("<html><font color ='white'>Usuário:</font></html>");
        inG.gridx = 0;
        inG.gridy = 0;
        paineldeDentro.add(userLabel, inG); // Adicionando ao painel de dentro

        userField = new JTextField();
        inG.gridx = 1;
        inG.gridy = 0;
        inG.gridwidth = 2; // Largura da area do texto
        paineldeDentro.add(userField, inG); // Adicionando ao painel de dentro

        passLabel = new JLabel("<html><font color ='white'>Senha:</font></html>");
        inG.gridx = 0;
        inG.gridy = 1;
        paineldeDentro.add(passLabel, inG);

        passField = new JPasswordField();
        inG.gridx = 1;
        inG.gridy = 1;
        inG.gridwidth = 2;
        paineldeDentro.add(passField, inG);

        loginButton = new JButton("Login");
        inG.gridx = 1;
        inG.gridy = 2;
        inG.gridwidth = 1;
        loginButton.addActionListener(new ActionButton(userField, passField)); // Passar os campos corretamente
        paineldeDentro.add(loginButton, inG);

        g.gridx = 0;
        g.gridy = 0;
        g.weightx = 1.0;
        g.weighty = 1.0;
        g.anchor = GridBagConstraints.CENTER;
        this.add(paineldeDentro, g);

        this.validate();
        this.repaint();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Screen("Tela de Login");
    }
}
