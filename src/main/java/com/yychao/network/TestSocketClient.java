package com.yychao.network;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TestSocketClient {
   public static void main(String[] args){
	   try {
		Socket s = new Socket("127.0.0.1",5888);
	    InputStream is = s.getInputStream();
	    DataInputStream dis = new DataInputStream(is);
	    OutputStream os = s.getOutputStream();
	    DataOutputStream dos = new DataOutputStream(os);
	    dos.writeUTF("hey");
	    String s1 = null;
	    if((s1 =dis.readUTF())!=null);
	       System.out.println(s1);
	    dos.close();
	    dis.close();
	    s.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
