package com.yychao.thread;
public class TestPriority {
   public static void main(String [] args){
	   Thread t1 = new Thread(new T1());
	   Thread t2 = new Thread(new T2());
	   t1.start();
	   t1.setPriority(t1.getPriority()+3);
	   System.out.println(t1.getPriority());
	   t2.start();
	   System.out.println(t2.getPriority());
   }
   
}
class T1 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	   for(int i=0; i < 100 ; i++){
		   System.out.println("T1: "+ i);
	   }
	}	
}
class T2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	   for(int i=0 ;i < 100 ; i++){
		   System.out.println("T2: "+ i);
	   }	
	}
}

/*
 *Ĭ�ϵ��߳����ȼ���5
 *t1.getPriority()==5
 * ����ͨ��t1.setPriority()�ķ������޸��̵߳����ȼ�
 * 
 */
		
		
