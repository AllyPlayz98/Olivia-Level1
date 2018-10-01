import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args) {
		JFrame jf1 = new JFrame();
		JTextField jtf1 = new JTextField();
		JTextField jtf2 = new JTextField();
		JButton jb1 = new JButton();
		JButton jb2 = new JButton();
		JButton jb3 = new JButton();
		JButton jb4 = new JButton();
		jf1.setVisible(true);
		jf1.setSize(400, 200);
		jf1.add(jtf1);
		jf1.add(jtf2);
		jf1.add(jb1);
		jf1.add(jb2);
		jf1.add(jb3);
		jf1.add(jb4);
		jb1.setSize(80, 35);
		jb2.setSize(80, 35);
		jb3.setSize(80, 35);
		jb4.setSize(80, 35);
		jb1.setLocation(200, 100);

	}
}
