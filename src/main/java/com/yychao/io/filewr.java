package com.yychao.io;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewr {
   public static void main(String[] args){
   FileReader fr;
   FileWriter fw;
   int next = 0;
   try {
      fr = new FileReader("g:\\java\\outputStream.java");
      fw = new FileWriter("g:\\java\\writer.txt");
      while((next =fr.read())!=-1){
    	 fw.write(next);
         }
         fr.close();
         fw.flush();
         fw.close();
     } catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	    e.printStackTrace();
     } catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
       }
   }
}
