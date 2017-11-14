package com.yychao.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTransForm1 {
   public static void main(String [] args){
	   
	   try {
		OutputStreamWriter osw = new OutputStreamWriter(			  
			new FileOutputStream("g:\\java\\OutputStreamwriter.txt"));
	    osw.write("neusoftgoogle");
	    System.out.println(osw.getEncoding());
	    osw.close();
	    osw = new OutputStreamWriter(	     
	    	new FileOutputStream("g:\\java\\OutputStreamwriter.txt",true),"ISO8859_1");
	    osw.write("neusoftgoogle");
	    System.out.println(osw.getEncoding());
	    osw.close();
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
/*
 *  OutputStreamWriter�ĺ�����
 *  �� outputstream          - -ת��-->            writer������
 *      ��һ���ֽڣ�                                                                             ��һ���ַ���2���ֽڣ�16λ�� 
 *  OutputStreamWriter����.write(String str)�ķ���������һ��дһ��String
 *  OutputStream һ��ֻ�ܶ�дһ���ֽ�                      
 * 
 *  �ڵ���: outputStream ,inputStream ,reader , writer
 *  ��������
 *    ������    BufferedReader������.readLine()�ķ�������ȡһ�е����� BufferedinputStream
 *    ת����   OutputStreamWriter   outputString ----> Writer ��
 *    ������   Data
 *   
 */