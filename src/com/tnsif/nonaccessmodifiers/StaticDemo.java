package com.tnsif.nonaccessmodifiers;

public class StaticDemo {
	static int count;
	
	static {
		count =15;
		System.out.println("In static block "+count);
	}

	static void display() {
		System.out.println("In static method -> "+count);
	}
	
	public static void main(String[] args) {
		display();
	}
}