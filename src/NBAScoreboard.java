import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NBAScoreboard {
	JPanel HomePanel = new JPanel();
	JPanel AwayPanel = new JPanel();
	int hsv = 0;
	int asv = 0;
	int htov = 3;
	int atov = 3;

	public NBAScoreboard() {
		JFrame jf1 = new JFrame();
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setVisible(true);
		jf1.setLayout(new BorderLayout());
		HomePanel.setLayout(new BorderLayout());
		AwayPanel.setLayout(new BorderLayout());
		JPanel HomePanel1 = new JPanel();
		HomePanel.add(HomePanel1, BorderLayout.NORTH);
		JPanel HomePanel2 = new JPanel();
		HomePanel.add(HomePanel2, BorderLayout.CENTER);
		JPanel HomePanel3 = new JPanel();
		HomePanel.add(HomePanel3, BorderLayout.SOUTH);
		jf1.add(HomePanel, BorderLayout.WEST);
		JButton jbh1 = new JButton("HOME");
		HomePanel1.add(jbh1);
		JButton jbh2 = new JButton("PTS: " + hsv);
		HomePanel2.add(jbh2);
		JButton jbh3 = new JButton("T/O: " + htov);
		HomePanel3.add(jbh3);

		JPanel AwayPanel1 = new JPanel();
		AwayPanel.add(AwayPanel1, BorderLayout.NORTH);
		JPanel AwayPanel2 = new JPanel();
		AwayPanel.add(AwayPanel2, BorderLayout.CENTER);
		JPanel AwayPanel3 = new JPanel();
		AwayPanel.add(AwayPanel3, BorderLayout.SOUTH);
		jf1.add(AwayPanel, BorderLayout.EAST);
		JButton jba1 = new JButton("AWAY");
		HomePanel1.add(jba1);
		JButton jba2 = new JButton("PTS: " + asv);
		HomePanel2.add(jba2);
		JButton jba3 = new JButton("T/O: " + atov);
		HomePanel3.add(jba3);

		jbh1.setOpaque(true);
		jbh1.setBackground(new Color(255, 119, 000));
		jba1.setOpaque(true);
		jba1.setBackground(new Color(153, 000, 238));
		jf1.pack();

	}
}
