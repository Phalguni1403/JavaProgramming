
import java.util.HashSet;
import java.util.Iterator;

public class Collection_HashSet {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();

		hset.add("Tiger");
		hset.add("Lion");
		hset.add("Deer");
		hset.add("Monkey");

		// print the HashSet in one go
		System.out.println(hset);

		// print the value one by one in HashSet
		Iterator<String> i = hset.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}