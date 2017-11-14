/*
 * bufferedInputStream��Ӳ���ڴ��Ͽ�����һ����������
 * Ŀ�����ڶ�дʱ������Ƶ���ط���Ӳ�̣����ٶ�Ӳ�̵���
 * bufferedInputStream�Ǵ�����
 * 
 */
package com.yychao.io;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferStream {
	public static void main(String [] args){
		FileInputStream fis;
		BufferedInputStream bis;
		try {
			fis = new FileInputStream("g:\\java\\outputStream.java");
			bis = new BufferedInputStream(fis);
			System.out.println((char)bis.read());
			int next = 0;
			bis.mark(100);
			for(int i = 0;i<10&&((next = bis.read())!=-1);i++){
				System.out.print((char)next);
			}
			System.out.println();
			bis.reset();
			for(int i = 0;i<10&&((next = bis.read())!=-1);i++){
				System.out.print((char)next);
			}
			System.out.println();
			
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
}
