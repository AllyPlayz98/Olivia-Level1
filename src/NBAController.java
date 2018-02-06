import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NBAController {
	public static void main(String[] args) {
		NBAScoreboard nbas = new NBAScoreboard();
		NBAController nbac = new NBAController();
	}

	public NBAController() {
		JFrame jf1 = new JFrame();
		jf1.setVisible(true);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel HomePanel = new JPanel();
		JPanel AwayPanel = new JPanel();
		jf1.setLayout(new BorderLayout());
		jf1.add(HomePanel, BorderLayout.WEST);
		jf1.add(AwayPanel, BorderLayout.EAST);

		JPanel HomePanel1 = new JPanel();
		JPanel HomePanel2 = new JPanel();
		JPanel HomePanel3 = new JPanel();
		HomePanel.setLayout(new BorderLayout());
		HomePanel.add(HomePanel1, BorderLayout.NORTH);
		HomePanel.add(HomePanel2, BorderLayout.CENTER);
		HomePanel.add(HomePanel3, BorderLayout.SOUTH);

		JButton jbhp1 = new JButton("HALF-BLOODS");
		JButton jbhp2 = new JButton("+1");
		JButton jbhp22 = new JButton("-1");
		JButton jbhp3 = new JButton("-1");
		JLabel HomeScore = new JLabel("Score: ");
		JLabel HomeTO = new JLabel("T/O: ");
		HomePanel1.add(jbhp1);
		HomePanel2.add(HomeScore);
		HomePanel2.add(jbhp2);
		HomePanel2.add(jbhp22);
		HomePanel3.add(HomeTO);
		HomePanel3.add(jbhp3);
		jf1.pack();

		JPanel AwayPanel1 = new JPanel();
		JPanel AwayPanel2 = new JPanel();
		JPanel AwayPanel3 = new JPanel();
		HomePanel.setLayout(new BorderLayout());
		HomePanel.add(HomePanel1, BorderLayout.NORTH);
		HomePanel.add(HomePanel2, BorderLayout.CENTER);
		HomePanel.add(HomePanel3, BorderLayout.SOUTH);

		JButton jbap1 = new JButton("JUPITERS");
		JButton jbap2 = new JButton("+1");
		JButton jbap22 = new JButton("-1");
		JButton jbap3 = new JButton("-1");
		JLabel AwayScore = new JLabel("Score: ");
		JLabel AwayTO = new JLabel("T/O: ");
		HomePanel1.add(jbap1);
		HomePanel2.add(AwayScore);
		HomePanel2.add(jbap2);
		HomePanel2.add(jbap22);
		HomePanel3.add(AwayTO);
		HomePanel3.add(jbap3);
		jf1.pack();

		HomePanel1.setOpaque(true);
		HomePanel1.setBackground(new Color(255, 119, 000));
		AwayPanel1.setOpaque(true);
		AwayPanel1.setBackground(new Color(153, 000, 238));
		jf1.pack();
	}
}
