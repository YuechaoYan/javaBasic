package com.yychao.collection;
import java.util.ArrayList;
import java.util.Collection;

public class EnhancedFor {
    public static void main(String[] args){
    	int[] arr = {1,2,3,4,5};
    	for(int i : arr){
    		System.out.println(i);
    	}
    	
    	Collection c = new ArrayList();
    	c.add(new String("aaa"));
    	c.add(new String("bbb"));
    	c.add(new String("ccc"));
    	for(Object str : c){
    		System.out.println(str);
    	}
    	/*
    	 * ����ɾ��ArrayList�ڲ��Ķ���
    	 * �ڲ���ʵ��Ҳ����iterator���ŵ�ֻ�Ǵ����࣬��Ҫ��ʹ�á�
    	 */
    }
}
