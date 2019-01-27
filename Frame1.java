import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;

public class Frame1 {

	private JFrame frame;
	private JTextField textbox1;
	private JLabel lblNewLabel;
	private JTextField textbox2;
	private JButton btnAdd;
	private JButton btnSubtract;
	private JTextField textboxResult;
	double x, y, result;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(100, 100, 626, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel label = new JLabel("");
		frame.getContentPane().add(label);
		
		textbox1 = new JTextField();
		textbox1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textbox1.setColumns(10);
		frame.getContentPane().add(textbox1);
		
		lblNewLabel = new JLabel("Calculator !");
		lblNewLabel.setToolTipText("");
		frame.getContentPane().add(lblNewLabel);
		
		textbox2 = new JTextField();
		textbox2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textbox2.setColumns(10);
		frame.getContentPane().add(textbox2);
		
		JLabel label_1 = new JLabel("");
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		frame.getContentPane().add(label_3);
		
		textboxResult = new JTextField();
		textboxResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textboxResult.setColumns(10);
		frame.getContentPane().add(textboxResult);
		
		JLabel label_4 = new JLabel("");
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("");
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("");
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		frame.getContentPane().add(label_11);
		
		btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					x = Double.parseDouble(textbox1.getText());
					y = Double.parseDouble(textbox2.getText());
					result = x - y;
					textboxResult.setText(Double.toString(result));
				}
				catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
			}
		});
		frame.getContentPane().add(btnSubtract);
		
		JLabel label_12 = new JLabel("");
		frame.getContentPane().add(label_12);
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					x = Double.parseDouble(textbox1.getText());			//receive text input from the box.
					y = Double.parseDouble(textbox2.getText());
					
					result = x + y;
					textboxResult.setText(Double.toString(result));    //need to convert int to text.
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter a valid number");
					
				}
			}
		});
		frame.getContentPane().add(btnAdd);
		
		JLabel label_13 = new JLabel("");
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("");
		frame.getContentPane().add(label_15);
		
		JButton btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					x = Double.parseDouble(textbox1.getText());
					y = Double.parseDouble(textbox2.getText());
					result = x % y;
					textboxResult.setText(Double.toString(result));
				}
				catch(Exception e5){
					JOptionPane.showMessageDialog(null,"Enter a valid number");
				}
			}
		});
		frame.getContentPane().add(btnModulus);
		
		JLabel label_16 = new JLabel("");
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("");
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("");
		frame.getContentPane().add(label_18);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					x = Double.parseDouble(textbox1.getText());
					y = Double.parseDouble(textbox2.getText());
					result = x / y;
					textboxResult.setText(Double.toString(result));
				}
				catch(Exception e4) {
					JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
			}
		});
		frame.getContentPane().add(btnDivide);
		
		JLabel label_19 = new JLabel("");
		frame.getContentPane().add(label_19);
		
		JButton btnMultiply = new JButton("X");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					x = Double.parseDouble(textbox1.getText());
					y = Double.parseDouble(textbox2.getText());
					result = x * y;
					textboxResult.setText(Double.toString(result));
				}
				catch(Exception e3) {
					JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
			}
		});
		frame.getContentPane().add(btnMultiply);
		
		JLabel label_20 = new JLabel("");
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("");
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("");
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("");
		frame.getContentPane().add(label_23);
		
		
	}
}


