package primitiveTypeFI.BinaryOperator;

import java.util.function.IntBinaryOperator;

public class intBinaryOperator {
	
	public static void main(String[] args)
	{
		IntBinaryOperator i= (j,k)->j+k;
		System.out.println(i.applyAsInt(3, 4));
		
	}

}
