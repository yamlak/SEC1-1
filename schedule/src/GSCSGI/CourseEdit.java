package GSCSGI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GSCSPD.University;
import GSCSPD.GraduateSchool; 
import GSCSPD.Course;
import GSCSPD.DegreePlanReq;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.JList;


public class CourseEdit extends JPanel {
	private JTextField txtCourseNumber;
	private JTextField txtName;
	private JTextField txtCreditHoures;
	private JTextField txtDescription;
    private ArrayList<String> courses;
	/**
	 * Create the panel.
	 */
	public CourseEdit(JFrame currentFrame, University univ, Course course, boolean isAdd ) {

		setLayout(null);
		/*courses = new ArrayList<String>();
		courses=.getDegreePlanReqs();*/
		JLabel lblCourseEdit = new JLabel("Course Edit");
		lblCourseEdit.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblCourseEdit.setBounds(169, 27, 161, 32);
		add(lblCourseEdit);
		
		JLabel lblNewLabel = new JLabel("Course Number");
		lblNewLabel.setBounds(10, 73, 84, 14);
		add(lblNewLabel);
		
		JLabel lblGradSchool = new JLabel("Course Name");
		lblGradSchool.setBounds(10, 110, 84, 14);
		add(lblGradSchool);
		
		JLabel lblDegreeName = new JLabel("Description");
		lblDegreeName.setBounds(10, 147, 84, 14);
		add(lblDegreeName);
		
		JLabel lblForecast = new JLabel("Credit Hours");
		lblForecast.setBounds(10, 173, 84, 14);
		add(lblForecast);
		
		txtCourseNumber = new JTextField(course.getNumber());
		txtCourseNumber.setBounds(120, 70, 140, 20);
		add(txtCourseNumber);
		txtCourseNumber.setColumns(10);
		
		/*DefaultComboBoxModel tcList = new DefaultComboBoxModel(univ.getGradSchoolsList());
		comboBox = new JComboBox(tcList);
		
		if(!isAdd) comboBox.setSelectedItem(univ.getGradSchoolsList());
		
		comboBox.setBounds(120, 104, 134, 27);
		add(comboBox);*/
		
		txtName = new JTextField(course.getName());
		txtName.setBounds(120, 107, 175, 20);
		add(txtName);
		txtName.setColumns(10);
		
		txtCreditHoures = new JTextField(course.getCreditHours());
		txtCreditHoures.setBounds(120, 170, 86, 20);
		add(txtCreditHoures);
		txtCreditHoures.setColumns(10);		
		
		txtDescription = new JTextField(course.getDescription());
		txtDescription.setBounds(120, 144, 86, 20);
		add(txtDescription);
		txtDescription.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isAdd && !course.getNumber().equals(txtCourseNumber.getText()))
				{
					univ.removeCourses(course);
					course.setNumber(txtCourseNumber.getText());
					univ.addCourses(course);
					
				}
				if (isAdd) 
				{
					course.setNumber(txtCourseNumber.getText());
					univ.addCourses(course);
				}
				
				course.setName(txtName.getText());
				course.setCreditHours(txtCreditHoures.getText());
				course.setDescription(txtDescription.getText());				
							
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new UniversityEdit(currentFrame,univ));
				currentFrame.getContentPane().revalidate();
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new CourseList(currentFrame,univ));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnSave.setBounds(23, 237, 89, 23);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					currentFrame.getContentPane().removeAll();
					currentFrame.getContentPane().add(new GSCSHome(univ));
					currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(156, 237, 89, 23);
		add(btnCancel);
		
		
	}
}
