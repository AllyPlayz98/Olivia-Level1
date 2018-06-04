import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonSyso implements ActionListener {
	JFrame jf1 = new JFrame();
	JPanel jp1 = new JPanel();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();

	public static void main(String[] args) {
		ButtonSyso bs = new ButtonSyso();
	}

	public ButtonSyso() {
		jf1.add(jp1);
		jp1.add(jb1);
		jp1.add(jb2);
		jf1.setVisible(true);
		jf1.setSize(120, 105);
		jb1.setText("Button #1");
		jb2.setText("Button #2");
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (jb1 == e.getSource()) {
			System.out.println("You Clicked Button #1!");
		} else if (jb2 == e.getSource()) {
			System.out.println("You Clicked Button #2!");
		}
	}
}
