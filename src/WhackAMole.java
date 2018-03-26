import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	Random ran = new Random();
	JFrame jf1 = new JFrame();
	static int count = 0;
	static Date timeAtStart = new Date();
	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole();
	}

	public WhackAMole() {
		JPanel jp1 = new JPanel();
		jf1.setVisible(true);
		jf1.setSize(new Dimension(250, 300));
		jf1.add(jp1);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp1.setBackground(new Color(0, 153, 17));
		int rand = ran.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton jb = new JButton();
			jp1.add(jb);
			jb.addActionListener(this);
			if (rand == i) {
				jb.setText("mole!");
				jb.setBackground(new Color(153, 85, 0));
				jb.setOpaque(true);

			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
e.getSource();
JButton b = (JButton) e.getSource();
if (b.getText().equals("mole!")) {
	count++;
	if (count == 10) {
		endGame(timeAtStart, 10);
		System.exit(0);
	}
	jf1.dispose();
	WhackAMole wam = new WhackAMole();
}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
}
