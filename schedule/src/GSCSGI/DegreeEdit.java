package GSCSGI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GSCSPD.University;
import GSCSPD.GraduateSchool; 
import GSCSPD.Degree;
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


public class DegreeEdit extends JPanel {
	private JTextField txtDegreecode;
	private JTextField txtName;
	private JTextField txtForecast;
	private JComboBox comboBox;
    private ArrayList<String> courses;
	/**
	 * Create the panel.
	 */
	public DegreeEdit(JFrame currentFrame, University univ, GraduateSchool gradSchool, Degree degree, boolean isAdd ) {

		setLayout(null);
		/*courses = new ArrayList<String>();
		courses=.getDegreePlanReqs();*/
		JLabel lblDegreeEdit = new JLabel("Degree Edit");
		lblDegreeEdit.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblDegreeEdit.setBounds(169, 27, 161, 32);
		add(lblDegreeEdit);
		
		JLabel lblNewLabel = new JLabel("Degree Code");
		lblNewLabel.setBounds(10, 73, 84, 14);
		add(lblNewLabel);
		
		JLabel lblGradSchool = new JLabel("Grad School");
		lblGradSchool.setBounds(10, 110, 84, 14);
		add(lblGradSchool);
		
		JLabel lblDegreeName = new JLabel("Degree Name");
		lblDegreeName.setBounds(10, 147, 84, 14);
		add(lblDegreeName);
		
		JLabel lblForecast = new JLabel("Forecast");
		lblForecast.setBounds(10, 173, 84, 14);
		add(lblForecast);
		
		txtDegreecode = new JTextField(degree.getCode());
		txtDegreecode.setBounds(120, 70, 140, 20);
		add(txtDegreecode);
		txtDegreecode.setColumns(10);
		
		DefaultComboBoxModel tcList = new DefaultComboBoxModel(univ.getGradSchoolsList());
		comboBox = new JComboBox(tcList);
		
		if(!isAdd) comboBox.setSelectedItem(univ.getGradSchoolsList());
		
		comboBox.setBounds(120, 104, 134, 27);
		add(comboBox);
		
		txtName = new JTextField(degree.getName());
		txtName.setBounds(120, 144, 175, 20);
		add(txtName);
		txtName.setColumns(10);
		
		txtForecast = new JTextField(degree.getForecast());
		txtForecast.setBounds(120, 170, 86, 20);
		add(txtForecast);
		txtForecast.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isAdd && !degree.getCode().equals(txtDegreecode.getText()))
				{
					gradSchool.removeDegree(degree);
					degree.setCode(txtDegreecode.getText());
					gradSchool.addDegree(degree);
					
				}
				if (isAdd) 
				{
					degree.setCode(txtDegreecode.getText());
					gradSchool.addDegree(degree);
				}
				
				degree.setName(txtName.getText());
				degree.setGradSchool(comboBox.getSelectedItem().toString());
							
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new UniversityEdit(currentFrame,univ,gradSchool));
				currentFrame.getContentPane().revalidate();
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new DegreeList(currentFrame,univ,gradSchool));
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
		
		
		JLabel lblDegreePlanRequirment = new JLabel("Degree Plan Requirment");
		lblDegreePlanRequirment.setBounds(372, 56, 161, 14);
		add(lblDegreePlanRequirment);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(326, 237, 89, 23);
		add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(420, 237, 89, 23);
		add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(519, 237, 89, 23);
		add(btnDelete);
	}
}
