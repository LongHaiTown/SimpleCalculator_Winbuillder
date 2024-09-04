package cong_tru_nhan_chia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class main extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	private double a;
	private double b;
	private double kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 250, 510, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		
		
		JLabel App_title = new JLabel("Cộng trừ nhân và chia",SwingConstants.CENTER);
		App_title.setFont(new Font("Tahoma", Font.ITALIC, 30));
		
		// don't try to understand this part (it's not necessary)
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(App_title, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(App_title, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		// don't try to understand this part (it's not necessary)

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setForeground(Color.DARK_GRAY);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(240, 240, 240));
		panel_4.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		
		// don't try to understand this part (it's not necessary)
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(null);
		

		JButton colorRed = new JButton();
		colorRed.setBounds(178, 0, 33, 39);
		colorRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		colorRed.setBackground((Color.red));
		colorRed.setForeground(Color.red);
		panel_4.add(colorRed);
		
		JButton colorGreen = new JButton();
		colorGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		colorGreen.setBounds(216, 0, 33, 39);
		colorGreen.setBackground((Color.green));
		colorGreen.setForeground((Color.green));;
		panel_4.add(colorGreen);
		
		JButton colorBlue = new JButton();
		colorBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		colorBlue.setBounds(254, 0, 33, 39);
		colorBlue.setBackground((Color.blue));
		colorBlue.setForeground((Color.blue));;
		panel_4.add(colorBlue);
		
		
		
		panel_2.setLayout(null);
		
		JLabel CalcMethods_titles = new JLabel("Phép toán ");
		CalcMethods_titles.setBackground(SystemColor.textHighlightText);
		CalcMethods_titles.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CalcMethods_titles.setBounds(103, 103, 120, 13);
		panel_2.add(CalcMethods_titles);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(103, 10, 256, 38);
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
			
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(103, 58, 256, 38);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField_1 = new JTextField();
		panel_3_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBounds(103, 210, 256, 38);
		panel_2.add(panel_3_1_2);
		panel_3_1_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea ketqua = new JTextArea();
		
		panel_3_1_2.add(ketqua);
		
		JLabel input1_title = new JLabel("Nhập a",SwingConstants.CENTER);
		input1_title.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input1_title.setBounds(27, 10, 66, 38);
		panel_2.add(input1_title);
		
		JLabel input2_title = new JLabel("Nhập b",SwingConstants.CENTER);
		input2_title.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input2_title.setBounds(27, 58, 66, 38);
		panel_2.add(input2_title);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.activeCaption));
		panel_3_1_1.setBounds(103, 118, 256, 82);
		panel_2.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JRadioButton rdbtnCong = new JRadioButton("Cộng");
		rdbtnCong.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnCong.setBounds(6, 6, 103, 29);
		panel_3_1_1.add(rdbtnCong);
		
		JRadioButton rdbtnTr = new JRadioButton("Trừ");
		rdbtnTr.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnTr.setBounds(6, 37, 103, 29);
		panel_3_1_1.add(rdbtnTr);
		
		JRadioButton rdbtnNhn = new JRadioButton("Nhân");
		rdbtnNhn.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNhn.setBounds(111, 6, 103, 29);
		panel_3_1_1.add(rdbtnNhn);
		
		JRadioButton rdbtnChia = new JRadioButton("Chia");
		rdbtnChia.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnChia.setBounds(111, 37, 103, 29);
		panel_3_1_1.add(rdbtnChia);
		
		JLabel Result_title = new JLabel("Kết quả",SwingConstants.CENTER);
		Result_title.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Result_title.setBounds(27, 220, 66, 13);
		panel_2.add(Result_title);
		contentPane.setLayout(gl_contentPane);
		
		JLabel functionTitle = new JLabel("Chọn tác vụ");
		functionTitle.setForeground(Color.WHITE);
		functionTitle.setBackground(Color.BLUE);
		functionTitle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		functionTitle.setBounds(0, 5, 87, 13);
		panel_1.add(functionTitle);
		
		JButton functionButton = new JButton("Giải");
		functionButton.addActionListener(new ActionListener() {
			private double a;
			private double b;

			public void actionPerformed(ActionEvent e) {
				
				
				String aText = textField.getText();
				this.a = Double.parseDouble(aText);
				String bText = textField_1.getText();
				this.b = Double.parseDouble(bText);
				engine engi = new engine(a,b);
				if (rdbtnCong.isSelected()) {
		            kq = engi.phepCong();
		        } else if (rdbtnTr.isSelected()) {
		        	kq = engi.phepTru();
		        } else if (rdbtnNhn.isSelected()) {
		        	kq = engi.phepNhan();
		        } else if (rdbtnChia.isSelected()) {
		        	
		            if(engi.cantDivide() == false) {
						JOptionPane.showMessageDialog(rootPane, "Chia tay thì còn có thể, nhưng chia cho 0 thì không bao giờ! ~~");
						kq = engi.phepChia();
		            }
		            else kq = engi.phepChia();
		        }
				ketqua.setText(String.valueOf(kq));
				
			}
		});
		functionButton.setBounds(10, 28, 67, 21);
		panel_1.add(functionButton);
		
		JButton functionButton_1 = new JButton("Xoá");
		functionButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ketqua.setText("");
				textField.setText("");
				textField_1.setText("");

			}
		});
		functionButton_1.setBounds(10, 53, 67, 21);
		panel_1.add(functionButton_1);
		
		JButton functionButton_1_1 = new JButton("Thoát");
		functionButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		functionButton_1_1.setBounds(10, 81, 67, 21);
		panel_1.add(functionButton_1_1);
		// don't try to understand this part (it's not necessary)

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
