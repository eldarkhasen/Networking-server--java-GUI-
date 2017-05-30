import java.util.*;
import java.net.*;
import java.io.*;

public class Main{
		public static MainFrame frame;
		public static String ip;
		public static int port;
		public static String message ;
		public static ObjectOutputStream outStream;
	public static void main(String[] args) {

	
		frame = new MainFrame();
        frame.setVisible(true);
		
		
		
}
public static void Connect(){
	
		try{
			Socket socket = new Socket(ip,1989);
			 outStream = new ObjectOutputStream(socket.getOutputStream());
		}catch(Exception e){
				e.printStackTrace();
		}
	
}

public static void Sent(){
	 try{
	outStream.writeObject(message);
}catch(Exception e){
		e.printStackTrace();
}}

public static void clear(){
	
}




}