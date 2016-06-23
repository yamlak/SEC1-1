package GSCSGI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GSCSPD.*;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GSCSJFrame extends JFrame {

	private JPanel contentPane;
	private JFrame currentFrame;

	/**
	 * Create the frame with passed store.
	 */
	public GSCSJFrame(University univ, GraduateSchool gradSchool) {
		currentFrame = this;
		//GraduateSchool gradSchool = new GraduateSchool() ;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 473);
		
		//menu bar for the menus
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//menu for maintain
		JMenu mnMaintain = new JMenu("Maintain");
		menuBar.add(mnMaintain);
		
		//menu item in Maintain. When clicked takes user to University page
		JMenuItem mntmUniversity = new JMenuItem("University");
		mntmUniversity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new UniversityEdit(currentFrame,univ, gradSchool));
				getContentPane().revalidate();
			}
		});
		
		mnMaintain.add(mntmUniversity);
		
		//menu item in Maintain. When clicked takes user to Degree page
		JMenuItem mntmDegree = new JMenuItem("Degree");
		mntmDegree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new DegreeList(currentFrame,univ,gradSchool));
				getContentPane().revalidate();
			}
		});
		mnMaintain.add(mntmDegree);
		
		//Menu item in Maintain. When clicked takes user to Faculty page
		JMenuItem mntmFaculty = new JMenuItem("Faculty");
		mntmFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				//getContentPane().add(new FacultyListPanel(currentFrame,univ));
				getContentPane().revalidate();
			}
		});
		mnMaintain.add(mntmFaculty);
		
		//Menu item in Maintain. When clicked takes user to Item page
		JMenuItem mntmCourse = new JMenuItem("Course");
		mntmCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
			//	getContentPane().add(new CourseListPanel(currentFrame,univ));
				getContentPane().revalidate();
			}
		});
		mnMaintain.add(mntmCourse);
		
		//Menu item in Maintain. When clicked takes user to Tax Category page
		JMenuItem mntmClassRoom = new JMenuItem("ClassRoom");
		mntmClassRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				//getContentPane().add(new ClassRoomListPanel(currentFrame,univ));
				getContentPane().revalidate();
			}
		});
		mnMaintain.add(mntmClassRoom);
		
		//Menu for menu items 
		JMenu mnImport = new JMenu("Import");
		menuBar.add(mnImport);
		
		//Menu item in Maintain. When clicked takes user to Faculty page
				JMenuItem mntmStudent = new JMenuItem("Student");
				mntmStudent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						getContentPane().removeAll();
						//getContentPane().add(new StudentListPanel(currentFrame,univ));
						getContentPane().revalidate();
					}
				});
				mnMaintain.add(mntmStudent);
				
				//Menu item in Maintain. When clicked takes user to Item page
				JMenuItem mntmStudentCourse = new JMenuItem("StudentCourse");
				mntmStudentCourse.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						getContentPane().removeAll();
					//	getContentPane().add(new StudentCourseListPanel(currentFrame,univ));
						getContentPane().revalidate();
					}
				});
				mnMaintain.add(mntmStudentCourse);
		
		
		
		//Menu for menu items
		JMenu mnReports = new JMenu("Reports");
		menuBar.add(mnReports);
		
		//Menu item  in Reports. When clicked takes user to Schedule Report page
		JMenuItem mntmScheduleReport = new JMenuItem("Schedule Report");
		mntmScheduleReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
		//		getContentPane().add(new ScheduleReportPanel(currentFrame,univ));
				getContentPane().revalidate();
			}
		});
		mnReports.add(mntmScheduleReport);
		
		//Menu item in Reports. When clicked takes user to Faculty Load Report page
		JMenuItem mntmFacultyLoadReport = new JMenuItem("Faculty Load Report");
		mntmFacultyLoadReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
			//	getContentPane().add(new FacultyLoadReportPanel(currentFrame,univ));
				getContentPane().revalidate();
			}
		});
		mnReports.add(mntmFacultyLoadReport);
		

		//Menu for menu items
		JMenu mnSystem = new JMenu("System");
		menuBar.add(mnSystem);
		
		//Menu item in POS. When clicked it takes user to Login page
				JMenuItem mntmLogin = new JMenuItem("Login");
				mntmLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						getContentPane().removeAll();
						//getContentPane().add(new SystemLogin(currentFrame,univ));
						getContentPane().revalidate();
					}
				});
				mnSystem.add(mntmLogin);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		getContentPane().removeAll();

		getContentPane().add(new GSCSHome(univ));

		getContentPane().revalidate();
	}
	/**
	 * Launch the application.
	 */

	public static void run(University univ, GraduateSchool gradSchool) {
		try {
			JFrame frame = new GSCSJFrame(univ,gradSchool);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
