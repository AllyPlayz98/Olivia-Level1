import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener {
	public static void main(String[] args) {
		SensitiveKeyboard sk = new SensitiveKeyboard();
	}

	public SensitiveKeyboard() {
		JFrame jf1 = new JFrame();
		jf1.setVisible(true);
		jf1.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("OUCH!");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
