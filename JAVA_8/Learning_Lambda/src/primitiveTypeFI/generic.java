package primitiveTypeFI;

public class generic {
	
	public <E> void printArray(E[] s)
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	public static void main(String[] args)
	{
		generic g= new generic();
		String[] str= {"cat","dog","mouse"};
		Integer[] i= {1,2,3,4,5,6};
		g.printArray(str);
		g.printArray(i);
		
	}

}


//second way:print data using foreach loop
//following example is for printing simple data.above example is for array

class Foreach{
	public <a> void printdata(a x)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args)
	{
		Foreach f= new Foreach();
		String s="hello world";
		int i=12;
		f.printdata("string is: "+s);
		f.printdata("integer is: "+i);
	}
}
