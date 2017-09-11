 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String i1 = "https://i.pinimg.com/736x/3d/44/2f/3d442fc3e63097545a4ebce18581d24b--korra-avatar-team-avatar.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component a;
		// 3. use the "createImage()" method below to initialize your Component
a = createImage(i1);
		// 4. add the image to the quiz window
quizWindow.add(a);
quizWindow.pack();
		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image
String aa = JOptionPane.showInputDialog("Do you know who the boy is in these pictures?");
		// 7. print "CORRECT" if the user gave the right answer
if (aa.equals("Avatar Aang")) {
	JOptionPane.showMessageDialog(null, "CORRECT!");
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT!");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(a);
		// 10. find another image and create it (might take more than one line of code)
String i2 = "https://i.pinimg.com/736x/26/0c/76/260c76428f838eba6f0a64b426c44d7c--awesome-drawings-korra-avatar.jpg";
		// 11. add the second image to the quiz window
a = createImage(i2);
quizWindow.add(a);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String aa2 = "Is this Avatar Aang?";
		// 14+ check answer, say if correct or incorrect, etc.
if (aa2.equals("Yes")) {
	JOptionPane.showMessageDialog(null, "Yep, thats the greatist avatar of all time!");
}
else {
	JOptionPane.showMessageDialog(null, "Nope, thats Avatar Aang, the greatist avatar of all time!");
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





