package com.yychao.io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedRW {
     public static void main(String[] args){
    	 BufferedWriter bw = null;
    	 BufferedReader br = null;
    	 try {
			bw = new BufferedWriter(new FileWriter("g:\\java\\bufferedreader.txt"));
		    br = new BufferedReader(new FileReader("g:\\java\\bufferedreader.txt"));
    	    String s = null;
    	    for(int i = 0;i<100;i++){
    	       s =  String.valueOf(Math.random());
    	       bw.write(s);
    	       bw.newLine();
    	    }
    	    bw.flush();
    	    bw.close();
    	    while((s=br.readLine()) != null){
    	        System.out.println(s);
    	    }
    	    br.close();
    	 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
     }
}