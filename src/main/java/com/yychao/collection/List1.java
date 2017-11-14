package com.yychao.collection;
import java.util.Collections;
import java.util.LinkedList;

public class List1 {
     public static void main(String [] args){
    	 LinkedList<String> l1 = new LinkedList<String>();
    	 LinkedList<String> l2 = new LinkedList<String>();
    	 for(int i = 0; i <= 9; i++ ){
    		 l1.add("a"+ i);
    	 }
    	 System.out.println(l1);
    	 Collections.shuffle(l1);//
    	 System.out.println(l1);
    	 
    	 Collections.reverse(l1);
    	 System.out.println(l1);//
    	 
    	 Collections.sort(l1);
    	 System.out.println(l1);//
    	 
    	 System.out.println(Collections.binarySearch(l1, "a5"));
    	 
     }
}
