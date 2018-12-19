
package finalproject;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class My_Final {

	private JFrame frame;
	private JTextField c1;
	private JTextField c2;
	private JTextField c3;
	private JTextField e1;
	private JTextField e2;
	private JTextField e3;
	private JTextField upperRange;
	private JTextField lowerRange;
	private JTextField d1;
	private JTextField d2;
	private JTextField d3;
	private JLabel lblIntegral;
	
	Calculation s = new Calculation();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					My_Final window = new My_Final();
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
	public My_Final() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//This should submit the math for the function
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x = String.valueOf(s.integrand(c1.getText(), c2.getText(), c3.getText(), e1.getText(), e2.getText(), e3.getText(), d1.getText(), d2.getText(), d3.getText(), upperRange.getText(), lowerRange.getText()));
		
				lblIntegral.setText(x);
			
			}
		});
		btnSubmit.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.setText("");
				c2.setText("");
				c3.setText("");
				e1.setText("");
				e2.setText("");
				e3.setText("");
				upperRange.setText("");
				lowerRange.setText("");
				d1.setText("");
				d2.setText("");
				d3.setText("");
				lblIntegral.setText("");
			}
		});
		btnReset.setBounds(335, 11, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JLabel lblX = new JLabel("x");
		lblX.setBounds(70, 86, 29, 14);
		frame.getContentPane().add(lblX);
		
		JLabel label = new JLabel("x");
		label.setBounds(153, 86, 29, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("x");
		label_1.setBounds(231, 86, 29, 14);
		frame.getContentPane().add(label_1);
		
		c1 = new JTextField();
		c1.setBounds(39, 83, 22, 20);
		frame.getContentPane().add(c1);
		c1.setColumns(10);
		
		c2 = new JTextField();
		c2.setColumns(10);
		c2.setBounds(121, 83, 22, 20);
		frame.getContentPane().add(c2);
		
		c3 = new JTextField();
		c3.setColumns(10);
		c3.setBounds(199, 83, 22, 20);
		frame.getContentPane().add(c3);
		
		JLabel label_2 = new JLabel("+");
		label_2.setBounds(96, 82, 8, 23);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("+");
		label_3.setBounds(174, 82, 8, 23);
		frame.getContentPane().add(label_3);
		
		e1 = new JTextField();
		e1.setBounds(77, 66, 22, 20);
		frame.getContentPane().add(e1);
		e1.setColumns(10);
		
		e2 = new JTextField();
		e2.setColumns(10);
		e2.setBounds(160, 66, 22, 20);
		frame.getContentPane().add(e2);
		
		e3 = new JTextField();
		e3.setColumns(10);
		e3.setBounds(231, 66, 22, 20);
		frame.getContentPane().add(e3);
		
		JLabel lblUpperRange = new JLabel("Upper Range");
		lblUpperRange.setBounds(10, 179, 89, 14);
		frame.getContentPane().add(lblUpperRange);
		
		JLabel lblLowerRange = new JLabel("Lower Range");
		lblLowerRange.setBounds(10, 204, 89, 14);
		frame.getContentPane().add(lblLowerRange);
		
		upperRange = new JTextField();
		upperRange.setBounds(121, 176, 86, 20);
		frame.getContentPane().add(upperRange);
		upperRange.setColumns(10);
		
		lowerRange = new JTextField();
		lowerRange.setColumns(10);
		lowerRange.setBounds(121, 201, 86, 20);
		frame.getContentPane().add(lowerRange);
		
		d1 = new JTextField();
		d1.setBounds(57, 110, 29, 20);
		frame.getContentPane().add(d1);
		d1.setColumns(10);
		
		d2 = new JTextField();
		d2.setColumns(10);
		d2.setBounds(141, 111, 29, 20);
		frame.getContentPane().add(d2);
		
		d3 = new JTextField();
		d3.setColumns(10);
		d3.setBounds(224, 111, 29, 20);
		frame.getContentPane().add(d3);
		
		lblIntegral = new JLabel("");
		lblIntegral.setBounds(320, 179, 46, 14);
		frame.getContentPane().add(lblIntegral);
	}
}