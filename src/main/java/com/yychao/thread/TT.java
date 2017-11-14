package com.yychao.thread;
public class TT implements Runnable{
   int b = 100;
   public synchronized void m1() throws Exception{
	   b = 1000;
       //Thread.sleep(5000);
	   System.out.println("bm1 = "+ b);
   }
   
   public synchronized void m2() throws Exception {
	   Thread.sleep(2500);
	   b = 2000;
	   System.out.println("bm2 = "+ b);
   }
 /*
  * �������������ͬһ��ֵ���������޸� ��������ô���붼���ó�synchronized;
  * ���ܱ���˴˼���޸�
  * 
  * (non-Javadoc)
  * @see java.lang.Runnable#run()
  */
  @Override
  public void run() {
	// TODO Auto-generated method stub
	  try {
		m1();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
   }
  public static void main(String[] args) throws Exception {
	 TT tt = new TT();
	 Thread t = new Thread(tt);
	 t.start();
	 tt.m2();
  }
}
