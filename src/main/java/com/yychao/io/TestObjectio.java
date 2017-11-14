package com.yychao.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestObjectio {
   public static void main(String [] args){
	  T t = new T();
	  t.k = 8;
	  try {
		FileOutputStream fos = new FileOutputStream
				 ("g:\\java\\testobject.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream
				  ("g:\\java\\testobject.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T tReader = (T)ois.readObject();
		System.out.println(tReader.i +" "+tReader.j+" "+tReader.d+" "+tReader.k );
	  
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}

class T implements Serializable{
//serializable�ӿ�û���Լ��ķ���
	int i = 10;
	int j = 9;
	double d = 2.3;
	int k = 15;
}