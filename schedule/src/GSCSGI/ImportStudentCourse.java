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
import javax.swing.JScrollPane;


public class ImportStudentCourse extends JPanel {
	 DefaultListModel listModel; 
	 private JTable table;
	 DefaultTableModel tableModel;
	/**
	 * Create the panel.
	 */
	public ImportStudentCourse(JFrame currentFrame,University univ) {
		String fileName;
		setLayout(null);

		JFileChooser fc = new JFileChooser() ;
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int response = fc.showOpenDialog(this);
		
		
		if(response== JFileChooser.APPROVE_OPTION){
			fileName = fc.getSelectedFile().toString();
			File selectedFile = fc.getSelectedFile();
		
		StudentCoursesDM.loadStudentCourses(univ, fileName);
		}
		tableModel = new DefaultTableModel();
		listModel = new DefaultListModel();
		System.out.println("==============");
		System.out.println("StudentCourses");
		System.out.println("==============");
		for (StudentCourses studentCourse : univ.getStudentCourses())
		{
	        System.out.println(studentCourse.toString());
		
	//	tableModel.setColumnIdentifiers(entry.getValue());
		
		listModel.addElement(studentCourse);}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 48, 284, 212);
		add(scrollPane);
		//JList gradSchoolList =  new JList(listModel);
		JList list = new JList(listModel);
		scrollPane.setViewportView(list);
		
		JLabel lblImportedStudentList = new JLabel("Imported Student Course List");
		lblImportedStudentList.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblImportedStudentList.setBounds(166, 11, 249, 25);
		add(lblImportedStudentList);
		
		
		
		
	}

}
