package GSCSGI;

import java.io.File;
import java.util.Map.Entry;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import GSCSDM.StudentDM;
import GSCSPD.*;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;


public class ImportStudent extends JPanel {
	 DefaultListModel listModel; 
	 private JTable table;
	 DefaultTableModel tableModel;
	 private JPanel contentPane;
	 private JFrame currentFrame;
	/**
	 * Create the panel.
	 */
	public ImportStudent(JFrame currentFrame,University univ) {
		String fileName;
		setLayout(null);

		JFileChooser fc = new JFileChooser() ;
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int response = fc.showOpenDialog(this);
		
		
		if(response== JFileChooser.APPROVE_OPTION){
			fileName = fc.getSelectedFile().toString();
			File selectedFile = fc.getSelectedFile();
		
		StudentDM.loadStudent(univ, fileName);
		}
		tableModel = new DefaultTableModel();
		listModel = new DefaultListModel();
		System.out.println("==============");
		System.out.println("Student"); 
		System.out.println("==============");
		for (Entry<String, Student> entry : univ.getStudents().entrySet()) 
		{
	        System.out.println(entry.getValue().toString());
	        
	//	tableModel.setColumnIdentifiers(entry.getValue());
		
		listModel.addElement(entry.getValue());
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 48, 368, 212);
		add(scrollPane);
		//JList gradSchoolList =  new JList(listModel);
		JList list = new JList(listModel);
		scrollPane.setViewportView(list);
		
		JLabel lblImportedStudentList = new JLabel("Imported Student List");
		lblImportedStudentList.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblImportedStudentList.setBounds(166, 11, 249, 25);
		add(lblImportedStudentList);
		JButton btnImportstudentcourse = new JButton("ImportStudentCourse");
		btnImportstudentcourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new ImportStudentCourse(currentFrame,univ));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnImportstudentcourse.setBounds(432, 14, 89, 23);
		add(btnImportstudentcourse);
		
	}

}
