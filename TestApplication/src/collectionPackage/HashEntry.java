package collectionPackage;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashEntry {
	public static void main(String[] args){
		
		HashMap<String,String> hm = new HashMap<>();
		hm.put("one", "First");
		hm.put("two", "Second");
		hm.put("three", "Third");
		hm.put("Four", "Fourth");
		
		
		ArrayList<Entry<String,String>> al=new ArrayList<>(hm.entrySet());
		Collections.sort(al, new Comparator<Map.Entry<String,String>>() {
			public int compare(Map.Entry<String, String> o1,Map.Entry<String, String> o2){
				return (o1.getValue()).compareTo(o2.getValue());
			}
			
		});
		
		for (Entry<String, String> entry:al){
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
