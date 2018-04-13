import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects  implements ActionListener{

	public static void main(String[] args) {
		SoundEffects se = new SoundEffects();
		
		se.playSound("sawing-wood-daniel_simon.wav");
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	  AudioClip sound;	
	private void playSound(String fileName) {
	      sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     frame.add(panel);
	     frame.setVisible(true);
	     button.setText("sawing wood");
	     button.addActionListener(this);
	     button.setSize(5000, 5000);
	     frame.pack();
	    
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	JButton buttonPressed = new JButton();
		if(buttonPressed .equals(button)) {
	     sound.play();
	     }
	}

}
