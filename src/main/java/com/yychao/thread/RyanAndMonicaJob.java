package com.yychao.thread;
public class RyanAndMonicaJob implements Runnable{
    private BankAccount account = new BankAccount();
    public  static void main(String [] args){
		RyanAndMonicaJob theJob =  new RyanAndMonicaJob();
		
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
	    one.setName("Ryan");
	    two.setName("Monica");
	    one.start();
	    two.start();
      }
		@Override
    public void run() {
			// TODO Auto-generated method stub
	   for (int x =0 ;x <10 ;x++){
		 makeWithdrawal(10);
		 if(account.getBalance() < 10){
			 System.out.println("Overdrawn!");
		 }
		}
	 }
  	  
	private void makeWithdrawal(int amount){
       if(account.getBalance() >= amount ){
    	  System.out.println(Thread.currentThread().getName()+ "is about to withdrawal");
    	  System.out.println(Thread.currentThread().getName()+ "is going to sleep");
    	  try {
			Thread.currentThread().sleep(500);	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  System.out.println(Thread.currentThread().getName()+"woke up!");
    	  account.withdraw(amount);
    	  System.out.println(Thread.currentThread().getName()+"completes the withdrawal");         
       } 
       else{
    	  System.out.println("Sorry, not enough for "+ Thread.currentThread().getName());
       }
    } 
}

