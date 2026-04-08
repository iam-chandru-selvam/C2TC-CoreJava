package com.tnsif.accessmodifiers;

public class Child extends Parent{
	public void makeDinner() {
		System.out.println("The child is using" + secretReceipe);
		cook();
	
	}
}
