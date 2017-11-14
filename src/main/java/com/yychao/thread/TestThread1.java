package com.yychao.thread;
public class TestThread1 {
   public static void main(String args[]){
	   Runner1 r = new Runner1();
	   Thread t = new Thread(r);
	   t.start();
//	   try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	   for (int i=0; i<50; i++){
	       System.out.println("Main Thread----"+i);
	   }
   }
}
class Runner1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<50;i++){
			System.out.println("Runner 1 ----"+i);
			
		}
	}
	
}