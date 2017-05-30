import java.awt.*;
import javax.swing.*;

public class ServerFrame extends JFrame{
	
	public static ServerMenu sermenu;
public ServerFrame(){
	setLayout(null);
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		sermenu = new ServerMenu();
		sermenu.setLocation(0,0);
		sermenu.setVisible(true);
		add(sermenu);
		repaint();
	
	
}}