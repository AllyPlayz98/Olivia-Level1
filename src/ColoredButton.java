import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;

public class ColoredButton {
	Random ran = new Random();
	Color c;

	private Color getRandomColor() {
		int i = ran.nextInt(4);
		if (i == 0) {
			return Color.ORANGE;
		} else if (i == 1) {
			return Color.BLUE;
		} else if (i == 2) {
			return Color.YELLOW;
		} else {
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

	public Color getColor() {
		return c;
	}
}
