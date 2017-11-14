package com.yychao.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTransForm2 {
	public static void main(String [] args){
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    String s = null;	    
	    try {
			s=br.readLine();
			while(s != null){
				if(s.equalsIgnoreCase("exit")){
					break ;
				}
				System.out.println(s.toUpperCase());
				s = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
