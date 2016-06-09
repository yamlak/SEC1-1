package schedule;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOklahomaChristianUniversity = new JLabel("Oklahoma Christian University ");
		lblOklahomaChristianUniversity.setForeground(new Color(51, 0, 0));
		lblOklahomaChristianUniversity.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblOklahomaChristianUniversity.setBounds(52, 38, 346, 70);
		frame.getContentPane().add(lblOklahomaChristianUniversity);
		
		
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
	}

}
