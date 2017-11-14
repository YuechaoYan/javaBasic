package com.yychao.thread;
public class TestJoin {
   public static void main(String[] args) throws InterruptedException{ 
	  ThreadJoin threadJoin = new ThreadJoin();
	  Thread thread1 = new Thread(threadJoin);
	  thread1.start();
      //thread1.join();
	 // Thread.sleep(100);
	  for(int i=0 ;i<100 ;i++){
		   System.out.println("main thread: "+i);
	  }
   }
   
  
}

class ThreadJoin implements Runnable {
	
	public void run() {
		for(int i=0 ;i<100 ;i++){
			System.out.println("Thread1: "+i);
		}
	}
}