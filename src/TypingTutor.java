import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();
	JLabel jl1 = new JLabel();
	int score = 0;

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
		jl1.setOpaque(true);
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
		System.out.println("You Typed: " + e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			jl1.setBackground(new Color(000, 187, 000));
			score++;
			if (score == 20) {
				System.out.println("Game Over!");
				showTypingSpeed(20);
				System.exit(0);
			}
		} else {
			jl1.setBackground(new Color(255, 051, 017));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		jl1.setText(String.valueOf(currentLetter));

	}
	
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	      Date timeAtEnd = new Date();
	      long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	      long gameInSeconds = (gameDuration / 1000) % 60;
	      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	      int charactersPerMinute = (int) (charactersPerSecond * 60);
	      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	Date timeAtStart = new Date();


}