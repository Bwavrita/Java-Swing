package TesteSwing.ActionButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ActionButtonLogin implements ActionListener {
    private JTextField user;
    private JPasswordField password;

    public ActionButtonLogin(JTextField user, JPasswordField password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(user.getText().isEmpty() && new String(password.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Usuário e senha nulos", "Erro", JOptionPane.WARNING_MESSAGE);
        }else if (user.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuário nulo", "Erro", JOptionPane.WARNING_MESSAGE);
        } else if (new String(password.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Senha vazia", "Erro", JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
