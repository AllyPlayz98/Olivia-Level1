import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JLabel jl = new JLabel();
	public static void main(String[] args) {

		// 1. Make a ChuckleClicker class, a main method and a makeButtons method. Put a
		// pop-up in the makeButtons method and get it working. You will need to
		// instantiate your class and call method an instance of it.
		ChuckleClicker cc = new ChuckleClicker();
	}

	public ChuckleClicker() {
		// 2. Make a JFrame in makeButtons() method and get it to show.
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Add a JPanel and two JButtons and get them to show up like this:
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jl);
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(jp2, BorderLayout.CENTER);
		jf.setSize(600, 200);
		jb1.addActionListener(this);
		jf.setVisible(true);
		// 4. *[Optional] Customize your GUI with setText, setSize, etc.
		jb1.setText("");
		// 5. Make a pop-up that says “hi” when either of the buttons are pressed. You
		// will need to add listeners to the buttons for this to work.

		// 6. Check if the ActionEvent came from the joke button or the punchline
		// button.
		// if(arg0.getSource() == jokeButton)
		// You might need to move the declaration of your buttons above the the
		// makeButtons() method.

		// 7. Use JOptionPane to print the joke or the punchline depending on which
		// button was clicked.

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jb1) {
		jl.setText("Knock, knock.  Who's there?  To.  To who?  No, to whom. ");	
		}
		else {
			jl.setText("I always get this wrong, to (or is that “too” … “Two?”)");
		}
	}
}
