import java.net.*;
import java.util.*;
import java.io.*;

public class MainServer{
	public static ServerFrame frame;
	public static ObjectInputStream inStream;
	public static  String text;
	public static boolean state = true;
	public static boolean check = false;
	public static ServerSocket ss;

	public static void main(String[] args) {
		
		frame = new ServerFrame();
        frame.setVisible(true);
	
	
		try{
			
			ss = new ServerSocket(1989);
			
			Socket socket = ss.accept();
			//System.out.println("CLIENT IS CONNECTED");
			inStream = new ObjectInputStream(socket.getInputStream());
			text = (String)inStream.readObject();
			
			//System.out.println("WAITING FOR MESSAGE");
			
			while((text = (String)inStream.readObject())!=null){
				
				System.out.println(text);
				frame.sermenu.message.setText(text);

			}


		}catch(Exception e){

			e.printStackTrace();

		}
	
	}
	
	//public static void run(){
		//try{
		 
		 
		//}catch(Exception e){
			//e.printStackTrace();
		//}
	//}
}