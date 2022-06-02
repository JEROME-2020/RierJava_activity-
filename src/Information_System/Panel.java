package Information_System;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Panel extends JPanel{
	
	String province[]={"Cavite","Laguna","Batangas"};
	JComboBox cb = new JComboBox(province); 
	
	JLabel heading = new JLabel("Enter your details ");
	JLabel name = new JLabel("Name: ");
	JLabel age = new JLabel("Age: ");
	JLabel gender = new JLabel("Gender: ");
	JLabel contact = new JLabel("Contact: ");
	JLabel budytext_title = new JLabel("Programming Language: ");
	JLabel address = new JLabel("Address: ");
	JLabel MunicipalityCity = new JLabel("MunicipalityCity: ");
	JLabel Province = new JLabel("Provice: ");
	JLabel Question = new JLabel("Question: ");
	
	JTextField Fld_firstname = new JTextField(15);
	JTextField Fld_Middlename = new JTextField(15);
	JTextField Fld_Lastname = new JTextField(15);
	JTextField Fld_Contact = new JTextField(15);
	JTextField Fld_age = new JTextField(15);
	JTextField Fld_Address = new JTextField(15);
	JTextField Fld_MunicipalityCity = new JTextField(15);
	
	GridBagConstraints gbc = new GridBagConstraints();

	
	JRadioButton r1 = new JRadioButton("Male");  
	JRadioButton r2 = new JRadioButton("Female");
	
	JCheckBox checkBox1 = new JCheckBox("Java", true); 
	JCheckBox checkBox2 = new JCheckBox("C++");  
	JCheckBox checkBox3 = new JCheckBox("C#", true); 
	JCheckBox checkBox4 = new JCheckBox("C");
	Insets insets = new Insets(5,5,5,5);
	
	JTextArea txtAreaOne = new JTextArea(""); 
	
	JButton btnAdd = new JButton("Add");
	JButton btnSave = new JButton("Save");
	
	
	public Panel(){
		
		setLayout(new GridBagLayout());
		setBackground(new Color(200, 200, 220, 255));
		checkBox1.setPreferredSize(new Dimension(110,20));
		checkBox2.setPreferredSize(new Dimension(110,20));
		checkBox3.setPreferredSize(new Dimension(110,20));
		checkBox4.setPreferredSize(new Dimension(110,20));
		cb.setPreferredSize(new Dimension(135,21)); 
		txtAreaOne.setPreferredSize(new Dimension(135,135));

		
		gbc.insets = new Insets(10, 10, 10, 10);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(heading, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(name, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		add(Fld_firstname, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 1;
		add(Fld_Middlename, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 1;
		add(Fld_Lastname, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(age, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		add(Fld_age, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(gender, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 4;
		add(r1, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 4;
		add(r2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		add(contact, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 5;
		add(Fld_Contact, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 5;
		add(budytext_title, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		add(address, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 6;
		add(Fld_Address, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 6;
		add(checkBox1, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 6;
		add(checkBox2, gbc);
		
		
		gbc.gridx = 0;
		gbc.gridy = 7;
		add(MunicipalityCity, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 7;
		add(Fld_MunicipalityCity, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 7;
		add(checkBox3, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 7;
		add(checkBox4, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 8;
		add(Province, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 8;
		add(cb, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 9;
		add(Question, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 9;
		add(txtAreaOne, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 10;
		add(btnAdd, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 10;
		add(btnSave, gbc);
		
		
		
		
	}
}
