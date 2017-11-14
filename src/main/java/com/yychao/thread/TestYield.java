package com.yychao.thread;
public class TestYield {
   public static void main(String[] args) throws InterruptedException{ 
	   ThreadYield threadJoin = new ThreadYield();
	   ThreadYield1 threadJoin1 = new ThreadYield1();

	 //  ThreadYield threadJoin2 = new ThreadYield("thread 2");

	  Thread thread1 = new Thread(threadJoin);
	  Thread thread2 = new Thread(threadJoin1);

	  thread1.start();
	  thread2.start();
   }   
}
class ThreadYield implements Runnable {
	public void run() {
		for(int i=1 ;i<100 ;i++){
			System.out.println("thread 1=>: "+i);
			if(0 == i%10 ){
				  Thread.yield();
			 }
		}
	}
}
class ThreadYield1 implements Runnable {
	public void run() {
		for(int i=1 ;i<100 ;i++){
			System.out.println("thread 2===>: "+i);
			if(0 == i%10 ){
				  Thread.yield();
			 }
		}
	}
}
