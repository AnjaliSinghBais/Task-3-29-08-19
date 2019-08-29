package com.ssi.StringTasks;
import java.util.*;

public class StringTask78910 {

	// Arrange in the given format in different lines
	public void countries()
	{
		String s="INDIA,Australia,Africa,England";
		StringTokenizer st=new StringTokenizer(s,",");
		while(st.hasMoreTokens())
		{
			
			System.out.println(st.nextToken());
      	}
			
	}
	
	// Remove the Numbers from the String
	
	public void alphaneumeric ()
	{
	String s="ad3dadddfd5443dfsfss";
		String news=s.replaceAll("[0-9]","");
		System.out.println(news);
		
	}
	
	// Create Tokens
	public void createToken()
	{
		String s="1.JAVA,2.ORACLE,3.PYTHON,4.php,5.Linux";
		StringTokenizer st=new StringTokenizer(s,"1 2 3 4 5 .,");
		while(st.hasMoreTokens())
		{
				System.out.println(st.nextToken());
			
		}
		
	}
	
	
	
	
	public static void main(String args[])
	{
		StringTask78910 s=new StringTask78910();
		System.out.println("--------------------------------ARRANGE IN GIVEN FORMAT---------------------------");
		s.countries();
		System.out.println("----------------------------------REMOVE NUMBERS----------------------------");
		s.alphaneumeric();
		System.out.println("----------------------------------CREATE TOKENS----------------------------");
		s.createToken();
		
	}
	
	
	
	
}
