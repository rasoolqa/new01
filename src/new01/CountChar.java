package new01;

import java.util.HashMap;

public class CountChar {
	
	static void countChar(String input)
	{
		HashMap<Character, Integer> hmap = new HashMap<>();
		char[] inp =input.toCharArray();
		
		for(char i:inp)
		{
			if(hmap.containsKey(i))
			{
				hmap.put(i, hmap.get(i)+1);
			}
			else 
			{
				hmap.put(i,1);
			}
		}
		System.out.println(hmap);
		
	}

	public static void main(String[] args) {
		

		countChar("abcdefghijklmnopqrstuvwxyzABC123");
		
	}

}
