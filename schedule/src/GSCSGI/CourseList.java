package GSCSGI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import GSCSPD.GraduateSchool;
import GSCSPD.University;
import GSCSPD.Course;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class CourseList extends JPanel {

	/**
	 * Create the panel.
	 */
		private JButton btnAdd;
		private JButton btnUpdate;
		private JButton btnDelete; 
		private DefaultListModel listModel;
	
	public CourseList(JFrame currentFrame, University univ, GraduateSchool gradSchool) {
	//	JList list = new JList(listModel);
		setLayout(null);
		 
		JLabel lblCourseList = new JLabel("Course List");
		lblCourseList.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblCourseList.setBounds(143, 34, 153, 30);
		add(lblCourseList);
		
		
		
		//get all Degrees
				listModel = new DefaultListModel();
				for (Entry<String, Course> courseEntry : univ.getCourses().entrySet())
				listModel.addElement(courseEntry.getValue());
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(81, 85, 260, 130);
				add(scrollPane);
		JList list = new JList(listModel);
		scrollPane.setViewportView(list);
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
				currentFrame.getContentPane().add(new CourseEdit(currentFrame,univ, gradSchool,(Course)list.getSelectedValue(),false));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnUpdate.setBounds(177, 246, 89, 23);
		add(btnUpdate);
		btnUpdate.setEnabled(false);

		//JButton
		btnDelete = new JButton("Delete");
		btnDelete.setEnabled(false);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				univ.removeCourses((Course)list.getSelectedValue());
				listModel.removeElement(list.getSelectedValue());
			}
		});
		btnDelete.setBounds(289, 246, 89, 23);
		add(btnDelete);
		btnUpdate.setEnabled(false);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new CourseEdit(currentFrame,univ, gradSchool,new Course(),true));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnAdd.setBounds(51, 246, 89, 23);
		add(btnAdd);
		
		
		
		
	}

}
