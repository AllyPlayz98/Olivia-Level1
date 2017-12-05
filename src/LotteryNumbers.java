import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LotteryNumbers implements ActionListener {
	Random r = new Random();
	JButton jb2 = new JButton();

	public LotteryNumbers() {
		JFrame jf1 = new JFrame();
		jf1.setVisible(true);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		jf1.add(jp1, BorderLayout.NORTH);
		jf1.add(jp2, BorderLayout.CENTER);
		JButton jb1 = new JButton("Get New Lottery Number");
		jp1.add(jb1);
		jp2.add(jb2);
		jf1.setSize(200, 100);
		jb1.addActionListener(this);
		jb1.setBackground(new Color(0xFFCC11));
		jb1.setOpaque(true);
	}

	public static void main(String[] args) {
		LotteryNumbers ln = new LotteryNumbers();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You Clicked Me!");
		Integer ra = r.nextInt(10000000);
		String s = ra.toString();
		jb2.setText(s);

	}
}
