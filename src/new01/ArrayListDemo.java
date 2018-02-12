package new01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String>  al=new ArrayList<>();
		al.add("Rasool");
		al.add("Mohammed");
		al.add("Salman");
		al.add("Rasool");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		ListIterator<String> itr2=al.listIterator();
		
		System.out.println("Using list iterator backward");
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
		}
		
		
//		System.out.println("Using for each loop");
//		for(String s:al)
//		{
//			System.out.println(s);
//		}



	}

}
