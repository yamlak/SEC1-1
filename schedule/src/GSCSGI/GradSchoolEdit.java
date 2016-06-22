package GSCSGI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GSCSPD.University;

import GSCSPD.GraduateSchool;

public class GradSchoolEdit extends JPanel {
	
	private JTextField AbbreviationtextField;

	/**
	 * Create the panel.
	 */
	public GradSchoolEdit(JFrame currentFrame, University univ, GraduateSchool gradSchool, boolean isAdd) {
		
setLayout(null);
		
		//Title of the panel
		JLabel lblEditUniversity = new JLabel("Edit GradSchool");
		 lblEditUniversity.setBounds(234, 35, 145, 20);
		add( lblEditUniversity);
		
		//Label that indicates the name of the University
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(173, 77, 61, 16);
		add(lblName);
		
		//Text Field that displays the name of the University
		JTextField textField = new JTextField(gradSchool.getName());
		textField.setBounds(281, 66, 258, 28);
		add(textField);
		textField.setColumns(10);
		
		//Label that indicates the name of the University
		JLabel lblAbbreviation = new JLabel("Abbreviation :");
		lblAbbreviation.setBounds(173, 110, 114, 16);
		add(lblAbbreviation);
		
		//Text Field that displays the name of the Abbreviation of gradSchool
		AbbreviationtextField = new JTextField(gradSchool.getAbbreviation());
		AbbreviationtextField.setBounds(281, 105, 334, 28);
		add(AbbreviationtextField);
		AbbreviationtextField.setColumns(10);
		
		
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isAdd && !gradSchool.getAbbreviation().equals(AbbreviationtextField.getText()))
				{
					univ.removeGradSchools(gradSchool);
					gradSchool.setAbbreviation(AbbreviationtextField.getText());
					
					univ.addGradSchools(gradSchool);
				}
				if (isAdd) 
				{
					gradSchool.setAbbreviation(AbbreviationtextField.getText());
					univ.addGradSchools(gradSchool);
				}
				
				gradSchool.setName(textField.getText());
							
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new UniversityEdit(currentFrame,univ));
				currentFrame.getContentPane().revalidate();
//				univ.setName(textField.getText());
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new GSCSHome(univ));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnSave.setBounds(61, 360, 117, 29);
		add(btnSave);
		
		/**
		 * Button Cancel takes user back to home screen.
		 */
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new GSCSHome(univ));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(335, 360, 117, 29);
		add(btnCancel);

	}

}
