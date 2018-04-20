import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects  implements ActionListener{
	 private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}





	public static void main(String[] args) {
		SoundEffects se = new SoundEffects();
		
		
		se.methodOfHoldingThings();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	  AudioClip sound;	
	

void methodOfHoldingThings() {
	 frame.add(panel);
     frame.setVisible(true);
     panel.add(button1);
     panel.add(button2);
     button1.setText("sawing wood");
     button1.addActionListener(this);
     button1.setSize(50, 50);
     frame.pack();
     button2.setText("cat screetch");
     button2.addActionListener(this);
     button2.setSize(50, 50);
     frame.pack();
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if(arg0.getSource().equals(button1)) {
	     playSound("sawing-wood-daniel_simon.wav");
	     }
		else if(arg0.getSource().equals(button2)) {
	     playSound("98674__hamface__catyell.wav");
	     }
	}

}
