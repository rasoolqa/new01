package new01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
	
	
	
	public static void recursive(int n1)
	{
		if (n1<=10)
		{
			System.out.println(n1);
			recursive(n1+1);
		}
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		//int n2=15453;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n=sc.nextInt();
//		
//		
//		int temp=n;
//		int sum=0;
//		while(temp!=0)
//		{
//			int x=temp%10;
//			//System.out.println(x);
//			sum=sum+x;
//			temp=temp/10;
//				
//		}
//		
//		System.out.println("Sum = "+sum);
		
		//String name="Rasool";
		//String rev=null;
		
		
		
		recor(2);
		//recursive(1);
//		try{
//		FileReader fr=new FileReader("C:\\Rasool\\testout.txt");    
//        int i;    
//        while((i=fr.read())!=-1)    
//        System.out.print((char)i);    
//        fr.close();    
//		}
//		catch(Exception e)
//		{
//			System.out.println("File Handle error");
//		}
		
		
		FileReader file = new FileReader("C:/Rasool/testout.txt");
	    BufferedReader reader = new BufferedReader(file);

	    String key = "";
	    String line = reader.readLine();

	    while (line != null) {
	        key += line;
	        line = reader.readLine();
	    }

	    System.out.println(key); //this prints contents of .txt file
		
		
		
	}
	
	public static void recor(int no1)
	
	{
		if (no1<=10)
		{
			System.out.println(no1);
			recor(no1+1);
			
		}
		
	}
	
}
