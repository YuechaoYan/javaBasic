package com.yychao.io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

/*
 *PrintWriter and PrintStream����������������쳣�� 
 * 
 * 
 */
public class Testprint {
   public static void main (String [] args){
	   try {
		FileOutputStream fos = new FileOutputStream(
				   "g:\\java\\log.dat");
		PrintStream  ps = new PrintStream(fos);
	    if(ps != null){
	        System.setOut(ps);
	    }
	    
	    for(char i=0;i < 50000;i++){
	        System.out.print(i +" ");
	        
	    }
	    System.out.println(new Date());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
