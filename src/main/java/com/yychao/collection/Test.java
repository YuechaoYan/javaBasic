package com.yychao.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main (String[] args){
    	Collection c = new ArrayList();
    	c.add("hello");
    	c.add(new Name("f1","l1"));
    	c.add(new Integer(100));
    	c.remove("hello");
    	c.remove(new Integer(100));
    	c.remove(new Name("f1","l1"));
    	System.out.println(c.size());
    	System.out.println(c);
    	
    	ArrayList d = new ArrayList();
    	d.add(new Name("Tommy","Yan"));
    	d.add(new Name("Enchoes","Luo"));
    	d.add(new Name("Encho","Luo"));
    	Collections.sort( d);
    	System.out.println(d);
    }
    
}
class Name implements Comparable{
	private String firstName, lastName;
	public Name(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName(){ return firstName ;}
	public String getLastName() { return lastName ;}
	public String toString(){ return firstName +" " +lastName; }
	public boolean equals(Object obj){
		if(obj instanceof Name){
			Name name = (Name) obj;
			return (this.firstName.equals(name.firstName))
				&&(this.lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}
	public int hashCode(){
		return firstName.hashCode();
	}
	/*
	 * ʵ��collection�ӿڵ����ڵ���remove�ķ���ʱ������equals�������бȽϵġ�
	 * ��removeһ���Լ�������ࣨName��ʱ����Ҫ��д�Զ������ equals��hashCode(ȱһ����)�ķ���
	 * ���ʵ��collection�ӿڵ��౻����Map�еļ�ֵ����ô����Ҫ��д�����hashCode�����ķ���
	 * ��Ϊ��Map����Ѱ�Ҽ�ֵʱ���Ƚϲ����õ�equals�������Ƚϵ������ߵ�hashCode,
	 * hashCode��һ�����ڴ��ַ�йص�ֵ
	 */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Name name = (Name) o;
		int compareResult= this.getLastName().compareTo(name.getLastName());
		if(compareResult ==0){
			return this.getFirstName().compareTo(name.getFirstName());
		}else{
			return compareResult;
		}	
		
	}
}
