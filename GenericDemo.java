package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

	public static<E> void toPrint(E[] inputArray) {
		for(E elements : inputArray) {
			System.out.println("elements are: " +elements);
		}
	}

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5,6,7};
		Double[] doubleArray = {1.2,3.4,5.7,6.8};
		Character[] charArray = {'a','b','c','d','e','f','g','h'};
		toPrint(intArray);
		toPrint(doubleArray);
		toPrint(charArray);
	}
}
