package javaFX.stringUtility;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StringUtility extends JFrame {

	// Defining JLabel 静态文本定义
	private JLabel lbInput;
	private JLabel lbOutput;

	// Defining JTextField 单行文本输入框定义
	private JTextField tfInput;
	private JTextField tfOutput;

	// Defining JButton 按键定义
	private JButton btnCountLetters;
	private JButton btnReverse;
	private JButton btnRemoveDuplicates;

	// 定义窗口为默认宽高
	public static final int DEFAULT_WIDTH = 600;
	public static final int DEFAULT_HEIGHT = 300;

	// 构造函数 Constructor
	public StringUtility() {

		// 调用高一级的类，装入标题
		super("String Utility");

		// Define your layout
		// setLayout(new FlowLayout());
		// 定义窗口大小
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// change the background color of the frame改变窗口背景颜色
		// getContentPane().setBackground(Color.lightGray);
		getContentPane().setLayout(null);

		// Initialization 初始化

		// 初始化静态文本
		lbInput = new JLabel("Input");
		// public void setBounds(int x,int y,int width,int height)
		lbInput.setBounds(300, 0, 250, 50);
		lbOutput = new JLabel("Output");
		lbOutput.setBounds(300, 80, 250, 50);

		// 初始化待输入文本框
		tfInput = new JTextField(6);
		tfInput.setBounds(300, 40, 250, 50);
		tfOutput = new JTextField(6);
		tfOutput.setBounds(300, 120, 250, 50);

		// 初始化按键
		btnCountLetters = new JButton("Count Letters ");
		btnCountLetters.setBounds(50, 30, 200, 25);

		btnReverse = new JButton("Reverse");
		btnReverse.setBounds(50, 90, 200, 25);

		btnRemoveDuplicates = new JButton("Remove Duplicates");
		btnRemoveDuplicates.setBounds(50, 150, 200, 25);

		// add to the frame 将以上组件加到窗口上
		add(lbInput);
		add(lbOutput);
		add(tfInput);
		add(tfOutput);
		add(btnCountLetters);
		add(btnReverse);
		add(btnRemoveDuplicates);

		// Event handling for Button 事件处理程序，调用下面的内部类
		ButtonHandler btnHandler = new ButtonHandler();
		btnCountLetters.addActionListener(btnHandler);
		btnReverse.addActionListener(btnHandler);
		btnRemoveDuplicates.addActionListener(btnHandler);

	}

	// define event handling for button handler,inner class
	private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// 获得输入的值
			// String s1 = tfInput.getText();

			if (event.getSource() == btnCountLetters) {
				tfOutput.setText(String.valueOf(tfInput.getText().length()));
			} else if (event.getSource() == btnReverse) {
				tfOutput.setText(ReverseString(tfInput.getText()));
			} else {

				if (event.getSource() == btnRemoveDuplicates) {

					tfOutput.setText(RemoveDuplicates(tfInput.getText()));
				}

			}

		}

		public String ReverseString(String s) {

			String re = new String();
			for (int i = s.length() - 1; i >= 0; i--)
				re += s.charAt(i);
			return re;
		}

		 public String RemoveDuplicates(String s) {

			String re = new String();
			String re2=new String();
			ArrayList list = new ArrayList();
			for (int i = 0; i < s.length(); i++)

			{
				if (!list.contains(s.charAt(i)))
					list.add(s.charAt(i));
			}
			re += list.toString();
			for(int i=0;i<re.length();i++)
				if(re.charAt(i)!=','&&re.charAt(i)!='['&&re.charAt(i)!=']'&&re.charAt(i)!=' ')
					re2+=re.charAt(i);
			return re2;
		}
	}
}
