package java8BasicApplication.project1;
//You are given a list of integers. 
//Write a Java program to find the sum of all the even numbers in the list using Java 8 features.
import java.util.*;
import java.util.stream.Collectors;
interface project1 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of list: ");
		int size= sc.nextInt();
		
		List<Integer> l= new ArrayList<>();
		System.out.println("enter elements: ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());
		}
		System.out.println("given list is :");
		for(int i:l)
		{
			System.out.println(i);
		}
		
		List<Integer> ans= new ArrayList<>();
		ans=l.stream().filter(x->x%2==0).collect(Collectors.toList()); //got even numbers
		
		int sum=0;
		for(int i:ans)
		{
			sum=sum+i;
		}
		System.out.println("sum is: "+sum);
		
			
		
		
	}

	
}
