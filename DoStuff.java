import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DoStuff extends JFrame implements ActionListener {
	
	
	public static void main(String [] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new DoStuff();
			}
		});

	}
	

	DoStuff(){
		JButton button = new JButton("Click here");
		button.addActionListener(this);
			
		
		//setters and initializers
		setSize(300,300);
		setMinimumSize(new Dimension(100,100));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		//adding components
		add(button);
	
		
		
		
		setVisible(true);
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			new DoStuff(); //creates an infinite amount of objects when it is clicked
	}
	
	

}