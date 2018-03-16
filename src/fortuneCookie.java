import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener{
public static void main (String[] args) {
	
	new fortuneCookie().showButton();
	
}
void showButton(){
JFrame frame = new JFrame();

frame.setVisible(true);
JButton button = new JButton();
frame.add(button);
button.addActionListener(this);
frame.setTitle("fortune cookie");

}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	int rand = new Random().nextInt(5);
	if(rand==4) {
		JOptionPane.showMessageDialog(null, "A tub of ice cream is in your near future");
	}
	else if(rand==3) {
		JOptionPane.showMessageDialog(null, "you will have no breakfast tomorrow");
	}
	else if(rand==2) {
		JOptionPane.showMessageDialog(null, "you will have no breakfast tomorrow");
	}
	else if(rand==1) {
		JOptionPane.showMessageDialog(null, "you will have no breakfast tomorrow");
	}
	else if(rand==0) {
		JOptionPane.showMessageDialog(null, "you will have no breakfast tomorrow");
	}
	
	
	
	
	
	
	
}
}