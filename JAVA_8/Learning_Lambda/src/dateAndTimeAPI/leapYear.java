package dateAndTimeAPI;

import java.time.Year;
//check given year is leap or not
import java.util.*;


public class leapYear {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter year: ");
		int n= sc.nextInt();
		
		Year y= Year.of(n);
		if(y.isLeap()) 
		{
			System.out.printf("%d is leap year: ",n);
		}
		else
		{
			System.out.printf("%d is not leap year: ",n);
		}
	}

}
