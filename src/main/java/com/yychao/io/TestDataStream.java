package com.yychao.io;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TestDataStream {
   public static void main(String [] args){
	 ByteArrayOutputStream baos = 
		new ByteArrayOutputStream();
	 DataOutputStream dos =  
		new DataOutputStream(baos);
	 try {
		dos.writeDouble(Math.random());
//Math.random�������ǣ�0,1��֮���double����С��
		dos.writeBoolean(true);
		ByteArrayInputStream bais =
			new ByteArrayInputStream(baos.toByteArray());
		System.out.println(bais.available());
//avail������������bais����Ŀǰ���ֽ�����������9��double��8���ֽڣ�boolean��1���ֽڣ�
		DataInputStream dis = new DataInputStream(bais);
		System.out.println(dis.readDouble());
/**
 * ��baos�ж�ȡ����ʱ���������Ƚ��ȳ��ġ�
 * ��д������ݣ��ȶ���������д������ݺ��������
 *
 *
 */
	    System.out.println(dis.readBoolean());   
	    dos.close();
	    dis.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
   }
}
