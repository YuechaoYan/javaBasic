package com.yychao.thread;
public class Teststop {
   public static void main(String[] args){
	   Runner4 r = new Runner4();
	   Thread  t = new Thread(r);
	   t.start();
	   for(int i=0 ; i <100 ;i++){
		  if(i%10 == 0 && i>0){
			  System.out.println("in thread main i= "+ i);
		  }		  
	   }
	   System.out.println("the thread main is over");
	   r.shutDown();
	   //����runner4����ķ�����shutDown���������߳�
	   //���ǳ��õ����߳̽����ķ�����
		  
   }
   
}
class Runner4 implements Runnable {
    private boolean flag = true;
	@Override
	public void run() {
		// TODO Auto-generated method stub
	   int i = 0;
	   while (flag == true){
		  System.out.println(" "+ i++);
	   }
	}
	public void shutDown(){
		flag = false;
	}
}