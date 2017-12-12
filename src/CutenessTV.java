import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.
public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		CutenessTV ctv = new CutenessTV();
	}

	public CutenessTV() {
		JFrame jf1 = new JFrame();
		jf1.setVisible(true);
		JPanel jp1 = new JPanel();
		jf1.add(jp1);
		JButton jb1 = new JButton();
		JButton jb2 = new JButton();
		JButton jb3 = new JButton();
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb1.setText("Cute Duck Video");
		jb2.setText("Cute Frog Video");
		jb3.setText("Cute Fluffy Unicorn Video");
		jf1.pack();
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("Cute Duck Video")) {
			showDucks();
		} else if (b.getText().equals("Cute Frog Video")) {
			showFrog();
		} else if (b.getText().equals("Cute Fluffy Unicorn Video")) {
			showFluffyUnicorns();
		}
	}
}
