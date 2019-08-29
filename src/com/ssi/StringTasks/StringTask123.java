package com.ssi.StringTasks;

public class StringTask123 {

	
	private static int x;
	private static int countGmail;;
	private int countYahoo;
	
	// OBSERVE THE DOMAIN FOR EACH EMAIL ID
	public  void findDomain()
	{
		String email[] = {"anjali@gmail.com","Sadiya45@gmail.com","Arrti@yahoo.com","Ashimittal@yahoo.com","Pooja@gmail.com","Sakshi323@gmail.com"};
		for(int i=0;i<email.length;i++)
		{
			String pi="gmail.com";
			x = email[i].lastIndexOf('@');
			if(email[i].substring(x+1).equalsIgnoreCase(pi))
			{
				countGmail++;
			}
			else
			countYahoo++	;
		
		}
		
		System.out.println("We have "+countGmail+" gmail ID");
		System.out.println("We have "+countYahoo+" Yahoo ID");
		System.out.println("------------------------------------");
	}	
	
	// FIND THE BRANCHES ON THE BASIS OF NUMBER IN THE STRING 12-CS,34-Me,56-civil

	public  void findBranch(){
		
		
		String branch[] = {"1233434","345656","5698349","1278346398"};
		
		for(int i=0;i<branch.length;i++)
		{
			
		   if((branch[i].charAt(0)=='1')&&(branch[i].charAt(1)=='2'))
				System.out.println("CSE BRANCH");
		   else if((branch[i].charAt(0)=='3')&&(branch[i].charAt(1)=='4'))
				System.out.println("MECHANICAL BRANCH");
			else if ((branch[i].charAt(0)=='5')&&(branch[i].charAt(1)=='6'))
				System.out.println("CIVIL BRANCH");
			else
				System.out.println("NOT FROM SPECIFIED BRANCHES");
		  }
		
		System.out.println("------------------------------------");
	  }
	
	// WITHOUT USING INBUILT METHODS SORT THE STRING ARRAY IN ASCENCDING ORDER
	public  void sortCity(){
		String temp="";
		int n=0;
		String city[]={"Indore","Hyderabad","Bhopal","Delhi","Mumbai"};
		n=city.length;
		 for (int i=0; i < n; i++) 
	        {
	          for (int j = i + 1; j < n; j++) 
	           {
	           if (city[i].compareTo(city[j])>0) 
	            {
	                    temp = city[i];
	                    city[i] = city[j];
	                    city[j] = temp;
	             }
	            }
	        }
		 System.out.print("Names in Sorted Order:");
	        for (int i = 0; i < n ; i++) 
	        {
	            System.out.print(city[i] + ",");
	        }
	       
	    }
		 
	
	
	public static void main(String[] args) {
		
		StringTask123 stask1=new StringTask123();
		System.out.println("----------------------------------FIND DOMAIN---------------------------");
		stask1.findDomain();
		System.out.println("---------------------------------FIND BRANCHES----------------------------");
		stask1.findBranch();
		System.out.println("----------------------------------STRING ARRAY SORTING---------------------------");
		stask1.sortCity();
		
		
	}

}
