package org.java;

public class Calculator {

	public float add(float num1, float num2) {
		return num1 + num2;
	}

	public float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public float divide(float num1, float num2) {
	    if (num2 != 0) {
	        return num1 / num2;
	    } else {
	        throw new IllegalArgumentException("Impossibile dividere per zero.");
	    }
	}

	public float multiply(float num1, float num2) {
		return num1 * num2;
	}
	public static void main(String[] args) {
		Ticket t1 = new Ticket(100,18);
		System.out.println(t1.getFinalPrice());
	}
	
}
