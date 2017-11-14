package com.yychao.collection;
public class TestBoxing {
    Integer i;
    int j;
    public static void main(String[] args){
    	TestBoxing t = new TestBoxing();
    	t.go();
    	
    }
    public void go(){
    	 j=i;
    	System.out.println(j);
    	System.out.println(i);
    }
}
