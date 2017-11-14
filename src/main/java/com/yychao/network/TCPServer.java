package com.yychao.network;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String [] args) throws Exception{
      ServerSocket  ss = new ServerSocket(6666);
      while(true){
      Socket s = ss.accept();
      InputStream is = s.getInputStream();
      DataInputStream dis = new DataInputStream(is);
      System.out.println(dis.readUTF());
      dis.close();
      s.close();
      System.out.println("a client is connected");
       }
   }
}
