package collectionPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
	
	public void ExplainMap(){
	Map<Integer,Car> map = new HashMap<>();
	map.put(1,new Car("Prashant"));
	map.put(2,new Car("shant"));
	map.put(3,new Car("rashant"));
	
	Iterator it = map.keySet().iterator();
	
	while(it.hasNext()){
		System.out.println(map.get(it.next()));
		
		
		
	}
	
	
	}
	
	
	
	

}
