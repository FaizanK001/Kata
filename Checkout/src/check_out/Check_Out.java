package check_out;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Check_Out {

	private JFrame frmCheckOutSystem;
	private JTextField textFieldD;
	private JTextField textFieldA;
	private JTextField textFieldB;
	private JTextField textFieldC;
	private JTextField textFieldTax;
	private JTextField subTotal;
	private JTextField Tax;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check_Out window = new Check_Out();
					window.frmCheckOutSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Check_Out() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckOutSystem = new JFrame();
		frmCheckOutSystem.setTitle("Check Out System");
		frmCheckOutSystem.setBounds(0, 0, 900, 500);
		frmCheckOutSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckOutSystem.getContentPane().setLayout(new GridLayout(1, 3, 3, 3));

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frmCheckOutSystem.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 2, 2, 2));

		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnA);

		JButton btnB = new JButton("B");
		panel.add(btnB);

		JButton btnC = new JButton("C");
		panel.add(btnC);

		JButton btnD = new JButton("D");
		panel.add(btnD);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frmCheckOutSystem.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 4, 1, 1));

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(10, 2, 0, 0));

		JCheckBox chckbxA = new JCheckBox("A");
		panel_4.add(chckbxA);

		JCheckBox chckbxB = new JCheckBox("B");
		panel_4.add(chckbxB);

		JCheckBox chckbxC = new JCheckBox("C");
		panel_4.add(chckbxC);

		JCheckBox chckbxD = new JCheckBox("D");
		panel_4.add(chckbxD);

		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(10, 2, 2, 2));

		textFieldA = new JTextField();
		panel_5.add(textFieldA);
		textFieldA.setColumns(10);

		textFieldB = new JTextField();
		panel_5.add(textFieldB);
		textFieldB.setColumns(10);

		textFieldC = new JTextField();
		panel_5.add(textFieldC);
		textFieldC.setColumns(10);

		textFieldD = new JTextField();
		panel_5.add(textFieldD);
		textFieldD.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frmCheckOutSystem.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setBounds(29, 39, 46, 14);
		panel_2.add(lblNewLabel);

		textFieldTax = new JTextField();
		textFieldTax.setBounds(112, 36, 86, 20);
		panel_2.add(textFieldTax);
		textFieldTax.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Subtotal");
		lblNewLabel_1.setBounds(29, 91, 46, 14);
		panel_2.add(lblNewLabel_1);

		subTotal = new JTextField();
		subTotal.setBounds(112, 91, 86, 20);
		panel_2.add(subTotal);
		subTotal.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setBounds(29, 149, 46, 14);
		panel_2.add(lblNewLabel_2);

		Tax = new JTextField();
		Tax.setBounds(112, 149, 86, 20);
		panel_2.add(Tax);
		Tax.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(29, 193, 238, 201);
		panel_2.add(textArea);

		JButton btnTotal = new JButton("Total");
		btnTotal.setBounds(10, 415, 80, 20);
		panel_2.add(btnTotal);

		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(100, 415, 80, 20);
		panel_2.add(btnReset);

		// Exit Button
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Point of sale",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTIONe) {
					System.exit(0);

				}

			}
		});

		btnExit.setBounds(187, 415, 80, 21);
		panel_2.add(btnExit);
	}
}
