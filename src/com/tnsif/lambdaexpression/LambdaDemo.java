package lambda.example;

//Functional Interface - It has only one abstract method

public class LambdaDemo {
	interface MathOperation {
		int operation(int a , int b);
	}
	public static void main(String[] args) {
		
		//Traditional way
	//	Anonymous inner class
		MathOperation addition = new MathOperation() {
			@Override
			public int operation(int a , int b) {
				return a + b;
			}
		};
		
		// Lambda way: concise and readable
		//we don't need specify types(int) because java infers them 
		
		MathOperation subtraction = (a,b) -> a - b;
		MathOperation multiplication = (a,b) -> a * b;
		
		// Testing
		System.out.println("10 + 5 =" + addition.operation(10, 5));
		System.out.println("10 - 5 =" + subtraction.operation(10, 5));
		System.out.println("10 * 5 =" + multiplication.operation(10, 5));
		
		// Using a lambda with java built in forEach
		java.util.List<String> tools = java.util.Arrays.asList("Java", "Lambda", "Streams");
		System.out.println("\nPrinting list items using Lambda:");
		tools.forEach(item -> System.out.println(" - " + item));	
			

	}

}
