package new01;

import java.util.HashMap;

public class StringExample
{	public static void main(String[] args)
	{	
		//String s1 = "Computer";
//	 	String s2 = "Science ";
//		String s3 = s1.substring(1,5);
//		String s4= s1.trim();
//		System.out.println("Compare: "+s1.compareTo(s2));
//		
//		System.out.println("s1: " + s1);
//		System.out.println("s2: " + s2);
//		System.out.println("s3: " + s3);
//		System.out.println("s4: " + s4);
//		//System.out.println("s5: " + s5);
//		//System.out.println("s6: " + s6);
//		
//		System.out.println(s1.concat("rrrrrrrrrrrrrrr"));
		
		
		String s7 = "Computer";
		System.out.println("S7   :"+s7);
		s7= s7.substring(2,7);
		System.out.println("S7   :"+s7);
		
		//System.out.println("S7   :"+s7);
		
		char[] n=s7.toCharArray();
//		
//		for (int i=0;i<n.length;i++)
//		{
//			System.out.println(n[i]);
//		}
		
		System.out.println("");
		for (int i=n.length-1;i>=0;i--)
		{
			System.out.print(n[i]);
		}
		System.out.println("");
		StringBuilder sb1= new StringBuilder("Mohammed");
		System.out.println("sb: "+sb1.capacity());
		
		StringBuilder sb=new StringBuilder("Hello");  
		sb.replace(2,3,"Java");  
		System.out.println(sb);//prints HJavalo 
		
		HashMap<Character, Integer> hm=new HashMap<>();
		hm.put('a', 1);
		hm.put('B', 2);
		hm.put('c', 3);
		System.out.println(hm.get('c'));
		
		
		
		
		
		
		
		
	}
}