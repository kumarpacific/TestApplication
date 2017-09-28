package collectionPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, Car> map = new HashMap<>();
		Map<Integer, Car> cm = new ConcurrentHashMap<>();
		cm.put(1, new Car("Prashant"));
		map.put(1, new Car("Prashant"));
		map.put(2, new Car("shant"));
		map.put(3, new Car("rashant"));

		Iterator it = map.keySet().iterator();
		Iterator it2 = cm.keySet().iterator();

		while (it.hasNext()) {
			System.out.println(map.get(it.next()).getName());

		}

		while (it2.hasNext()) {
			System.out.println(cm.get(it2.next()).getName());

		}

	}

}
