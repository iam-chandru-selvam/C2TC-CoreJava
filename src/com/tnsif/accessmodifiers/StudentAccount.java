package com.tnsif.accessmodifiers;

public class StudentAccount {
	//PRIVATE: Only this class can see or change this.
	// It protects the data from being messed up by the other classes
	
	private int grade = 85;
	
	//PUBLIC: Anyone can call this method from anywhere.
	// This is the "Safe" way to let others see the data/code
	public void displayGrade() {
		System.out.println("The students's grade is: " +grade);
	}

}