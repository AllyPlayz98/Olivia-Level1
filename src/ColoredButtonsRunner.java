import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ColoredButtonsRunner implements ActionListener {
	JFrame jf1;
	JPanel jp1;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;

	public static void main(String[] args) {
		ColoredButtonsRunner cbr = new ColoredButtonsRunner();
	}

	ColoredButton cb1;
	ColoredButton cb2;
	ColoredButton cb3;
	ColoredButton cb4;

	public ColoredButtonsRunner() {
		drawButtons();
	}

	private void drawButtons() {
		jf1 = new JFrame();
		jp1 = new JPanel();
		jf1.add(jp1);
		cb1 = new ColoredButton();
		cb2 = new ColoredButton();
		cb3 = new ColoredButton();
		cb4 = new ColoredButton();
		b1 = cb1.getNewButton();
		b2 = cb2.getNewButton();
		b3 = cb3.getNewButton();
		b4 = cb4.getNewButton();
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
		JOptionPane.showMessageDialog(null, "Your colors were " + cb1.getColor() + ", " + cb2.getColor() + ", "
				+ cb3.getColor() + ", and " + cb4.getColor() + ".");
	}
}
