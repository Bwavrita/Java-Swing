package TesteSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ActionButton implements ActionListener {
    private JTextField usuario;
    private JPasswordField senha;

    public ActionButton(JTextField usuario, JPasswordField senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(usuario.getText().isEmpty() && new String(senha.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Usuário e senha nulos", "Erro", JOptionPane.WARNING_MESSAGE);
        }else if (usuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuário nulo", "Erro", JOptionPane.WARNING_MESSAGE);
        } else if (new String(senha.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Senha vazia", "Erro", JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
