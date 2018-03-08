/**
 * Jan Toma
 * CS310 Section 2
 */
package tests;

import data_structures.LinkedList;

public class HashListTests {
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	public HashListTests() {
		for(int i = 1; i <= 50; i++ ) {
			list.add(i);
		}
		print();
		System.out.println(list.size());
		for(int i = 50; i > 10; i--) {
			list.remove(i);
		}
		System.out.println(list.size());
		print();
	}
	
	public void print() {
		for(Integer e: list) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static void runTests() {
		new HashListTests();
	}

	public static void main(String[] a) {
		runTests();
	}

}
