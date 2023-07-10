package dateAndTimeAPI;
import java.time.*;

public class ex1 {
	public static void main(String[] args)
	{
		LocalDate date= LocalDate.now();
		System.out.println("current system date is: "+date);
		
		LocalTime time= LocalTime.now();
		System.out.println("current system time is: "+time);
		
		LocalDate t= LocalDate.EPOCH;
		System.out.println("LocalDate.EPOCH: "+t);
		
		LocalTime t1= LocalTime.MAX;
		System.out.println("LocalTime.MAX: "+t1);
		
		LocalTime t2= LocalTime.MIDNIGHT;
		System.out.println("LocalTime.midnight: "+t2);
		
		LocalTime t3= LocalTime.of(0, 0);
		System.out.println("LocalTime.of: "+t3);
		
		
		LocalTime t4= LocalTime.ofNanoOfDay(2);
		System.out.println("LocalTime.nanoofday: "+t4);
		
		LocalTime t5= LocalTime.from(t1);
		System.out.println("LocalTime.from: "+t5);
	}

}
