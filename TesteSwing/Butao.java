package TesteSwing;

import java.awt.Font;
import javax.swing.JButton;

public class Butao extends JButton {
    public Butao(String txt, int x, int y, int width, int height) {
        super(txt);
        this.setBounds(x, y, width, height);
        this.setFont(new Font("Arial", Font.BOLD, 20));
    }
}
