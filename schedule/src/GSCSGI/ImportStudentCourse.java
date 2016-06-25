package GSCSGI;

import java.io.File;
import java.util.Map.Entry;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import GSCSDM.StudentCoursesDM;
import GSCSPD.*;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ImportStudentCourse extends JPanel {
	 DefaultListModel listModel; 
	 private JTable table;
	 DefaultTableModel tableModel;
	/**
	 * Create the panel.
	 */
	public ImportStudentCourse(JFrame currentFrame,University univ,GraduateSchool gradSchool) {
		String fileName;
		setLayout(null);

		JFileChooser fc = new JFileChooser() ;
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int response = fc.showOpenDialog(this);
		
		
		if(response== JFileChooser.APPROVE_OPTION){
			fileName = fc.getSelectedFile().toString();
			File selectedFile = fc.getSelectedFile();
		
		StudentCoursesDM.loadStudentCourses(gradSchool, fileName);
		}
		tableModel = new DefaultTableModel();
		listModel = new DefaultListModel();
		System.out.println("==============");
		System.out.println("StudentCourses");
		System.out.println("==============");
		for (StudentCourses studentCourse : gradSchool.getStudentCourses())
		{
	        System.out.println(studentCourse.toString());
		
	//	tableModel.setColumnIdentifiers(entry.getValue());
		
		listModel.addElement(studentCourse);}
		//JList gradSchoolList =  new JList(listModel);
		JList list = new JList(listModel);
		list.setBounds(56, 48, 358, 212);
		add(list);
		
		JLabel lblImportedStudentList = new JLabel("Imported Student Course List");
		lblImportedStudentList.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblImportedStudentList.setBounds(166, 11, 249, 25);
		add(lblImportedStudentList);
		
		
		
		
	}

}