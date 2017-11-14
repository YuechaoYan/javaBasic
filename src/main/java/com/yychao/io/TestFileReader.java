package com.yychao.io;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args){
    	FileReader fr = null;
    	int next=0;
    	try{
    		fr = new FileReader("g:\\java\\outputStream.java");
    	    int count=0;
    	    while((next =fr.read())!=-1){
    	    	System.out.print((char)next);
    	    	count++;
    	    }
    	    
    	    fr.close();
    	}catch(FileNotFoundException e){
    		System.out.println("could not find files");
    	}catch(IOException e){
    		System.out.println("reading error");
    	}
    }
}
