package streamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class toArray {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(12,56,34,78,35,6,4,5,90,9);
		
		Object[] ans=l.stream().toArray();
		for(Object i: ans)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//second way
		
		List<Integer> l1=Arrays.asList(78,35,6,4,5,90,9);
		
		Integer[] i= l1.stream().toArray(Integer[]::new);
		for(Integer x:i)
		{
			System.out.println(x);
		}
		
		
		

	}

}
