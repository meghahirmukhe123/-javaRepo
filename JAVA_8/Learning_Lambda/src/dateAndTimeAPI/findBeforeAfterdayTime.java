package dateAndTimeAPI;

import java.time.LocalDateTime;

//if we want to get date and time before after particular month,day,year

public class findBeforeAfterdayTime {
	public static void main(String[] args)
	
	{
		LocalDateTime lt= LocalDateTime.of(1989,12,11,04,13,34,20);
		System.out.println("local date and time: "+lt);
		
		System.out.println("date time after 6b month: "+lt.plusMonths(6));  //it will give date time after 6 months of given month
		
		System.out.println("date time before 6 month: "+lt.minusMonths(6));  //it will give date time before 6 months of given month
		
		System.out.println("date time after 12 days: "+lt.plusDays(12));    //it will give date time after 12 days
		System.out.println("date time before 3 days: "+lt.minusDays(3));    //it will give date time before 3 days
		
		System.out.println("date and time before 6 year: "+lt.plusYears(6)); //it will give date and time after 6 yr
		
		System.out.println("date and time after 6 year: "+lt.minusYears(6)); //it will give date and time before 6 year
 		
		System.out.println("date and time after 12 hour: "+lt.plusHours(12));  //it will give date and time after 12 hours
		
		System.out.println("date and time before 12 hours: "+lt.minusHours(12));  //it will give date and time before 12 hours
		
	}

}
