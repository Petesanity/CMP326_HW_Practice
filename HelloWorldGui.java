package gui;

//or I could also use javax.swing.* to use all possible Components;
//Disadvantage: exporting from IDE would not be ideal
import javax.swing.JFrame;

import java.awt.Dimension; //minimum size of JFrame
import java.awt.FlowLayout; //layout of the button

import javax.swing.JButton; //self explanatory
import javax.swing.JTextField;  //think of this as Scanner input
import javax.swing.JLabel; //think of this as SOP for program
import javax.swing.SwingUtilities;


public class HelloWorldGui extends JFrame {
		   
	public static void main(String[] args) {
		   SwingUtilities.invokeLater(new Runnable(){ //or just swing utilities
			   @Override
			   public void run(){
				   new HelloWorld ();
			   }
		   }); //this whole method runs and displays the code when the program runs
		   
	   }
	   HelloWorld(){
		   
		   JFrame frame = new JFrame("Title of the Container");//could also extend JFrame instead of doing this
		   JLabel text =  new JLabel("Hello World this is my first GUI");
		   JButton button = new JButton("Click"); //creating a button
		   JTextField input = new JTextField(7);//24 for 24 characters max input
		   
		   frame.setDefaultCloseOperation(3); /*
		   close window after exiting program, default # to close
		   also JFrame.(EXIT_ON_CLOSE)
		   */
		   setSize(300, 300); //size of frame
		   setMinimumSize(new Dimension(100, 100));
		   frame.setLayout(new FlowLayout());//layout of the button, also GridLayout(rows,columns) can be used
		   
		   frame.add(text);
		   frame.add(input);
		   frame.add(button);
		   frame.setVisible(true);
	   }
}



