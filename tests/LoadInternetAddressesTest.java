/**
 * Jan Toma
 * CS310 Section 2
 */
package tests;

import java.io.IOException;

import dns_resolver.LoadInternetAddresses;
import exceptions.FileFormatException;

public class LoadInternetAddressesTest {
	LoadInternetAddresses lia = new LoadInternetAddresses();
	
	public LoadInternetAddressesTest() throws FileFormatException {
		lia.load_addresses("src/data/ips_small.txt");
	}
	
	public static void runTests() throws FileFormatException {
		new LoadInternetAddressesTest();
	}

	public static void main(String[] a) throws FileFormatException {
		runTests();
	}

}
