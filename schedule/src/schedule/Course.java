package schedule;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollBar;

public class Course {

	private JFrame frame;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Course window = new Course();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Course() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setForeground(Color.GRAY);
		frame.setBounds(100, 100, 464, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnImport = new JMenu("Import");
		mnImport.setForeground(new Color(51, 0, 0));
		mnImport.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnImport);
		
		JMenu mnStudentList = new JMenu("Student List");
		mnImport.add(mnStudentList);
		
		JMenuItem mntmStudentCourse = new JMenuItem("Student Course ");
		mnImport.add(mntmStudentCourse);
		
		JMenu mnMaintenance = new JMenu("Maintenance");
		mnMaintenance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnMaintenance.setForeground(new Color(51, 0, 0));
		menuBar.add(mnMaintenance);
		
		JMenu mnFaculty = new JMenu("Faculty");
		mnMaintenance.add(mnFaculty);
		
		JMenuItem mntmCourse = new JMenuItem("Course");
		mnMaintenance.add(mntmCourse);
		
		JMenuItem mntmRoom = new JMenuItem("Room");
		mnMaintenance.add(mntmRoom);
		
		JMenuItem mntmDegree = new JMenuItem("Degree");
		mnMaintenance.add(mntmDegree);
		
		JMenuItem mntmUniversity = new JMenuItem("University");
		mnMaintenance.add(mntmUniversity);
		
		JMenuItem mntmGradSchool = new JMenuItem("Grad School");
		mnMaintenance.add(mntmGradSchool);
		
		JMenuItem mntmSemester = new JMenuItem("Semester");
		mnMaintenance.add(mntmSemester);
		
		JMenu mnSchedule = new JMenu("Schedule");
		mnSchedule.setForeground(new Color(51, 0, 0));
		mnSchedule.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnSchedule);
		
		JMenu mnGenerateSchedule = new JMenu("Generate Schedule");
		mnSchedule.add(mnGenerateSchedule);
		
		JMenuItem mntmTestSchedule = new JMenuItem("Test Schedule");
		mnSchedule.add(mntmTestSchedule);
		
		JMenu mnReport = new JMenu("Report");
		mnReport.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnReport.setForeground(new Color(51, 0, 0));
		menuBar.add(mnReport);
		
		JMenu mnScheduleReport = new JMenu("Schedule Report");
		mnReport.add(mnScheduleReport);
		
		JMenuItem mntmFacultyLoadReport = new JMenuItem("Faculty Load Report");
		mnReport.add(mntmFacultyLoadReport);
		
		JMenuItem mntmStudentReport = new JMenuItem("Student Report ");
		mnReport.add(mntmStudentReport);
		
		JMenuItem mntmDegreePlanReport = new JMenuItem("Degree Plan Report");
		mnReport.add(mntmDegreePlanReport);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnReport.add(menuBar_1);
		
		JMenu mnSystem = new JMenu("System");
		mnSystem.setForeground(new Color(51, 0, 0));
		mnSystem.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnSystem);
		
		JMenu mnAddUser = new JMenu("Add User");
		mnSystem.add(mnAddUser);
		
		table_1 = new JTable();
		table_1.setBounds(74, 251, 287, 98);
		frame.getContentPane().add(table_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(74, 206, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(175, 206, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(272, 206, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Course Number");
		lblNewLabel.setBounds(74, 84, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Course Name");
		lblNewLabel_1.setBounds(74, 109, 89, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTitle = new JLabel("Course Start Date");
		lblTitle.setBounds(74, 134, 89, 14);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblDaystoteach = new JLabel("Course End Date");
		lblDaystoteach.setBounds(74, 159, 89, 14);
		frame.getContentPane().add(lblDaystoteach);
		
		textField = new JTextField();
		textField.setBounds(175, 81, 186, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 106, 186, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(175, 131, 186, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(175, 156, 186, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Course Edit");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(175, 11, 114, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Select data from the table toUpdate/Delete");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(90, 48, 272, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(344, 251, 17, 74);
		frame.getContentPane().add(scrollBar);
	}
}
