//Exploring different types of buttons
package gui;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Buttons extends JFrame {
	
	public static void main(String [] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new Buttons();
			}
		});
	}
	public Buttons(){
		
		JButton button1 = new JButton("Click me");//regular button
		JCheckBox check =  new JCheckBox("Check"); //having a check box button 
		JRadioButton radio = new JRadioButton("button1");//having a radio button
		JRadioButton radio1 = new JRadioButton("button2");
		setTitle("Varioys Button Types");
		JToggleButton toggle = new JToggleButton("On/Off");
		setLayout( new FlowLayout());
		setSize(300, 300);
		setMinimumSize(new Dimension(200,200));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ButtonGroup groupbuttons = new ButtonGroup();
		groupbuttons.add(radio);
		groupbuttons.add(radio1);
		//adding components to JFrame
		add(button1);
		add(check); 
		add(radio);
		add(radio1);
		add(toggle);
		
		setVisible(true);
		
	}

}
