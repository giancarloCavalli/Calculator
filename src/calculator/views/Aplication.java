package calculator.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import calculator.common.Calculator;
import calculator.common.ViewPanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Aplication {

	private JFrame frame;
	private Calculator calc = new Calculator();
	private JTextField textField;
	private ViewPanel vp = calc.getViewPanel();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplication window = new Aplication();
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
	public Aplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 264, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial", Font.BOLD, 20));
		textField.setBounds(10, 10, 229, 37);
		textField.setEditable(false);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(vp.getNumber());
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(vp.incNumber("0"));
			}
		});
		button.setBounds(10, 190, 111, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(vp.incNumber("1"));
			}
		});
		button_1.setBounds(10, 161, 54, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(vp.incNumber("2"));
			}
		});
		button_2.setBounds(74, 161, 47, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(vp.incNumber("3"));
			}
		});
		button_3.setBounds(131, 161, 49, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(vp.incNumber("4"));
			}
		});
		button_4.setBounds(10, 132, 54, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(vp.incNumber("5"));
			}
		});
		button_5.setBounds(74, 132, 47, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(vp.incNumber("6"));
			}
		});
		button_6.setBounds(131, 132, 49, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(vp.incNumber("7"));
			}
		});
		button_7.setBounds(10, 103, 54, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(vp.incNumber("8"));
			}
		});
		button_8.setBounds(74, 103, 47, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(vp.incNumber("9"));
			}
		});
		button_9.setBounds(131, 103, 49, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(",");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vp.incNumber(".");
			}
		});
		button_10.setBounds(131, 190, 49, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float res = calc.getResOperation();
				if(res == (int)res) {
					textField.setText(Integer.toString((int)res));
				} else {
					textField.setText(Float.toString(res));
				}
			}
		});
		button_11.setBounds(190, 190, 49, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setOperador('-');
			}
		});
		button_13.setBounds(190, 132, 49, 23);
		frame.getContentPane().add(button_13);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setOperador('*');
			}
		});
		btnX.setBounds(190, 103, 49, 23);
		frame.getContentPane().add(btnX);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setOperador('/');
			}
		});
		button_14.setBounds(190, 74, 49, 23);
		frame.getContentPane().add(button_14);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.clearAll();
				textField.setText(vp.getNumber());
			}
		});
		btnAc.setBounds(10, 74, 54, 23);
		frame.getContentPane().add(btnAc);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vp.clear();
				textField.setText(vp.getNumber());
			}
		});
		btnC.setBounds(74, 74, 47, 23);
		frame.getContentPane().add(btnC);
		
		JButton button_15 = new JButton("+/-");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(vp.changeNrSign());
			}
		});
		button_15.setBounds(131, 74, 49, 23);
		frame.getContentPane().add(button_15);
		
		JButton button_12 = new JButton("+");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setOperador('+');
			}
		});
		button_12.setBounds(190, 161, 49, 23);
		frame.getContentPane().add(button_12);
	}
}
