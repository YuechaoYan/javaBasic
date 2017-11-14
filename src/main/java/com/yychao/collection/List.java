package com.yychao.collection;
import java.util.LinkedList;

public class List {
   public static void main(String[] args){
	   LinkedList<String>  l1 = new LinkedList<String>();
	   for(int i = 0 ;i <=  5; i++){
		   l1.add("a"+ i);
	   }
	   System.out.println(l1);
	   l1.add(3,"a100");
	   System.out.println(l1);
	   l1.set(6 , "a200");
	   System.out.println(l1);
	   System.out.print((String)l1.get(2)+" ");
       System.out.println(l1.indexOf("a3"));
       l1.remove(1);
       System.out.println(l1);
   } 
}
