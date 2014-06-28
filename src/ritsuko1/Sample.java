package ritsuko1;
import java.awt.*;
import javax.swing.*;

public class Sample extends JFrame {
	public Sample(){
		setTitle ("mein");
        Mainpanel panel = new Mainpanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
        pack();
	}
    public static void main(String[] args) {
        Sample frame = new Sample();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }	
	
}