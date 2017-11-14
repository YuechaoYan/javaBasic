package com.yychao.collection;
import java.util.HashSet;

public class Set {
	public static void main(String[] args){
    HashSet<String> s1 = new HashSet<String>();
    HashSet<String> s2 = new HashSet<String>();
    s1.add("a");s1.add("b");s1.add("c");
    s2.add("d");s2.add("a");s2.add("b");
    //Set ��List�����඼����Constructor��Collection c��
    //���췽�����Գ�ʼ��������
    HashSet<String> sn = new HashSet<String>(s1);
    sn.retainAll(s2);
    //�ҵ�sn��s1������ͬ��Ԫ�� a,b
    HashSet<String> su = new HashSet<String>(s1);
    su.addAll(s2);
    //��su��s2����Ԫ�ع鲢��һ�𣬵�ȥ���ظ���Ԫ�ء�
    System.out.println(sn);
    System.out.println(su);
    
	}
}
