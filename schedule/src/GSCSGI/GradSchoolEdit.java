package GSCSGI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map.Entry;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import GSCSPD.University;
import GSCSPD.Degree;
import GSCSPD.GraduateSchool;

public class GradSchoolEdit extends JPanel {
	
	private JTextField AbbreviationtextField;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDelete; 
	private DefaultListModel listModel;

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
				currentFrame.getContentPane().add(new UniversityEdit(currentFrame,univ, gradSchool));
				currentFrame.getContentPane().revalidate();
//				univ.setName(textField.getText());
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new UniversityEdit(currentFrame,univ, gradSchool));
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
		
		JLabel lblDegreeList = new JLabel("Degree List");
		lblDegreeList.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblDegreeList.setBounds(395, 137, 153, 30);
		add(lblDegreeList);
		
		
		
		//get all Degrees
				listModel = new DefaultListModel();
				for (Entry<String, Degree> degreeEntry :gradSchool.getDegrees().entrySet())
				listModel.addElement(degreeEntry.getValue());
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(406, 186, 194, 128);
				add(scrollPane);
		JList list = new JList(listModel);
		scrollPane.setColumnHeaderView(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
			
			if (list.getSelectedValue() != null ) 
			{// System.out.println(list.getSelectedValue());
				btnUpdate.setEnabled(true);
			}
			if(list.getSelectedValue() == null  )
			{
				btnDelete.setEnabled(false);
			}
			else
			{
			   btnDelete.setEnabled(true);
			}
		}
		
		});
	
		//JButton
		btnUpdate = new JButton("Update");
		btnUpdate.setEnabled(false);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new DegreeEdit(currentFrame,univ, gradSchool,(Degree)list.getSelectedValue(),false));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnUpdate.setBounds(178, 277, 89, 23);
		add(btnUpdate);
		btnUpdate.setEnabled(false);

		//JButton
		btnDelete = new JButton("Delete");
		btnDelete.setEnabled(false);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gradSchool.removeDegree((Degree)list.getSelectedValue());
				listModel.removeElement(list.getSelectedValue());
			}
		});
		btnDelete.setBounds(294, 273, 89, 23);
		add(btnDelete);
		btnUpdate.setEnabled(false);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new DegreeEdit(currentFrame,univ, gradSchool,new Degree(),true));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnAdd.setBounds(52, 275, 89, 23);
		add(btnAdd);
		
		

	}

}
