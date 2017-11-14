
package com.yychao.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class outputStream {
    public static void main(String[] args) throws FileNotFoundException{
    	int b = 0;
    	FileInputStream in = null;
    	FileOutputStream out = null;
        try{
           in = new FileInputStream("G:\\java\\project\\io_inputStream\\src\\TestinputStream.java");
           out = new FileOutputStream("G:\\java\\outputStream.java");
           while((b = in.read())!=-1){
              out.write(b);
             }
           in.close();
           out.close();   
        }catch(FileNotFoundException e2){
        	System.out.println("could not find destination files");
        }catch(IOException e){
        	System.out.println("files copy error");
        }
        System.out.println("files have already been copied");
    }
}

