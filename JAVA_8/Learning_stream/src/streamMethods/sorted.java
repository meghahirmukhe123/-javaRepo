package streamMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sorted {
	public static void main(String[] args)
	{
		List<Integer> l= List.of(1,7,4,9,3,5);
		System.out.println("asceding order");
		
		List<Integer> l2= l.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);
		
		//reverse order
		System.out.println("descending order");
		List<Integer> l3= l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(l3);
		
		
		//second way of reverse order
		
		System.out.println("second way of reverse order");
		List<Integer> l4= new ArrayList<>();
		l4.add(12);
		l4.add(1);
		l4.add(9);
		l4.add(4);
		System.out.println("l4 is: "+l4);
		l4.stream().sorted((i1,i2)->-i1.compareTo(i2)).forEach(s->System.out.print(s+" "));
		
		
		
		
	}

}
