import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;

public class ColoredButton {
	Random ran = new Random();
	Color c;
	String color;

	private Color getRandomColor() {
		int i = ran.nextInt(4);
		if (i == 0) {
			color = "Orange";
			return Color.ORANGE;
		} else if (i == 1) {
			color = "Blue";
			return Color.BLUE;
		} else if (i == 2) {
			color = "Yellow";
			return Color.YELLOW;
		} else {
			color = "Red";
			return Color.RED;
		}
	}

	public JButton getNewButton() {
		JButton jb1 = new JButton();
		c = getRandomColor();
		jb1.setBackground(c);
		jb1.setPreferredSize(new Dimension(100, 100));
		jb1.setOpaque(true);
		return jb1;
	}

	public String getColor() {
		return color;
	}
}
