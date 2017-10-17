import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListener implements ActionListener {
public static void main(String[] args) {
ButtonListener ButtonListener = new ButtonListener();
}
JFrame f = new JFrame();
JButton b = new JButton("Click Me!");

public ButtonListener() {
f.add(b);
f.setVisible(true);
b.addActionListener(this);
f.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Thanks for following directions!");
}

}
