import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setVisible(true);
		f.pack();

		JPanel p = new JPanel();

		f.add(p);

		JButton a = new JButton("Click Me!");

		p.add(a);

		f.pack();

		JButton b = new JButton("Push Me!");

		p.add(b);

		f.pack();
	}
}
