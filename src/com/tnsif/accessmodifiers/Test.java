package com.tnsif.accessmodifiers;

public class Test {
	public static void main(String[]args) {
		StudentAccount myAccount = new StudentAccount();
		//1. This works
		// because displaygrade  is public, we can see it
		myAccount.displayGrade();
		
		//2. This Fails
		// grade is being a private access
	//	myAccount.grade = 100;
		
	}

}