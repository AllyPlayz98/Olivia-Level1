import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();
	JLabel jl1 = new JLabel();

	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
	}

	public TypingTutor() {
		JFrame jf1 = new JFrame();
		jf1.setVisible(true);
		jf1.setTitle("Type or Die!");
		jf1.addKeyListener(this);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jl1.setFont(jl1.getFont().deriveFont(28.0f));
		jl1.setHorizontalAlignment(JLabel.CENTER);
		jf1.add(jl1);
		jl1.setText(String.valueOf(currentLetter));
		jf1.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		jl1.setText(String.valueOf(currentLetter));
	}

}
