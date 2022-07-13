
import java.util.TreeMap;

public class Collection_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();

		tMap.put(1, "Tiger");
		tMap.put(2, "Lion");
		tMap.put(3, "Deer");
		tMap.put(4, "Monkey");
		tMap.put(4, "Monkey");

		// print the TreeMap in one go
		System.out.println(tMap);

		// print the value one by one
		for (Integer key : tMap.keySet()) {
			System.out.println(key + " = " + tMap.get(key));
		}

	}
}
