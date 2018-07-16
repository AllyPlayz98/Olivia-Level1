import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1CodingExam implements ActionListener {

	public static void main(String[] args) {
		Level1CodingExam l1ce = new Level1CodingExam();
	}

	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	JButton jb4 = new JButton();

	public Level1CodingExam() {
		JFrame jf1 = new JFrame();
		jf1.setVisible(true);
		jf1.setSize(330, 60);
		JPanel jp1 = new JPanel();
		jf1.add(jp1);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		jb1.setBackground(Color.YELLOW);
		jb1.setOpaque(true);
		jb2.setBackground(Color.RED);
		jb2.setOpaque(true);
		jb3.setBackground(Color.BLUE);
		jb3.setOpaque(true);
		jb4.setBackground(Color.GREEN);
		jb4.setOpaque(true);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jb1) {
			speak("Yellow");
		} else if (e.getSource() == jb2) {
			speak("Red");
		} else if (e.getSource() == jb3) {
			speak("Blue");
		} else {
			speak("Green");
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
