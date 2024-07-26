package TesteSwing.ActionButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ActionButtonRegister implements ActionListener {
    private JTextField user;
    private JTextField email;
    private JPasswordField password;

    public ActionButtonRegister(JTextField user, JTextField email, JPasswordField password) {
        this.user = user;
        this.email = email;
        this.password = password;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userText = user.getText();
        String emailText = email.getText();
        String passwordText = new String(password.getPassword());

        if (userText.isEmpty() && passwordText.isEmpty() && emailText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username, email and password are empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (userText.isEmpty() && passwordText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and password are empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (passwordText.isEmpty() && emailText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password and email are empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (userText.isEmpty() && emailText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and email are empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (userText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username is empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (emailText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email is empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (passwordText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password is empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
