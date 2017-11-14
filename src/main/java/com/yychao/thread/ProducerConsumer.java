package com.yychao.thread;
public class ProducerConsumer {
   public static void main(String[] args){
	   SyncStack ss = new SyncStack();
	   Producer p = new Producer(ss);
	   Comsumer c = new Comsumer(ss);
	   new Thread(p).start();
	   new Thread(c).start();
   } 
}
class WoTou {
	int id;
	WoTou(int num){
		this.id = num;
	}
	public String toString(){
		return "WoTou : " + this.id;
           
    }
}
class SyncStack {
	int index = 0;
	WoTou[] arrWT = new WoTou[6];
	
	public synchronized void push(WoTou wt){
		while(index == arrWT.length){
		 try{
			this.wait();
		 }catch(InterruptedException e){
			 e.printStackTrace();
		  }
		 }
		 this.notify();
		 arrWT[index] = wt ;
System.out.println("producing wawawawa: "+ arrWT[index] );
		 index ++;
		}
		
	public synchronized WoTou pop() {
		while(index == 0){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
System.out.println("consuming : "+ arrWT[index]);
		return arrWT[index];
	}
}
class Producer implements Runnable{
    SyncStack ss = null;
    Producer(SyncStack ss) {
    	this.ss = ss;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 20; i++){
		   ss.push(new WoTou(i));
//System.out.println("producing : "+ wt);
		   try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	}
}

class Comsumer implements Runnable{
    SyncStack ss = null;
    Comsumer(SyncStack ss) {
    	this.ss = ss;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 20; i++){
		    ss.pop();
//System.out.println("comsuming : " + wt);
		   try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		
		}
	}
}


