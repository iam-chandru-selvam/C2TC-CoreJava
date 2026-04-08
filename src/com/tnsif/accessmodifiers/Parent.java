package com.tnsif.accessmodifiers;

public class Parent {
	// PROTECTED: Only the subclasses or in the same package
	
	protected String secretReceipe = "Grandma's Secret Spices";
	
	protected void cook() {
		System.out.println("Cooking with" + secretReceipe);
		
	}
}
