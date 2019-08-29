package com.ssi.StringTasks;
import java.util.*;

public class StringTask456 {
	
	// COUNT THE  OCCURENCE OF THE WORD JAVA IN THE ENTIRE STRING
	public void countWord()
	{
		int count=0;
		String s="this is java and java is object oriented proframming java is platform independent java";
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
			if(st.nextToken().equals("java"))
		count++;
		}
		System.out.println(count);
	}

	// CHECK WHETHER THE STRING IS PALINDROM OR NOT
	public void checkPalindrome(){
		String s="madam";
		String reverse="";
		int n=s.length();
		for(int i=n-1;i>=0;i--)
			reverse=reverse+s.charAt(i);
		if(s.equals(reverse))
			System.out.println("IT IS PALINDROME");
		else
			System.out.println("IT IS NOT PALINDROME");
		
	}
	
	// CHECK WHETHER THE STRING IS PALINDROM OR NOT USING STRING BUFFER
	public void checkPalindromeStringBuffer()
	{
		String s="MADAM";
		StringBuffer sb=new StringBuffer(s);
 
		if(sb.reverse().equals(sb))
			System.out.println("IT IS PALINDROME");
		else
			System.out.println("IT IS NOT PALINDROME");
		
		
	}
	
	// COUNT THE OCCURENCE OF SPACE,SPECIALCHARACTER,SMALL,CAPITALLETTER,NUMBERS IN THE GIVEN STRING
	public void countCharacters()
	{
		int capital=0;
		int small=0;
		int space=0;
		int digit=0;
		int character=0;
		String s="Hello User 123 YOu Can mail me AT @xyz4343.com with# java!";
		 for(int i = 0; i< s.length(); i++) 
	        { 
	            char ch = s.charAt(i); 
	            if (ch >= 'a' && ch <= 'z') 
	               small=small+1; 
	            else if(ch >= 'A' && ch <= 'Z') 
	                capital=capital+1; 
	            else if(ch >= '0' && ch <= '9') 
	                digit=digit+1;
	            else if(ch==' ')
	               space=space+1;
	            else
	            	character=character+1;
	        } 
		 System.out.println("Small Letters:"+small);
		 System.out.println("Capital Letters:"+capital);
		 System.out.println("White Spaces:"+space);
		 System.out.println("Digits:"+digit);
		 System.out.println("Special Character:"+character);
		
	}
	
	
	public static void main(String[] args) {
		StringTask456 s2=new StringTask456();
		System.out.println("----------------------------------COUNT WORD----------------------------");
		s2.countWord();
		System.out.println("-------------------------------CHECK PALINDROME----------------------------");
        s2.checkPalindrome();
        System.out.println("-------------------------------COUNT SPACE CHARCTER NUMBERS-----------------------");
        s2.countCharacters();
        System.out.println("------------------------------CHECK PALINDROME USING STRINGBUFFER---------------------");
        s2.checkPalindromeStringBuffer();
	}

}
