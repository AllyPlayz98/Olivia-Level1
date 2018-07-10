import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EmoticonButtons implements ActionListener {
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();

	public static void main(String[] args) {
		EmoticonButtons eb = new EmoticonButtons();
	}

	public EmoticonButtons() {
		JFrame jf1 = new JFrame();
		jf1.setVisible(true);
		JPanel jp1 = new JPanel();
		jf1.add(jp1);
		jp1.add(jb1);
		jp1.add(jb2);
		jf1.setSize(100, 100);
		jb1.setText("Happy :)");
		jb2.setText("Sad :(");
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jb1) {
			System.out.println("Happy :)");
		} else {
			System.out.println("Sad :(");
		}
	}
}
