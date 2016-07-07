package GSCSGI;

import java.awt.Font;
import java.util.Map.Entry;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import GSCSPD.Degree;
import GSCSPD.Faculty;
import GSCSPD.GraduateSchool;
import GSCSPD.University;

import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FacultyList extends JPanel {

	/**
	 * Create the panel.
	 */
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDelete; 
	private DefaultListModel listModel;
	private DefaultListModel listModel1;
	private JList list_1;

	public FacultyList(JFrame currentFrame, University univ) {
		setLayout(null);
		
		JLabel lblFacultyList = new JLabel("Faculty List");
		lblFacultyList.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblFacultyList.setBounds(141, 13, 153, 30);
		add(lblFacultyList);
		
		//get all Faculty List
		
		
		
				listModel = new DefaultListModel();
				for (Entry<String, Faculty> facultyEntry : univ.getFaculties().entrySet())
				listModel.addElement(facultyEntry.getValue());
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(62, 53, 315, 152);
				add(scrollPane);

						
		JList list = new JList(listModel);
		scrollPane.setViewportView(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				if (list.getSelectedValue() != null ) 
				{ 
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
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new FacultyEdit(currentFrame,univ,new Faculty(),true));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnAdd.setBounds(45, 242, 97, 25);
		add(btnAdd);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new FacultyEdit(currentFrame,univ,(Faculty)list.getSelectedValue(),false));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnUpdate.setBounds(192, 242, 97, 25);
		add(btnUpdate);
		btnUpdate.setEnabled(false);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				univ.removeFaculty((Faculty)list.getSelectedValue());
				listModel.removeElement(list.getSelectedValue());
			}
		});
		btnDelete.setBounds(325, 242, 97, 25);
		add(btnDelete);
		btnDelete.setEnabled(false);
		

	}
}
