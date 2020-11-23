package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculate {

	private JFrame frame;
	private JTextField Display;

	double first_num;
	double second_num;
	double result;
	String operation;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculate window = new calculate();
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
	public calculate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 664);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Display = new JTextField();
		Display.setHorizontalAlignment(SwingConstants.RIGHT);
		Display.setFont(new Font("Tahoma", Font.BOLD, 60));
		Display.setBounds(10, 10, 428, 60);
		frame.getContentPane().add(Display);
		Display.setColumns(10);
		
		// ROW1
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(Display.getText().length()>0)
				{
					String blankspace=null;
					StringBuilder ob=new StringBuilder(Display.getText());
					ob.deleteCharAt(Display.getText().length()-1);
					blankspace=ob.toString();
					Display.setText(blankspace);
				}
			}
		});
		btnbackspace.setFont(new Font("Dialog", Font.BOLD, 60));
		btnbackspace.setBounds(10, 80, 100, 100);
		frame.getContentPane().add(btnbackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Display.setText(null);
			}
		});
		btnClear.setBounds(120, 80, 100, 100);
		frame.getContentPane().add(btnClear);
		
		JButton btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				first_num=Double.parseDouble(Display.getText());
				Display.setText("");
				operation="%";
			}
		});
		btnModulus.setFont(new Font("Tahoma", Font.BOLD, 55));
		btnModulus.setBounds(230, 80, 100, 100);
		frame.getContentPane().add(btnModulus);
		
		JButton btnPlus =  new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				first_num=Double.parseDouble(Display.getText());
				Display.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnPlus.setBounds(340, 80, 100, 100);
		frame.getContentPane().add(btnPlus);
		
		// ROW2
		
				JButton btn7 = new JButton("7");
				btn7.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						String value=Display.getText()+btn7.getText();
						Display.setText(value);
					}
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 70));
				btn7.setBounds(10, 190, 100, 100);
				frame.getContentPane().add(btn7);
				
				JButton btn8 = new JButton("8");
				btn8 .setFont(new Font("Tahoma", Font.BOLD, 70));
				btn8 .addActionListener(new ActionListener() {
					
						public void actionPerformed(ActionEvent e) 
						{
							String value=Display.getText()+btn8.getText();
							Display.setText(value);
						}
					
				});
				btn8 .setBounds(120, 190, 100, 100);
				frame.getContentPane().add(btn8 );
				
				JButton btn9  = new JButton("9");
				btn9.setFont(new Font("Tahoma", Font.BOLD,70));
				btn9 .addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) 
					{
						String value=Display.getText()+btn9.getText();
						Display.setText(value);
					}
				
					});
				btn9.setBounds(230,190, 100, 100);
				frame.getContentPane().add(btn9);
				
				JButton btn_Minus= new JButton("-");
				btn_Minus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						first_num=Double.parseDouble(Display.getText());
						Display.setText("");
						operation="-";
					}
				});
				btn_Minus.setFont(new Font("Tahoma", Font.BOLD, 70));
				btn_Minus.setBounds(340, 190, 100, 100);
				frame.getContentPane().add(btn_Minus);
				
				// ROW3
				
				JButton btn4 = new JButton("4");
				btn4.setFont(new Font("Tahoma", Font.BOLD, 70));
				btn4 .addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String value=Display.getText()+btn4.getText();
						Display.setText(value);
					}
				});
				btn4.setBounds(10, 300, 100, 100);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5 .setFont(new Font("Tahoma", Font.BOLD, 70));
				btn5 .addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String value=Display.getText()+btn5.getText();
						Display.setText(value);
					}
				});
				btn5.setBounds(120, 300, 100, 100);
				frame.getContentPane().add(btn5);
				
				JButton btn6  = new JButton("6");
				btn6.setFont(new Font("Tahoma", Font.BOLD,70));
				btn6 .addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String value=Display.getText()+btn6.getText();
						Display.setText(value);
					}
				});
				btn6.setBounds(230,300, 100, 100);
				frame.getContentPane().add(btn6);
				
				JButton btn_Mul= new JButton("x");
				btn_Mul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						first_num=Double.parseDouble(Display.getText());
						Display.setText("");
						operation="*";
					}
				});
				btn_Mul.setFont(new Font("Tahoma", Font.BOLD, 70));
				btn_Mul.setBounds(340, 300, 100, 100);
				frame.getContentPane().add(btn_Mul);
				
				// ROW4
				
				JButton btn1 = new JButton("1");
				btn1.setFont(new Font("Tahoma", Font.BOLD, 70));
				btn1 .addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String value=Display.getText()+btn1.getText();
						Display.setText(value);
					}
				});
				btn1.setBounds(10, 410, 100, 100);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2 .setFont(new Font("Tahoma", Font.BOLD, 70));
				btn2 .addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String value=Display.getText()+btn2.getText();
						Display.setText(value);
					}
				});
				btn2  .setBounds(120, 410, 100, 100);
				frame.getContentPane().add(btn2  );
				
				JButton btn3  = new JButton("3");
				btn3.setFont(new Font("Tahoma", Font.BOLD,70));
				btn3 .addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String value=Display.getText()+btn3.getText();
						Display.setText(value);
					}
				});
				btn3.setBounds(230,410, 100, 100);
				frame.getContentPane().add(btn3);
				
				JButton btn_Divide= new JButton("/");
				btn_Divide.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						first_num=Double.parseDouble(Display.getText());
						Display.setText("");
						operation="/";
					}
				});
				btn_Divide.setFont(new Font("Tahoma", Font.BOLD, 70));
				btn_Divide.setBounds(340,410, 100, 100);
				frame.getContentPane().add(btn_Divide);
				
             // ROW5
				
				JButton btn0 = new JButton("0");
				btn0.setFont(new Font("Tahoma", Font.BOLD, 70));
				btn0 .addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String value=Display.getText()+btn0.getText();
						Display.setText(value);
					}
				});
				btn0.setBounds(10, 520, 100, 100);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot .setVerticalAlignment(SwingConstants.TOP);
				btnDot .setFont(new Font("Tahoma", Font.BOLD, 70));
				btnDot .addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String value=Display.getText()+btnDot.getText();
						Display.setText(value);
					}
				});
				btnDot  .setBounds(120, 520, 100, 100);
				frame.getContentPane().add(btnDot  );
				
				JButton btnPM  = new JButton("\u00B1");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						double plusminus=Double.parseDouble(String.valueOf(Display.getText()));
						plusminus=plusminus*(-1);
						Display.setText(String.valueOf(plusminus));
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD,70));
				btnPM.setBounds(230,520, 100, 100);
				frame.getContentPane().add(btnPM);
				
				JButton btn_Equal= new JButton("=");
				btn_Equal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						String answer;
						second_num=Double.parseDouble(Display.getText());
						if(operation=="+")
						{
							result=first_num+second_num;
							answer=String.format("%.4f", result);
							Display.setText(answer);
						}
						else if(operation=="-")
						{
							result=first_num-second_num;
							answer=String.format("%.4f", result);
							Display.setText(answer);
						}
						else if(operation=="*")
						{
							result=first_num*second_num;
							answer=String.format("%.4f", result);
							Display.setText(answer);
						}
						else if(operation=="/")
						{
							result=first_num/second_num;
							answer=String.format("%.4f", result);
							Display.setText(answer);
						}
						else if(operation=="%")
						{
							result=first_num%second_num;
							answer=String.format("%.4f", result);
							Display.setText(answer);
						}
					}
				});
				btn_Equal.setFont(new Font("Tahoma", Font.BOLD, 70));
				btn_Equal.setBounds(340,520, 100, 100);
				frame.getContentPane().add(btn_Equal);
	}
}
