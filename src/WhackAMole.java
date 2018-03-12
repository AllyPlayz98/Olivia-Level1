import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
public static void main(String[] args) {
	WhackAMole wam = new WhackAMole();
}
public WhackAMole() {
	JFrame jf1 = new JFrame();
	JPanel jp1 = new JPanel();
	jf1.setVisible(true);
	jf1.setSize(new Dimension (300, 350));
	jf1.add(jp1);
	jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jp1.setBackground(new Color (0, 153, 17));
}
}
