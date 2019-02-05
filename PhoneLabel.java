import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PhoneLabel {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBounds(600, 300, 600, 400);
		myFrame.setLayout(null);
		JTextField nameTxt = new JTextField("Enter your name here.");
		nameTxt.setBounds(20, 30, 500, 20);
		JTextField phoneTxt = new JTextField("Enter your phone number here.");
		phoneTxt.setBounds(20, 60, 500, 20);
		JLabel infoLbl = new JLabel("User Information");
		infoLbl.setBounds(20, 150, 500, 50);
		myFrame.add(phoneTxt);
		myFrame.add(nameTxt);
		myFrame.add(infoLbl);
		JButton enterButton = new JButton("Enter");
		enterButton.setSize(new Dimension(100, 30));
		enterButton.setLocation(new Point(230, 100));
		myFrame.add(enterButton);
		enterButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				String phoneNum = phoneTxt.getText();
				String name = nameTxt.getText();
				infoLbl.setVisible(true);
				infoLbl.setText("Name: " + name + "     Phone Number: " + phoneNum);
				
			}
		});
		myFrame.setVisible(true);
		infoLbl.setVisible(false);
		
	}

}
