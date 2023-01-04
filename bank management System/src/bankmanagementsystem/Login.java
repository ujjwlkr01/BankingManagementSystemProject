package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	JButton login, signup, clear; // we have declared the variables globally as we will use it outside the
									// constructor...
	JPasswordField pinTextField;// it will hide the password
	JTextField cardTextField;

	Login() {
		setTitle("Automated Teller Machine");

		setLayout(null); // to turn off the default layout
		// For the image section...
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); // to add the image URL from the
																						// system

		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // to set the image size
		ImageIcon i3 = new ImageIcon(i2); // to convert the image into image icon as we can't pass the image direct to
											// JLabel
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100); // to place the image on the frame as per own choice
		add(label); // to add components on the frame

		// For Adding the text...
		JLabel text = new JLabel("Weclome to ATM"); // to add text on the frame
		text.setFont(new Font("OSWARD", Font.BOLD, 38)); // to set the font of the text
		text.setBounds(200, 40, 400, 40); // to turn on the layout as we have done layout as null
		add(text); // to add text on the frame

		JLabel cardNo = new JLabel("Card No:");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
		cardNo.setBounds(120, 150, 250, 30);
		add(cardNo);

		cardTextField = new JTextField(); // For adding the textField box for the card
		cardTextField.setBounds(300, 150, 230, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(cardTextField);

		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(120, 220, 250, 30);
		add(pin);

		pinTextField = new JPasswordField(); // for adding the textField box for the pin
		pinTextField.setBounds(300, 220, 230, 30);
		pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(pinTextField);

		// For adding the button
		login = new JButton("SIGN IN");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(Color.BLACK); // to change the background color
		login.setForeground(Color.WHITE); // to change the foreground color
		login.addActionListener(this); // to perform click able action on clicking the buttons
		add(login);

		clear = new JButton("RESET");
		clear.setBounds(430, 300, 100, 30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this); // to perform click able action on clicking the buttons
		add(clear);

		signup = new JButton("SIGN UP");
		signup.setBounds(300, 350, 230, 30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this); // to perform click able action on clicking the buttons
		add(signup);

		getContentPane().setBackground(Color.WHITE);// to set the background of the frame

		// For making the frame
		setSize(800, 480); // to set the size of the frame
		setVisible(true); // for switching on the visibility of the frame
		setLocation(350, 200); // for setting the location of the frame
	}

	@Override
	public void actionPerformed(ActionEvent e) {
    //this method will perform click able actions after clicking the button
		if (e.getSource() == clear) {
			cardTextField.setText(""); //to clear the text field we have use empty string
			pinTextField.setText("");
		} else if (e.getSource() == login) {

		} else if (e.getSource() == signup) {

		}

	}

	public static void main(String[] args) {
		new Login();

	}

}
