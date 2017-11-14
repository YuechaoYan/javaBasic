package com.yychao.network;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
   public static void main(String[] args){
	  
	try {
		Socket s = new Socket("127.0.0.1",8888); 
		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		System.out.println(dis.readUTF());
		dis.close();
		s.close();
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	   
	   
   }
}
