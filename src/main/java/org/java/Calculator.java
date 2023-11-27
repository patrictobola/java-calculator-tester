package org.java;

public class Calculator {

	public static float add(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public static float divide(float num1, float num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			System.out.println("Errore: Impossibile dividere per zero.");
			return Float.NaN; // Not a Number
		}
	}

	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}
	public static void main(String[] args) {
		System.out.println(divide(8,5));
	}
}
