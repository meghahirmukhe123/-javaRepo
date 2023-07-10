package streamMethods;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.*;


public class minAndmax {

	public static void main(String[] args) {
		
		int[] arr= {3,7,4,8,9,7};
		IntStream stream = Arrays.stream(arr);
		
		OptionalInt minnum=stream.min();
		System.out.println(minnum);
		
		//ex2
		List<Integer> l= Arrays.asList(2,6,3,90,56,45,7,23);
		
		Optional<Integer> ans=l.stream().min((val1,val2)->val1.compareTo(val2));
		System.out.println(ans);
		
		
		Optional<Integer> ans1=l.stream().max((val1,val2)->val1.compareTo(val2));
		System.out.println(ans1);
		
		
		
		
		
		
	}

}
