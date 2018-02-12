package new01;

import java.util.Scanner;

public class Countclass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the screen");
		
		while(sc.hasNext())
		{
			String line=sc.nextLine();
			
			String[] arr=line.split(" ");
			int word=0;
			
			for(int i=0;i<arr.length;i++)
			{
				word++;
			}
			
			System.out.println("Word count :"+word);
			
		}
		
				
	}

}
