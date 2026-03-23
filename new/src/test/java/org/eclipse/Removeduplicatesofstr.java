package org.eclipse;

import java.util.*;

public class Removeduplicatesofstr {
public static void main(String[] args) {
	
	String str= "java";
//	String dup="";
//	for(int i=0;i<str.length();i++) {
//		char c = str.charAt(i);
//		if(dup.indexOf(c)== -1) {
//			dup=dup+c;
//			
//		}
//		
//	}System.out.println(dup);
	
	
	LinkedHashSet<Character> c= new LinkedHashSet<>();
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		c.add(ch);
	}
	System.out.println(c);
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
