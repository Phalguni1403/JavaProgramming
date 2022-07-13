import java.util.HashMap;

public class Collection_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();

		hMap.put(1, "Tiger");	
		hMap.put(2, "Lion");
		hMap.put(3, "Deer");
		hMap.put(4, "Monkey");
		hMap.put(5, "Monkey");

		// print the HashMap in one go
		System.out.println(hMap);

		// print the value one by one
		for (Integer key : hMap.keySet()) {
			System.out.println(key + " = " + hMap.get(key));
		}

		// Calculate the size of HashMap
		System.out.println("Size of HashMap is: " + hMap.size());

	}
}
