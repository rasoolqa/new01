package new01;

import java.util.Scanner;

public class Varun1 {

	public static void main(String[] args) {
		
		
		
		int n1=0;
		int n2=1;
		//int n3=0;
		System.out.println("Fibonaci series:");
		System.out.print(n1+"   ");
		System.out.print(n2+"   ");
		
		for (int i=2; i<=10;i++)
		{
			int n3=n1+n2;
			
			n1=n2;
			n2=n3;
			System.out.print(n3+"   ");
		}
		
		
		int no1=5, fact=1;
		
		for(int i=no1;i>0;i--)
		{
			fact=fact*i;
		}
		
		int factresult=fact(4);
		System.out.println(" Result :"+factresult);
		
		
		System.out.println("Factorial of "+no1 +" is :"+fact );
//		System.out.println("Before Swap num1  and num2  :"+ num1 +"  "+ num2);
//		
//		int temp;
//		temp =num1;
//		num1=num2;
//		num2=temp;
//		
//		System.out.println("After  Swap num1  and num2  :"+ num1 +"  "+ num2);
		
      int x1=154;
      int temp=x1;
      int sum=0;
      while (temp>0)
      {
    	  int x=temp%10;
    	  sum =sum +(x*x*x);
    	  temp=temp/10;
    	  
      }
      System.out.println("Sum :"+sum);
      if (sum==x1)
    	  System.out.println("The given number is Amstrong number");
      else
    	  System.out.println("The given number is not Amstrong number");
      
      

	}
	
	public static int fact(int n)
	{
		if (n==0)
			return 1;
		else 
			return (n=n*fact(n-1));
	}

}
