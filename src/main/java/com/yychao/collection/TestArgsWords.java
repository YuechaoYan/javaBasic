package com.yychao.collection;
import java.util.HashMap;
import java.util.Map;

public class TestArgsWords {
   private static final int ONE = 1;
   public static void main(String args[]){
	   Map m = new HashMap();
	   for (int i = 0; i < args.length;i++){
	      Integer freq = (Integer)m.get(args[i]);
	      if(freq == null){
	    	  m.put(args[i], ONE);
	      }else{
	    	  m.put(args[i],(freq+1));
	      }
	   }
	   System.out.println(m);
   }
}
