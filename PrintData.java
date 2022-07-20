package com.generics;

public class PrintData {
	
	public static void toPrint(Integer[] ab) {
		for(int intElement : ab) {
			System.out.println("Integer array: "+intElement);
		}
	}
	
	public static void toPrint(Double[] bc) {
		for(double doubleElement : bc) {
			System.out.println("Double array is: "+doubleElement);
		}
	}
	
	public static void toPrint(Character[] cd) {
		for(Character charElement : cd) {
			System.out.println("Character array: "+charElement);
		}
	}
	

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5,6};
		Double[] doubleArray = {1.1, 1.2, 1.5, 4.3, 6.7};
		Character[] charArray = {'a','b','c','d','e','f','g','h'};
		toPrint(intArray);
		toPrint(doubleArray);
		toPrint(charArray);
		
	}
}
