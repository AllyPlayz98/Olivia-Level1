import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookieRecipe implements ActionListener {
	public static void main(String[] args) {
		FortuneCookieRecipe c = new FortuneCookieRecipe();
		c.makeButton();
	}

	public void makeButton() {
		JFrame f = new JFrame();
		f.setVisible(true);
		JButton b = new JButton("Button");
		b.addActionListener(this);
		f.add(b);
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Woohoo");
		Random rand = new Random();
		int num = rand.nextInt(5);
		if (num == 0) {
			JOptionPane.showMessageDialog(null, "You will recieve a grand prize.");
		} else if (num == 1) {
			JOptionPane.showMessageDialog(null, "You will be the holder of a large amount of money.");
		} else if (num == 2) {
			JOptionPane.showMessageDialog(null, "You will make a lifelong friend");
		} else if (num == 3) {
			JOptionPane.showMessageDialog(null, "You will learn something that will take you far in life.");
		} else {
			JOptionPane.showMessageDialog(null, "You will be greatly rewarded in the near future.");
		}

	}

}
