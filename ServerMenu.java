import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ServerMenu extends Container{
	
	public  JLabel message;
	public JLabel lol;
	private JButton get;
	private JButton run;
	
public ServerMenu(){
	setLayout(null);
    setSize(980,780);
	message = new JLabel("");
	message.setBounds(100,100,100,40);
	
	add(message);
	


		//run = new JButton("RUN");
	//run.setBounds(100,220,100,40);
	//	run.addActionListener(new ActionListener(){
				
		//		public void actionPerformed(ActionEvent e){
					
					//MainServer.run();
										
					
				//}
			//});
			//add(run);
	
}}