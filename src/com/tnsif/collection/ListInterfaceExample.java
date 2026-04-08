package collection.example;
import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExample {
	
	// Creation or initialization
	private List<String> fruits = new ArrayList<>();
	
	//add & dupilcate list
	public void runDemo() {
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple"); // duplicate
		fruits.add(null);
		System.out.println("Elements inside the List: " +fruits);

	
	// size - how many values are inside
	//IsEmplty - used to check weather a container is empty or not
	System.out.println("Current Size:" + fruits.size());
	System.out.println("Is the list if Empty?:" + fruits.isEmpty());
	
	// Contains
	System.out.println("Contains 'Banana'?" + fruits.contains("Banana"));
	
	// Remove
	fruits.remove("Banana");
	System.out.println("After removing: " + fruits);
	
	//RetiailAll (keep only the Matching items)
	// we can define a Filter list of what we can keep
	List<String> filter = new ArrayList<>();
	filter.add("Apple");
	fruits.retainAll(filter);// removes everything except "Apple"
	System.out.println("After retainAll (Kept only 'Apple'): " + fruits);
	
	//Clear
	fruits.clear();
	System.out.println("After Clear: " + fruits);
	
}
	

	public static void main(String[] args) {
		ListInterfaceExample obj = new ListInterfaceExample();
		obj.runDemo();
		
	}

}
