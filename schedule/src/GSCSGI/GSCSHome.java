package GSCSGI;

import javax.swing.JPanel;

import GSCSPD.*;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GSCSHome extends JPanel {

	/**
	 * Create the panel with passed store.
	 */
	public GSCSHome(University university) {
		setLayout(null);
		
		//Prints out name of the store.
		JLabel lblNewLabel = new JLabel(university.getName());
		lblNewLabel.setBounds(51, 65, 372, 32);
		add(lblNewLabel);

	}

}
