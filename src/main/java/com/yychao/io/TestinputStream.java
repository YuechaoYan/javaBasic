package com.yychao.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestinputStream {
    public static void main(String[] args){
    	int b = 0;
    	FileInputStream in = null;
        try{
        	in = new FileInputStream("G:\\java\\project\\io_inputStream\\src\\TestinputStream.java");
        }catch(FileNotFoundException e){
        	System.out.println("�Ҳ���ָ�����ļ�");
        	System.exit(-1);
        }
        
        try{
        	long num = 0;
        	while((b = in.read())!= -1){
              System.out.print((char)b);
              num++;
               }
        in.close();
        System.out.println();
        System.out.println("read totally "+ num +"bytes");
        }catch(IOException e){
        	System.out.println("read file error");
        	System.exit(-1);
        }
    }
}
