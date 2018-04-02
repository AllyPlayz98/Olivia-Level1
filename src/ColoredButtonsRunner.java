import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColoredButtonsRunner implements ActionListener {
	JFrame jf1;
	JPanel jp1;

	public static void main(String[] args) {
		ColoredButtonsRunner cbr = new ColoredButtonsRunner();
	}

	public ColoredButtonsRunner() {
		drawButtons();
	}

	private void drawButtons() {
		jf1 = new JFrame();
		jp1 = new JPanel();
		jf1.add(jp1);
		ColoredButton cb = new ColoredButton();
		JButton b1 = cb.getNewButton();
		JButton b2 = cb.getNewButton();
		JButton b3 = cb.getNewButton();
		JButton b4 = cb.getNewButton();
		jp1.add(b1);
		jp1.add(b2);
		jp1.add(b3);
		jp1.add(b4);
		jf1.setVisible(true);
		JButton redraw = new JButton("Redraw");
		jp1.add(redraw);
		redraw.addActionListener(this);
		jf1.pack();
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jf1.dispose();
		drawButtons();
	}
}
