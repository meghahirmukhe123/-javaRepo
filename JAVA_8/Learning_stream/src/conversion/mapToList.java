package conversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mapToList {
	public static void main(String[] args)
	{
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        List<Map.Entry<Integer, String>> l = new ArrayList<>();
        l= map.entrySet().stream().collect(Collectors.toList());
        System.out.println(l);
        
        for(Map.Entry<Integer, String> e:l)
        {
        	System.out.println(e.getKey()+" "+e.getValue());
        }
        

	}

}
