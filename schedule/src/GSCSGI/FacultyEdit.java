package GSCSGI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import GSCSPD.DegreePlanReq;
import GSCSPD.Faculty;
import GSCSPD.GraduateSchool;
import GSCSPD.University;
import GSCSPD.Semester;
import GSCSPD.FacultyLoad;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class FacultyEdit extends JPanel {
	private JTextField txtName;
	private JTextField txtFName;
	private JTextField txtDaystoTeach;
	private JTextField txtgradSchool;
	private JTextField txtTitle;
	private DefaultListModel listModel;

	/**
	 * Create the panel.
	 */
	public FacultyEdit(JFrame currentFrame, University univ, Faculty faculty, boolean isAdd) {
		setLayout (null);
		
		JLabel lblLName = new JLabel("Last Name");
		lblLName.setBounds(10, 68, 94, 22);
		add(lblLName);
		
		JLabel lblFName = new JLabel("First Name");
		lblFName.setBounds(10, 97, 104, 22);
		add(lblFName);
		
		JLabel lblStartDate = new JLabel("Degree");
		lblStartDate.setBounds(10, 127, 92, 14);
		add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("Title");
		lblEndDate.setBounds(10, 152, 46, 14);
		add(lblEndDate);
		
		txtName = new JTextField(faculty.getLastName());
		txtName.setBounds(98, 69, 145, 20);
		add(txtName);
		txtName.setColumns(10);
		
		txtFName = new JTextField(faculty.getFirstName());
		txtFName.setBounds(98, 98, 165, 20);
		add(txtFName);
		txtFName.setColumns(10);
		
		txtgradSchool = new JTextField(faculty.getDegree());
		txtgradSchool.setBounds(98, 124, 145, 20);
		add(txtgradSchool);
		txtgradSchool.setColumns(10);
		
		txtTitle = new JTextField(faculty.getTitle());
		txtTitle .setBounds(98, 152, 145, 20);
		add(txtTitle );
		txtTitle .setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Faculty Edit");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(146, 28, 189, 27);
		add(lblNewLabel);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!isAdd && !faculty.getLastName().equals(txtName.getText()))
				{
					univ.removeFaculty(faculty);
					faculty.setLastName(txtName.getText());
					
					univ.addFaculty(faculty);
				}
				if (isAdd) 
				{
					faculty.setFirstName(txtFName.getText());
					faculty.setDegree(txtgradSchool.getText());
					faculty.setTitle(txtTitle.getText());
					univ.addFaculty(faculty);
				}
				
				faculty.setFirstName(txtFName.getText());
				faculty.setDegree(txtgradSchool.getText());
				faculty.setTitle(txtTitle.getText());
				univ.addFaculty(faculty);
							
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new UniversityEdit(currentFrame,univ));
				currentFrame.getContentPane().revalidate();
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new FacultyList(currentFrame,univ));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnSave.setBounds(75, 218, 89, 23);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new FacultyList(currentFrame,univ));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(199, 218, 89, 23);
		add(btnCancel);
		
		listModel = new DefaultListModel();
		for (FacultyLoad facultyLoad : faculty.getFacultyLoad()){
			listModel.addElement(facultyLoad);
		//	System.out.println(facultyLoad.getFaculty()+ "faculty load");
			}
		//	System.out.println(degree.getDegreePlanReqs());
		//	JScrollPane scrollPane = new JScrollPane();
		//	scrollPane.setBounds(326, 73, 282, 156);
		//	add(scrollPane);
		JList list = new JList(listModel);
		list.setBounds(381, 68, 245, 117);
		add(list); 

	}
}
