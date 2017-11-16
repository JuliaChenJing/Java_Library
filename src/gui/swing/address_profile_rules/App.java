package gui.swing.address_profile_rules;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// create AddressWindow and ProfileWindow as instance variable
	AddressWindow addrWin = new AddressWindow();
	ProfileWindow profWin = new ProfileWindow();
	
	//construtor
	public App() {
		JPanel mainPanel = new JPanel();
		
		JButton addrButton = new JButton("Go to Address Window");
		addrButton.addActionListener(new AddressWindowListener());// if clicked
		
		JButton profileButton = new JButton("Go to Profile Window");
		profileButton.addActionListener(new ProfileWindowListener());//if clicked
		
		mainPanel.add(addrButton);
		mainPanel.add(profileButton);
		
		getContentPane().add(mainPanel);
		pack();
		
	}
	
	//event handler
	class AddressWindowListener implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			//if "Go to Address Window"  button is clicked
			addrWin.setVisible(true);
			profWin.setVisible(false);
		}
	}
	
	class ProfileWindowListener implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			//if ""Go to Profile Window""  button is clicked
			addrWin.setVisible(false);
			profWin.setVisible(true);
		}
	}
	
	// main method
	public static void main(String[] args) {
		//make windows visible 
		(new App()).setVisible(true);
	}

}
