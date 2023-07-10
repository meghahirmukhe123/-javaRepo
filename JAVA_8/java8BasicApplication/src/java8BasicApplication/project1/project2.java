package java8BasicApplication.project1;
//You are given a list of strings. Write a Java program to filter out all the strings that contain the letter 'a' 
import java.util.*;
import java.util.function.Predicate;

public interface project2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of list");
		int size= sc.nextInt();
		List<String> l= new ArrayList<>();
		System.out.println("enter elemenets: ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.next());
		}
		System.out.println("list of string is: ");
		for(String s:l)
		{
			System.out.print(s+" ");
		}System.out.println();
		
		Predicate<String> pr= i->i.contains("a");
		for(String str:l)
		{
			if(pr.test(str))
			{
				System.out.println(str+" contains 'a'");
			}
			else {
				System.out.println(str+" not contains 'a'");
			}
		}
		
	
		
	}

}
