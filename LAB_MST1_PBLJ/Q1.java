/*Question 2: HashMap
Create a Java program that uses a HashMap to store employee IDs (Integer) as
 keys and their names (String) as values. Write methods to:
1. Add an employee to the map.
2. Retrieve an employee's name by ID.
3. Throw a custom exception if the ID is not found*/


package MST1;
import java.util.*;
public class Q1 {
public static void main(String args[]) {
	Map<Integer, String> map = new HashMap<>();
	Scanner br = new Scanner(System.in);
	int n = br.nextInt();
	for(int i = 0; i < n; i ++){
		map.put(i, br.next());
	}
	int id = br.nextInt();
	try {
		System.out.println(map.get(id));
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}
