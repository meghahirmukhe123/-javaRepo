package primitiveTypeFI.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ObjIntConsumer;

//inc salory of emp by 500
class emp
{
	String name;
	int salory;
	
	public emp(String name,int salory)
	{
		this.name=name;
		this.salory=salory;
	}
}
public class objToIntConsumer {
	
	public static void main(String[] args)
	{
		List<emp> l= new ArrayList<>();
		l.add(new emp("megha",7000));
		l.add(new emp("anu",3000));
		l.add(new emp("tanu",4000));
		l.add(new emp("manu",5000));
		l.add(new emp("raju",6000));
		
		ObjIntConsumer<emp> o=(e,i)->e.salory=e.salory+i;
		
		for(emp x:l)
		{
			o.accept(x, 500);
			System.out.println(x.name+" new salory is: "+x.salory);
		}
	}

}
