/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


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
String america= "http://a57.foxnews.com/images.foxnews.com/content/fox-news/opinion/2017/07/04/why-america-is-and-always-will-be-greatest-nation-on-earth/_jcr_content/par/featured_image/media-0.img.jpg/0/0/1499190754442.jpg?ve=1";
		// 2. create a variable of type "Component" that will hold your image
Component picture;
		// 3. use the "createImage()" method below to initialize your Component
picture=createImage(america);
		// 4. add the image to the quiz window
quizWindow.add(picture);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String a = JOptionPane.showInputDialog("How many red stripes are there on the american flag?");
		// 7. print "CORRECT" if the user gave the right answer
if(a.equalsIgnoreCase("7")) {
	System.out.println("correct");
}else {
	System.out.println("incorrect");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(picture);
		// 10. find another image and create it (might take more than one line of code)
String crowd= "http://www.dreams.metroeve.com/wp-content/uploads/2017/03/dreams.metroeve_crowds-dreams-meaning.jpg"
Component photo;
photo=createImage(crowd);
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

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





