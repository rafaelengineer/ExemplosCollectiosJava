import java.util.Map;
import java.util.TreeMap;

public class TreeMap_{
	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap<>();

		// Adding elements to the tree map
		treeMap.put("A", 1);
		treeMap.put("C", 3);
		treeMap.put("B", 2);
		System.out.println("key:A, value: 1");
		System.out.println("key:C, value: 3");
		System.out.println("key:B, value: 2");

		// Getting values from the tree map
		System.out.println("Getting values from the tree map.");
		int valueA = treeMap.get("A");
		System.out.println("Value of A: " + valueA+ "\n");

		//Removing elements from the tree map"
		System.out.println("Removing element B from the tree map");
		treeMap.remove("B");

		// Iterating over the elements of the tree map
		System.out.println("\nIterating over the elements of the tree map");
		for (String key : treeMap.keySet()) {
			System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
		}
	}
}
