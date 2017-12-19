
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	JTextField jtf1 = new JTextField(15);
	JTextPane jtp1 = new JTextPane();

	public static void main(String[] args) {
		GetLatestTweet glt = new GetLatestTweet();
	}

	public GetLatestTweet() {
		JFrame jf1 = new JFrame();
		jf1.setVisible(true);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		jf1.add(jp1, BorderLayout.NORTH);
		jf1.add(jp2, BorderLayout.CENTER);
		JButton jb1 = new JButton();
		jp1.add(jtf1);
		jp1.add(jb1);
		jtp1.setPreferredSize(new Dimension(200, 200));
		jp2.add(jtp1);
		jb1.setText("Get Tweet");
		jf1.pack();
		jb1.addActionListener(this);
	}

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			String a = "";
			for (int i = 0; i<result.getCount(); i++) {
				a+=result.getTweets().get(i).getText() + "\n\n";
			}
			return a;
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = jtf1.getText();
		String f = getLatestTweet(s);
		jtp1.setText(f);
	}
}
