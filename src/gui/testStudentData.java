package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.*;

public class testStudentData extends JFrame implements ActionListener {

	JPanel P1, P2;
	JLabel lblName, lblAddress, lblPhone;
	JTextField txtName, txtAddress, txtPhone;
	JTextArea jTextArea;
	JScrollPane jsp;
	JButton btnSave, btnShow, btnClose;

	public static void main(String[] args) {
		new testStudentData();

	}

	public testStudentData() {
		initComponents();
		setProperties();
		addComponents();
		addListener();
	}

	private void initComponents() {
		lblName = new JLabel();
		lblAddress = new JLabel();
		lblPhone = new JLabel();
		txtName = new JTextField();
		txtAddress = new JTextField();
		txtPhone = new JTextField();
		btnSave = new JButton();
		btnShow = new JButton();
		btnClose = new JButton();
		P1 = new JPanel();
		P2 = new JPanel();
		jTextArea = new JTextArea();
		jsp = new JScrollPane(jTextArea);
	}

	private void setProperties() {
		setBounds(100, 100, 255, 340);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setTitle(".:Student Entry:.");

		P1.setBorder(BorderFactory.createTitledBorder("Enter Student Information"));
		P1.setBounds(0, 0, 250, 140);
		P1.setLayout(null);

		P2.setBorder(BorderFactory.createTitledBorder("All Students Information"));
		P2.setBounds(0, 140, 250, 170);
		P2.setLayout(null);

		lblName.setText("Name");
		lblName.setBounds(10, 20, 100, 25);

		lblAddress.setText("Address");
		lblAddress.setBounds(10, 50, 100, 25);

		lblPhone.setText("Phone");
		lblPhone.setBounds(10, 80, 100, 25);

		txtName.setBounds(120, 20, 120, 25);
		txtAddress.setBounds(120, 50, 120, 25);
		txtPhone.setBounds(120, 80, 120, 25);

		btnSave.setText("Save");
		btnSave.setBounds(5, 110, 70, 25);

		btnShow.setText("Show List");
		btnShow.setBounds(80, 110, 90, 25);

		btnClose.setText("Close");
		btnClose.setBounds(175, 110, 70, 25);

		jsp.setBounds(5, 20, 240, 140);
	}

	private void addComponents() {
		add(P1);
		add(P2);
		P1.add(lblName);
		P1.add(lblAddress);
		P1.add(lblPhone);
		P1.add(txtName);
		P1.add(txtAddress);
		P1.add(txtPhone);
		P1.add(btnSave);
		P1.add(btnShow);
		P1.add(btnClose);
		P2.add(jsp);
	}

	private void addListener() {
		btnSave.addActionListener(this);
		btnShow.addActionListener(this);
		btnClose.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource().equals(btnSave)) {
			if (txtName.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter Student Name.");
				txtName.requestFocus(true);
			} else if (txtAddress.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter Student Address.");
				txtAddress.requestFocus(true);
			} else if (txtPhone.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter Student Phone.");
				txtPhone.requestFocus(true);
			} else {
				saveRecord();
				return;
			}

		}
		if (ae.getSource().equals(btnShow)) {
			showAllRecord();
			return;

		}
		if (ae.getSource().equals(btnClose)) {
			if (JOptionPane.showConfirmDialog(this, "Are you sure you want to close?", "Confirm Message",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
				System.exit(0);

		}

	}

	public void saveRecord() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("StudentRecord.txt", true));
			bw.write(txtName.getText() + "|" + txtAddress.getText() + "|" + txtPhone.getText()
					+ System.getProperty("line.separator"));
			bw.flush();
			bw.close();
			txtName.setText("");
			txtAddress.setText("");
			txtPhone.setText("");
			txtName.requestFocus(true);

			JOptionPane.showMessageDialog(this, "This record is successfully save.");

		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "Save process is failed.");
		}
	}

	public void showAllRecord() {
		try {
			String line;
			BufferedReader br = new BufferedReader(new FileReader("StudentRecord.txt"));
			jTextArea.setText("");
			while ((line = br.readLine()) != null) {
				StringTokenizer stk = new StringTokenizer(line, "|");
				while (stk.hasMoreElements())
					jTextArea.append(stk.nextToken() + "\t");
				jTextArea.append("\n");

			}
			br.close();

		} catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog(this, "File is not found to read.");

		} catch (IOException ioe) {
			JOptionPane.showMessageDialog(this, "Can't read data from file.");

		}

	}
}
