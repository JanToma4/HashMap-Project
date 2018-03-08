/**
 * Jan Toma
 * CS310 Section 2
 */
package tests;

import data_structures.Hash;

public class HashTests {
	
	int size = 100;
	Hash<Integer, Integer> hash = new Hash<Integer, Integer>(size);

	public HashTests() {

		for(int i = 1; i <= 20; i++) {
			hash.add(i, i*2);
		}
		hash.add(1, 5);
		//hash.add(1, 23222);
		hash.remove(1);
		hash.changeValue(21, 32223);
		hash.changeValue(15, 50);
		size = hash.size();
		for(int i = 1; i <= size; i++) {
			System.out.print(hash.getValue(i) + " ");
		}
		System.out.println("\nprinting *************");
		print();
		System.out.println("\nSize: " + hash.size());	
		System.out.println("Making empty now!!!!");
		hash.makeEmpty();
		System.out.println("Size: " + hash.size());
		
		
//		System.out.println("\n\n\n\nChecking all the methods in HASH");
//		Hash<Integer, Integer> hash2 = new Hash<Integer, Integer>(10);
//		
//		System.out.println("ADDING VALUE(50) TO KEY(1), EXPECTING TRUE:  " + hash2.add(1, 50));
//		System.out.println("ADDING VALUE(100) TO KEY(2), EXPECTING TRUE:  " + hash2.add(2, 100));
//		System.out.println("REMOVING VALUE(100) FROM KEY(2), EXPECTING TRUE:  " + hash2.remove(2));
//		System.out.println("REMOVING VALUE FROM UNUSED KEY, EXPECTING FALSE:  " + hash2.remove(3));
//		System.out.println("CHANGING VALUE OF KEY(1) TO VALUE(25), EXPECTING TRUE:  " + hash2.changeValue(1, 25));
//		System.out.println("CHECKING IF THE ARRAY CONTAINS KEY(1), EXPECTING TRUE:  " + hash2.contains(1));
//		System.out.println("CHECKING IF THE ARRAY CONTAINS KEY(2), EXPECTING FALSE:  " + hash2.contains(2));
//		System.out.println("GETTING THE VALUE(25) FROM KEY(1), EXPECTING 25:  " + hash2.getValue(1));
//		System.out.println("GETTING NULL FROM KEY(2), EXPECTING NULL:  " + hash2.getValue(2));
//		System.out.println("GETTING SIZE, EXPECTING 1:  " + hash2.size());
//		System.out.println("CHECKING IF EMPTY, EXPECTING FALSE:  " + hash2.isEmpty());
//		System.out.println("Making Empty Now!!!");   hash2.makeEmpty();
//		System.out.println("CHECKING IF EMPTY, EXPECTING TRUE:  " + hash2.isEmpty());
//		hash2.add(1, 50);
//		System.out.println("CHECKING LOADFACTOR, EXPECTING 0.1:  " + hash2.loadFactor());
//		System.out.println("GETTING MAXLOADFACTOR, EXPECTING 0.75:  " + hash2.getMaxLoadFactor());
//		System.out.println("SETTING MAXLOADFACTOR TO 0.5!!!  "); 
//		hash2.setMaxLoadFActor(0.50);
//		System.out.println("GETTING MAXLOADFACTOR, EXPECTING 0.5:  " + hash2.getMaxLoadFactor());
		
	}
	
	public void print() {
		for(Integer e: hash) {
			System.out.print(e + ", ");
		}
	}
	
	public static void runTests() {
		new HashTests();
	}

	public static void main(String[] a) {
		runTests();
	}

}
