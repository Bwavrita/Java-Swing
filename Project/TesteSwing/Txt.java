package TesteSwing;

import java.awt.Font;

import javax.swing.JTextField;

public class Txt extends JTextField{
    public Txt(String txt,int x, int y, int widht, int height){
        this.setBounds(x, y, widht, height);
        this.setFont(new Font("Arial",Font.BOLD,20));
        
    }
}
