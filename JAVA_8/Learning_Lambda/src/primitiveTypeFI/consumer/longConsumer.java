package primitiveTypeFI.consumer;

import java.util.function.LongConsumer;

public class longConsumer {
	public static void main(String[] args)
	{
		long[] l= {1,2,3,4,5};
		LongConsumer i= j->System.out.println(j);
		for(long x:l)
		{
			i.accept(x);
		}
	}

}
