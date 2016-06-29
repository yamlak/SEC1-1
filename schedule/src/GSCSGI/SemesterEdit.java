package GSCSGI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import GSCSPD.GraduateSchool;
import GSCSPD.University;
import GSCSPD.Semester;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SemesterEdit extends JPanel {
	private JTextField textFieldName;
	private JTextField textFieldStartDate;
	private JTextField textFieldEndDate;

	/**
	 * Create the panel.
	 */
	public SemesterEdit(JFrame currentFrame, University univ, Semester semester, boolean isAdd) {
		setLayout (null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(75, 68, 94, 22);
		add(lblName);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setBounds(75, 109, 92, 14);
		add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setBounds(75, 143, 46, 14);
		add(lblEndDate);
		
		textFieldName = new JTextField(semester.getName());
		textFieldName.setBounds(212, 69, 145, 20);
		add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldStartDate = new JTextField(semester.getStartDate());
		textFieldStartDate.setBounds(212, 106, 145, 20);
		add(textFieldStartDate);
		textFieldStartDate.setColumns(10);
		
		textFieldEndDate = new JTextField(semester.getEndDate());
		textFieldEndDate.setBounds(212, 140, 145, 20);
		add(textFieldEndDate);
		textFieldEndDate.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Semester Edit");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(146, 28, 189, 27);
		add(lblNewLabel);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!isAdd && !semester.getName().equals(textFieldName.getText()))
				{
					univ.removeSemester(semester);
					semester.setName(textFieldName.getText());
					
					univ.addSemester(semester);
				}
				if (isAdd) 
				{
					semester.setName(textFieldName.getText());
					univ.addSemester(semester);
				}
				
				semester.setStartDate(textFieldStartDate.getText());
				semester.setEndDate(textFieldEndDate.getText());
							
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new UniversityEdit(currentFrame,univ));
				currentFrame.getContentPane().revalidate();
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new UniversityEdit(currentFrame,univ));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnSave.setBounds(75, 218, 89, 23);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new GSCSHome(univ));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(268, 218, 89, 23);
		add(btnCancel);

	}
}
