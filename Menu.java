import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends Container{
	private JButton Connect;
	private JButton Sent;
	private JTextField Message;
	private JTextField ipText;
	private JTextField portText;
	private JLabel ip;
	private JLabel port;
	
	public Menu(){
		setLayout(null);
        setSize(980,780);
		portText = new JTextField();
		portText.setBounds(200,300,200,40);
		portText.setVisible(false);
		add(portText);
		ipText = new JTextField();
		ipText.setBounds(300,200,200,40);
		ipText.setVisible(false);
		add(ipText);
		Connect = new JButton("Connect");
		Connect.setBounds(300,100,200,40);
		 Connect.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
               

               Main.ip = ipText.getText();
			  
                Main.Connect();
				Connect.setVisible(false);
				Sent.setVisible(true);
				Message.setVisible(true);
				ip.setVisible(true);
				ipText.setVisible(true);
				//port.setVisible(true);
				//portText.setVisible(true);
                Main.frame.repaint();
                
            }    
        
        });
		add(Connect);
		
		Sent = new JButton("SENT");
		Sent.setBounds(300,650,200,40);
		Sent.setVisible(false);
			Sent.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e){
					Main.message = Message.getText();
					Main.Sent();
					Message.setText("");
					
					
				}
			});
			add(Sent);
	
		Message = new JTextField();
		Message.setBounds(300,300,200,40);
		Message.setVisible(false);
		add(Message);
		
		ip = new JLabel("INSERT IP ");
		ip.setBounds(100,200,100,40);
		ip.setVisible(false);
		add(ip);
		
		
		
		port = new JLabel("INSERT IP ADRESS");
		port.setBounds(100,300,100,40);
		port.setVisible(false);
		add(port);
		
		
		
		
		
	}
}