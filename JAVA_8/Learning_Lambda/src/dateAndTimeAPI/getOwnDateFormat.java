package dateAndTimeAPI;

import java.time.LocalDate;

//if we want to print date in our own forwat
//ex: 17-04-2023


public class getOwnDateFormat {

	public static void main(String[] args)
	{
		LocalDate date= LocalDate.now();
		
		System.out.println("system date is: "+date);
		
		//if we want to print date in own format get day first then get month then get year
		
		int d= date.getDayOfMonth();
		int month= date.getMonthValue();
		int year= date.getYear();
		//if want to print in dd-mm-yyyy
		//1st way
		System.out.printf("%d-%d-%d",d,month,year);
		System.out.println();
		//System.out.println("%d-%d-%d",d,month,year);//we used printf println will support to print "%d-%d-%d",d,month,year
		
		//2nd way
		System.out.println(d+"-"+month+"-"+year);
		
	
		
		
	}
}
