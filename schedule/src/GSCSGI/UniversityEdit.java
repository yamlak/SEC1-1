package GSCSGI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import GSCSPD.*;


import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JTable;


public class UniversityEdit extends JPanel {
	private JTextField textField;
	private JTextField textFieldAbbreviation;
	private JTextField textFieldName;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDelete; 
	private JButton btnAdd_1;
	private JButton btnUpdate_1; 
	private JButton btnDelete_1;
	private DefaultListModel gradSchoolListModel;
	private DefaultListModel semesterListModel;
	 JList list; 
	

	/**
	 * Create the panel with passed current frame and store.
	 */
	public UniversityEdit(JFrame currentFrame, University univ, GraduateSchool gradSchool) {
		
		setLayout(null);
		
		//Title of the panel
		JLabel lblEditUniversity = new JLabel("Edit University");
		 lblEditUniversity.setBounds(234, 35, 145, 20);
		add( lblEditUniversity);
		
		//Label that indicates the name of the University
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(245, 77, 61, 16);
		add(lblName);
		
		//Text Field that displays the name of the University
		textFieldName = new JTextField(univ.getName());
		textFieldName.setBounds(309, 71, 258, 28);
		add(textFieldName);
		textFieldName.setColumns(10);
		
		//Label that indicates the name of the University
		JLabel lblAbbreviation = new JLabel("Abbreviation :");
		lblAbbreviation.setBounds(203, 105, 114, 16);
		add(lblAbbreviation);
		
		//Text Field that displays the name of the University
		textFieldAbbreviation = new JTextField(univ.getAbbreviation());
		textFieldAbbreviation.setBounds(294, 104, 334, 28);
		add(textFieldAbbreviation);
		textFieldAbbreviation.setColumns(10);
		
		gradSchoolListModel = new DefaultListModel();
		for (Entry<String, GraduateSchool> gradSchoolEntry : univ.getGradSchools().entrySet())
		gradSchoolListModel.addElement(gradSchoolEntry.getValue());
		JList gradSchoolList =  new JList(gradSchoolListModel);
		gradSchoolList.setBounds(61,161,138,112);
		gradSchoolList.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e) {
				if (gradSchoolList.getSelectedValue() != null ) 
				{
					btnUpdate.setEnabled(true);
				}
				if(gradSchoolList.getSelectedValue() == null  )
				{
					btnDelete.setEnabled(false);
				}
				else
				{
					btnDelete.setEnabled(true);
				}
			}
		});
		JScrollPane scrollpane = new JScrollPane(gradSchoolList);
		scrollpane.setBounds(136,170,145,133);
		add(scrollpane, BorderLayout.CENTER);
		
		//gradSchoolList.setBounds(61, 161, 158, 138);
		//add(gradSchoolList);

		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new GradSchoolEdit(currentFrame, univ,(GraduateSchool)gradSchoolList.getSelectedValue(),false));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnUpdate.setBounds(126, 326, 67, 23);
		btnUpdate.setEnabled(false);
		add(btnUpdate);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new GradSchoolEdit(currentFrame, univ,new GraduateSchool(),true));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnAdd.setBounds(49, 326, 67, 23);
		add(btnAdd);
		
					 
			JLabel lblGradSchools = new JLabel(" Grad Schools");
			lblGradSchools.setBounds(138, 143, 82, 16);
			add(lblGradSchools);
			
			JLabel lblSemester = new JLabel(" Semester");
			lblSemester.setBounds(456, 143, 80, 16);
			add(lblSemester);
			
				
		/**
		 * Button Save saves new name of the store and takes user to home screen.
		 */
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				univ.setName(textField.getText());
				univ.setAbbreviation(textFieldAbbreviation.getText());
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
		
	
		
	
		
	    btnDelete = new JButton("Delete");
	    btnDelete.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		univ.removeGradSchools((GraduateSchool)gradSchoolList.getSelectedValue());
				gradSchoolListModel.removeElement(gradSchoolList.getSelectedValue());
	    	}
	    });
	    btnDelete.setEnabled(false);
		btnDelete.setBounds(203, 326, 89, 23);
		add(btnDelete);
		
		btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new SemesterEdit(currentFrame, univ, gradSchool, new Semester(),true));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnAdd_1.setBounds(381, 326, 67, 23);
		add(btnAdd_1);
		
				
		
		
		semesterListModel = new DefaultListModel(); 
		for (Entry<String, Semester> semesterEntry : univ.getSemesters().entrySet())
		semesterListModel.addElement(semesterEntry.getValue());
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(400, 161, 158, 138);
		add(scrollPane);
		JList semesterList = new JList(semesterListModel);
		scrollPane.setViewportView(semesterList);
		
		semesterList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		semesterList.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e) {
				if (semesterList.getSelectedValue() != null ) 
				{
					btnUpdate_1.setEnabled(true);
				}

				if(semesterList.getSelectedValue() == null )
				{
					btnDelete_1.setEnabled(false);
				}
				else
				{
					btnDelete_1.setEnabled(true);
				}
			}
		});
		
		btnUpdate_1 = new JButton("Update");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new SemesterEdit(currentFrame, univ, gradSchool,(Semester)semesterList.getSelectedValue(),false));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnUpdate_1.setEnabled(false);
		btnUpdate_1.setBounds(456, 326, 87, 23);
		add(btnUpdate_1);

		btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				univ.removeSemester((Semester)semesterList.getSelectedValue());
				semesterListModel.removeElement(semesterList.getSelectedValue());
			}
		});
		btnDelete_1.setEnabled(false);
		btnDelete_1.setBounds(555, 326, 73, 23);
		add(btnDelete_1);
	
		
	}
}
