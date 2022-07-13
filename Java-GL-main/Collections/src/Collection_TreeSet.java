
import java.util.Iterator;
import java.util.TreeSet;

public class Collection_TreeSet {
	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();

		tset.add("Tiger");
		tset.add("Lion");
		tset.add("Deer");
		tset.add("Monkey");

		// print the TreeSet in one go
		System.out.println(tset);

		// print the value one by one in TreeSet
		Iterator<String> i = tset.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
