package com.yychao.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testFileWriter { 
    public static void main(String[] args){
	   FileWriter fw;
	   FileReader fr;
	   int word;
	    try {
	    	fr = new FileReader("g:\\java\\txt.dat");
			fw = new FileWriter("g:\\java\\txt1.dat");
			
			while((word = fr.read())!=-1){
				
				System.out.print((char)word);
				fw.write(word);
				
			}
			fw.flush();
			fw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
 }

