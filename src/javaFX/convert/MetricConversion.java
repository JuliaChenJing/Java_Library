import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MetricConversion extends JFrame {

	// Defining JLabel 静态文本定义
	private JLabel lbMile;
	private JLabel lbPound;
	private JLabel lbGallon;
	private JLabel lbFahrenheit;
	
	private JLabel lbKilometer;
	private JLabel lbKilogram;
	private JLabel lbLiter;
	private JLabel lbCentigrade;

	// Defining JTextField 单行文本输入框定义
	private JTextField tfMile;
	private JTextField tfPound;
	private JTextField tfGallon;
	private JTextField tfFahrenheit;
	
	private JTextField tfKilometer;
	private JTextField tfKilogram;
	private JTextField tfLiter;
	private JTextField tfCentigrade;


	// Defining JButton 按键定义
	private JButton btnConvert;


	// 定义窗口为默认宽高
	public static final int DEFAULT_WIDTH = 600;
	public static final int DEFAULT_HEIGHT = 250;

	// 构造函数 Constructor
	public MetricConversion() {

		// 调用高一级的类，装入标题
		super("Metric Conversion Assistant");

		// Define your layout
		// setLayout(new FlowLayout());
		// 定义窗口大小
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// change the background color of the frame改变窗口背景颜色
		// getContentPane().setBackground(Color.lightGray);
		getContentPane().setLayout(null);

		// Initialization 初始化

		// 初始化静态文本
		lbMile = new JLabel("Mile :");
		// public void setBounds(int x,int y,int width,int height)
		lbMile.setBounds(30, 0, 250, 50);
		lbPound = new JLabel("Pound :");
		lbPound .setBounds(30, 30, 250, 50);
		lbGallon= new JLabel("Gallon :");
		lbGallon .setBounds(30, 60, 250, 50);
		lbFahrenheit = new JLabel("Fahrenheit :");
		lbFahrenheit.setBounds(30, 90, 250, 50);
		
		lbKilometer = new JLabel("Kilometer :");
		lbKilometer .setBounds(330, 0, 250, 50);
		lbKilogram = new JLabel("Kilogram :");
		lbKilogram .setBounds(330, 30, 250, 50);
		lbLiter = new JLabel("Liter :");
		lbLiter .setBounds(330, 60, 250, 50);
		lbCentigrade = new JLabel("Centigrade :");
		lbCentigrade.setBounds(330, 90, 250, 50);

		// 初始化待输入文本框
		tfMile = new JTextField(6);
		tfMile.setBounds(100, 0, 150,30);
		tfPound = new JTextField(6);
		tfPound .setBounds(100, 30, 150,30);
		tfGallon= new JTextField(6);
		tfGallon .setBounds(100, 60, 150,30);
		tfFahrenheit = new JTextField(6);
		tfFahrenheit.setBounds(100, 90, 150,30);
		
		tfKilometer = new JTextField(6);
		tfKilometer .setBounds(400, 0, 150,30);
		tfKilogram = new JTextField(6);
		tfKilogram .setBounds(400, 30, 150,30);
		tfLiter = new JTextField(6);
		tfLiter .setBounds(400, 60, 150,30);
		tfCentigrade = new JTextField(6);
		tfCentigrade.setBounds(400, 90, 150,30);
	

		// 初始化按键
		btnConvert = new JButton("Convert ");
		btnConvert.setBounds(200, 150, 200, 30);

		
		// add to the frame 将以上组件加到窗口上
		add(lbKilometer);
		add(lbKilogram);
		add(lbLiter);
		add(lbCentigrade);
		add(lbGallon);
		add(lbKilometer);
		add(lbMile);
		add(lbGallon);
		add(lbPound);
		add(lbFahrenheit);
		
		add(tfKilometer);
		add(tfKilogram);
		add(tfLiter);
		add(tfCentigrade);
		add(tfGallon);
		add(tfKilometer);
		add(tfMile);
		add(tfGallon);
		add(tfPound);
		add(tfFahrenheit);
		
		add(btnConvert);
		
		// Event handling for Button 事件处理程序，调用下面的内部类
		//ButtonHandler btnHandler = new ButtonHandler();
		
		btnConvert.addActionListener
		(
				
				evt->
				{
					//Mile and Kilometer
					if(tfMile.getText().length()!=0)
					{
						double temp=0;
						temp=Double.parseDouble(tfMile.getText());
						tfKilometer.setText(String.valueOf(temp*1.609344));
					}
					else  if(tfKilometer.getText().length()!=0)
					{
						double temp=0;
						temp=Double.parseDouble(tfKilometer.getText());
						tfMile.setText(String.valueOf(temp/1.609344));
					}		
					
					//Pound and Kilogram
					if(tfPound.getText().length()!=0)
					{
						double temp=0;
						temp=Double.parseDouble(tfPound.getText());
						tfKilogram.setText(String.valueOf(temp*1.609344));
					}
					else  if(tfKilogram.getText().length()!=0)
					{
						double temp=0;
						temp=Double.parseDouble(tfKilogram.getText());
						tfPound.setText(String.valueOf(temp/1.609344));
					}		
					
					//Gallon and Liter
					if(tfGallon.getText().length()!=0)
					{
						double temp=0;
						temp=Double.parseDouble(tfGallon.getText());
						tfLiter.setText(String.valueOf(temp*3.7854));
					}
					else  if(tfLiter.getText().length()!=0)
					{
						double temp=0;
						temp=Double.parseDouble(tfLiter.getText());
						tfGallon.setText(String.valueOf(temp/3.7854));
					}		
					
					//Fahrenheit and Centigrade
					if(tfFahrenheit.getText().length()!=0)
					{
						double temp=0;
						temp=Double.parseDouble(tfFahrenheit.getText());
						tfCentigrade.setText(String.valueOf((temp-32)/1.8));
					}
					else  if(tfCentigrade.getText().length()!=0)
					{
						double temp=0;
						temp=Double.parseDouble(tfCentigrade.getText());
						tfFahrenheit.setText(String.valueOf(temp*1.8+32));
					}		
				}
		);
	}
}
		

		


