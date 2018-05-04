import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	JFrame frame= new JFrame();
	public static void main(String[] args) throws Exception{
		new CutenessTV() .getGoing();
	}
	private void getGoing() {
		
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(80, 80);
		JPanel panel= new JPanel();
	frame.add(panel);
	JButton duck= new JButton();
	duck.addActionListener(this);
	duck.setText("duck");
panel.add(duck);
JButton unicorn= new JButton();
unicorn.addActionListener(this);
unicorn.setText("unicorn");
panel.add(unicorn);
JButton frog= new JButton();
frog.addActionListener(this);
frog.setText("frog");
panel.add(frog);
frame.pack();
	}
	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		if(event.getSource())
	}
	
}
