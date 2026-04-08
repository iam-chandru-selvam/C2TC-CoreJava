package stream.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		
		//Creating a stream from set of values
		Stream<Integer> stream = Stream.of(10,20,30,40,50,60,70);


		// Counting no. of elements
		System.out.println("No. of elements:" + stream.count());

		Integer[] values = new Integer[] {10,20,30,13,10,11,12,13};
		
		//creating a stream from an Array
		stream = Arrays.stream(values);
		
		//map
		System.out.println("Squares of" + Arrays.toString(values) + "is as follows :");
		stream.map(num -> num * num).forEach(System.out::println);
		stream = stream.map(m->m*m);
		stream.forEach(System.out::println);
		
		//limit
		System.out.println("Firt 2 elements are :");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//skip
		System.out.println("Elements excepts first 4:");
		Arrays.stream(values).skip(4).forEach(System.out::println);
	}

}
