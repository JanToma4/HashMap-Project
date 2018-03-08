/**
 * Jan Toma
 * CS310 Section 2
 */
package tests;

import dns_resolver.IPAddress;
import dns_resolver.URL;

public class IPAddressTest {
	
	IPAddress ip = new IPAddress("130.191.35.234");
	URL u = new URL("alv6475-1-mac32.sdsu.edu");

	public IPAddressTest() {
		System.out.println("Testing URL Now:");
		System.out.println(u.equals("lif-sci-s1-mac24.sdsu.edu"));
		System.out.println(u.hashCode());
		System.out.println(u.toString());
		System.out.println(u.compareTo(u));
		System.out.println("\n\n\nTesting Ip Address Now:");
		System.out.println(ip.equals("130.191.23.12"));
		System.out.println(ip.hashCode());
		System.out.println(ip.toString());
		
	}
	
	public static void runTests() {
		new IPAddressTest();
	}

	public static void main(String[] a) {
		runTests();
	}

}
