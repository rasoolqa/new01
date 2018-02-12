package new01;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
	int rollno;
	String Name;
	char grade;
	int age;
	
	Student(int rollno,String Name,char grade,int age)
	{
		this.rollno=rollno;
		this.Name=Name;
		this.grade=grade;
		this.age=age;
	}
}

public class ArrayList2 {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Rasool",'A',30);
		Student s2=new Student(101,"Mohammed",'B',28);
		Student s3=new Student(101,"Palani",'C',32);
		Student s4=new Student(101,"Salman",'A',33);
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
//		Iterator<Student> itr=al.iterator();
//		while (itr.hasNext())
//		{
//			Student st=itr.next();
//			//System.out.println(st);
//			System.out.println(st.rollno+" " +st.Name+" "+st.grade+" "+st.age);
//		}
		
		for (Student ss:al)
		{
			System.out.println(ss.rollno+" "+ss.Name+" "+ss.grade+" "+ss.age);
		}
				
	}

}
