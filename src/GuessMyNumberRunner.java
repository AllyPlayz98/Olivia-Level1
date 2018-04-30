import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuessMyNumberRunner implements ActionListener {
	public GuessMyNumberRunner () {
	JFrame jf1 = new JFrame();
	JPanel jp1 = new JPanel();
	JButton jb1 = new JButton("Guess #");
	JButton jb2 = new JButton("Answer");
	jf1.add(jp1);
	jp1.add(jb1);
	jp1.add(jb2);
	jf1.setVisible(true);
	jf1.setSize(110, 100);
	jb1.addActionListener(this);
	}
public static void main(String[] args) {
	GuessMyNumberRunner gmnr = new GuessMyNumberRunner();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	GuessMyNumber gmn = new GuessMyNumber();
	for (int i = 1000; i < 1099; i++) {
		if (gmn.checkNumber(i)) {
		System.out.println("Number: " + i);	
		}
	}
}
}
