package com.yychao.thread;
public class TestThreadisAlive {
   public static void main (String [] args){
	   Runner6 r = new Runner6();
	   Thread t = new Thread(r);
	   t.start();
	   
	   for (int i=0; i<50 ;i++){
		   System.out.println("MainThread: "+ i);
	   }
   }
}

class Runner6 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().isAlive());
//isAlive()���Ǿ�̬�ķ��������в�����Thread����ֱ�ӵ���
//��Ҫ��currentThread()�ķ�������Thread�����һ��ʵ����Ȼ���ٽ��е���
//sleep�ķ������ھ�̬�ķ��������Կ�����Thread����ֱ�ӵ��á�
	    for(int i=0; i< 50;i++){
	    	System.out.println("SubThread : " + i);
	    }
	}
	
}
