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
import GSCSPD.Degree;
import GSCSPD.DegreePlanReq;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class DegreePlanList extends JPanel {

	/**
	 * Create the panel.
	 */
		private JButton btnAdd;
		private JButton btnUpdate;
		private JButton btnDelete; 
		private DefaultListModel listModel;
		private DefaultListModel listModelC;
		private JTextField txtDegree;
		private JTextField txtDescription;
		private JTextField txtType;
		private JTextField txtHours;
	
	public DegreePlanList(JFrame currentFrame, University univ, GraduateSchool gradSchool,Degree degree, DegreePlanReq degreePlan, boolean isAdd) {
	//	JList list = new JList(listModel);
		setLayout(null);
		 
		JLabel lblDegreeList = new JLabel("Degree Plan Requirment List");
		lblDegreeList.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblDegreeList.setBounds(143, 14, 250, 10);
		add(lblDegreeList);
		
		listModel = new DefaultListModel();
		for (Entry<String, Course> courseEntry : univ.getCourses().entrySet())
		listModel.addElement(courseEntry.getValue());
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(175, 266, 260, 130);
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
		
		btnUpdate = new JButton("Update");
		btnUpdate.setEnabled(false);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new DegreeEdit(currentFrame,univ, gradSchool,degree,false));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnUpdate.setBounds(178, 232, 89, 23);
		add(btnUpdate);
		btnUpdate.setEnabled(false);

		//JButton
		btnDelete = new JButton("Delete");
		btnDelete.setEnabled(false);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gradSchool.removeDegree((Degree)list.getSelectedValue());
				listModel.removeElement(list.getSelectedValue());
			}
		});
		btnDelete.setBounds(289, 232, 89, 23);
		add(btnDelete);
		btnUpdate.setEnabled(false);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new DegreeEdit(currentFrame,univ, gradSchool,new Degree(),true));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnAdd.setBounds(61, 232, 89, 23);
		add(btnAdd);
		
		JLabel lblDegree = new JLabel("Degree");
		lblDegree.setBounds(51, 68, 66, 14);
		add(lblDegree);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(51, 97, 76, 14);
		add(lblDescription);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(51, 135, 46, 14);
		add(lblType);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setBounds(51, 160, 46, 14);
		add(lblHours);
		
		JLabel lblCourses = new JLabel("Courses");
		lblCourses.setBounds(51, 185, 66, 14);
		add(lblCourses);
		
		txtDegree = new JTextField(degreePlan.getDegree().getCode());
		txtDegree.setBounds(163, 65, 190, 20);
		add(txtDegree);
		txtDegree.setColumns(10);
		
		txtDescription = new JTextField(degreePlan.getDescriptions());
		txtDescription.setBounds(163, 94, 190, 20);
		add(txtDescription);
		txtDescription.setColumns(10);
		
		txtType = new JTextField(degreePlan.getType());
		txtType.setBounds(163, 125, 190, 20);
		add(txtType);
		txtType.setColumns(10);
		
		txtHours = new JTextField(degreePlan.getHours());
		txtHours.setBounds(163, 156, 86, 20);
		add(txtHours);
		txtHours.setColumns(10);
		
		DefaultComboBoxModel tcList = new DefaultComboBoxModel(degreePlan.getCourses().toArray());
		JComboBox cbCourses = new JComboBox(tcList);		
		cbCourses.setEditable(true);
		if(!isAdd) cbCourses.setSelectedItem(tcList);
		cbCourses.setBounds(163, 182, 190, 20);
		add(cbCourses);
		 
		
	
JButton btnSave = new JButton("Save");
btnSave.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if (!isAdd && !degreePlan.getDegree().getCode().equals(txtDegree.getText()))
		{
			//degree.removeDegree(degree);
			degreePlan.setDegree(univ.findDegree(txtDegree.getText()));
			degree.addDegreePlanReq(degreePlan);
			
		}
		if (isAdd) 
		{
			degreePlan.setDegree(univ.findDegree(txtDegree.getText())); 
			gradSchool.addDegree(degree);
		}
		for(int i = 0; i<list.getSelectedValuesList().size();i++)
    	{    		//System.out.println("token length"    + "    "   +token2[i]);
    	degreePlan.setCourses(univ.findCourse(list.getModel().getElementAt(i).toString())); 
    	}
			
		degreePlan.setType(txtType.getText());
		degreePlan.setDescriptions(txtDescription.getText());
		degreePlan.setHours(txtHours.getText());
		//degree.setGradSchool((GraduateSchool)comboBox.getSelectedItem());
					
		currentFrame.getContentPane().removeAll();
		currentFrame.getContentPane().add(new UniversityEdit(currentFrame,univ));
		currentFrame.getContentPane().revalidate();
		currentFrame.getContentPane().removeAll();
		currentFrame.getContentPane().add(new GradSchoolEdit(currentFrame,univ,gradSchool,isAdd));
		currentFrame.getContentPane().revalidate();
	}
});
btnSave.setBounds(61, 266, 89, 23);
add(btnSave);


		
	}

}
