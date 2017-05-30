import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{
	
	public Menu menu;
	public MainFrame(){
	setLayout(null);
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		menu = new Menu();
		menu.setLocation(0,0);
		menu.setVisible(true);
		add(menu);
		repaint();
}}