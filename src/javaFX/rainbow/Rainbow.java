package package1;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Rainbow extends JFrame {
	// Defining JButton 按键定义
	private JButton btnRed;
	private JButton btnOrange;
	private JButton btnYellow;
	private JButton btnGreen;
	private JButton btnCyan;
	private JButton btnBlue;
	private JButton btnPurple;

	// 定义窗口为默认宽高
	public static final int DEFAULT_lENGTH = 100;
	

	// 构造函数 Constructor
	public Rainbow() {

		// 调用高一级的类，装入标题
		super("Rainbow Color Frame");

		// Define your layout
		// setLayout(new FlowLayout());
		// 定义窗口大小
		setSize(DEFAULT_lENGTH*7, DEFAULT_lENGTH+38);

		// change the background color of the frame改变窗口背景颜色
		// getContentPane().setBackground(Color.lightGray);
		getContentPane().setLayout(null);

		// Initialization 初始化

		

		// 初始化按键
		btnRed = new JButton("");
		btnRed.setBounds(0, 0, DEFAULT_lENGTH, DEFAULT_lENGTH);
		btnRed.setBackground(Color.RED);
		
		btnOrange = new JButton("");
		btnOrange.setBounds(DEFAULT_lENGTH, 0, DEFAULT_lENGTH, DEFAULT_lENGTH);
		btnOrange.setBackground(Color.ORANGE);
		
		btnYellow = new JButton("");
		btnYellow.setBounds(DEFAULT_lENGTH*2, 0, DEFAULT_lENGTH, DEFAULT_lENGTH);
		btnYellow.setBackground(Color.YELLOW);
		
		btnGreen = new JButton("");
		btnGreen.setBounds(DEFAULT_lENGTH*3, 0, DEFAULT_lENGTH, DEFAULT_lENGTH);
		btnGreen.setBackground(Color.GREEN);
		
		btnCyan = new JButton("");
		btnCyan.setBounds(DEFAULT_lENGTH*4, 0, DEFAULT_lENGTH, DEFAULT_lENGTH);
		btnCyan.setBackground(Color.CYAN);
		
		btnBlue = new JButton("");
		btnBlue.setBounds(DEFAULT_lENGTH*5, 0, DEFAULT_lENGTH, DEFAULT_lENGTH);
		btnBlue.setBackground(Color.BLUE);
		
		btnPurple = new JButton("");
		btnPurple.setBounds(DEFAULT_lENGTH*6, 0, DEFAULT_lENGTH, DEFAULT_lENGTH);
		btnPurple.setBackground(Color.magenta);
		

		// add to the frame 将以上组件加到窗口上
		
		add(btnRed);
		add(btnOrange);
		add(btnYellow);
		add(btnGreen);
		add(btnCyan);
		add(btnBlue);
		add(btnPurple);
		

		// Event handling for Button 事件处理程序，调用下面的内部类
		ButtonHandler btnHandler = new ButtonHandler();
		btnRed.addActionListener(btnHandler);
		btnOrange.addActionListener(btnHandler);
		btnYellow.addActionListener(btnHandler);
		btnGreen.addActionListener(btnHandler);
		btnCyan.addActionListener(btnHandler);
		btnBlue.addActionListener(btnHandler);
		btnPurple.addActionListener(btnHandler);
	}

	// define event handling for button handler,inner class
	private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// 获得输入的值
			// String s1 = tfInput.getText();

			if (event.getSource() == btnRed) {

				JOptionPane.showMessageDialog(btnRed, btnRed.getText()
						+ " Red stands for passion and danger");
			} 
			else if (event.getSource() == btnOrange) {

				JOptionPane.showMessageDialog(btnOrange, btnOrange.getText()
						+ " Orange stands for caring and notice");
			} 
			else if (event.getSource() == btnYellow) {

				JOptionPane.showMessageDialog(btnYellow, btnYellow.getText()
						+ " Yellow stands for warmth and earth");
			} 
			else if (event.getSource() == btnGreen) {

				JOptionPane.showMessageDialog(btnGreen, btnGreen.getText()
						+ " Green stands for health and hope");
			} 
			else if (event.getSource() == btnCyan) {

				JOptionPane.showMessageDialog(btnCyan, btnCyan.getText()
						+ " Cyan stands for lake and morning");
			} 
			else if (event.getSource() == btnBlue) {

				JOptionPane.showMessageDialog(btnBlue, btnBlue.getText()
						+ " Blue stands for environment, sky and ocean");
			} 
			else if (event.getSource() == btnPurple) {

				JOptionPane.showMessageDialog(btnPurple, btnPurple.getText()
						+ " Purple stands for elegance and mystery");
			} 
		}
	}
}


