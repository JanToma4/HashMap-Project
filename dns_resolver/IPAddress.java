/**
 * Jan Toma
 * CS310 Section 2
 */
package dns_resolver;

/**
 * The IPAddress is using iIPv4 and has dotted-decimal notation, with the network, two subnets, 
 * and host separated by periods. For example, the IP address 130.191.226.146 has 
 * a network of 130, a subnet of 191, the second subnet is 226, and the host address is 146.
 * 
 * Your IPAddress class should accept a string of dotted-decimal IPAddresses in the constructor
 * and separate them into the components. 
 * 
 * @see <a href="https://en.wikipedia.org/wiki/IP_address#IPv4_addresses">Wikipedia IPv4 addresses</a>
 * @author Jan Toma CS310
 *
 */

public class IPAddress {

	int network;
	int subnet;
	int subnet2;
	int host;

	/**
	 * The constructor for the IPAddress class.
	 * 
	 * @param ip the dotted-decimal IP address.
	 */
	public IPAddress(String ip) {
		String data[] = ip.split("\\.");
		try{
			network = Integer.parseInt(data[0]);
			subnet = Integer.parseInt(data[1]);
			subnet2 = Integer.parseInt(data[2]);
			host = Integer.parseInt(data[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("IPAddress: Index out of bounds");
			e.printStackTrace();
			System.exit(1);
		}
	}

	@Override
	public int hashCode() {
		int hashVal=0, hashVal2 = 0;	
		int h1,h2,h3,h4;
		h1 = network; h2 = subnet; h3 = subnet2; h4 = host;

		while(h1 > 0 && h2 > 0){
			hashVal += h1 % 10 ^ h2 % 10;
			hashVal2 += h3 % 10 ^ h4 % 10;
			h1 /= 10; h2 /= 10; h3 /= 10; h4 /= 10;
		}
		
		hashVal += hashVal2;
		int temp = hashVal, temp2 = 0, hv = hashVal;
		while(hv > 0) {
			temp2 = hv;
			temp2 %= 10;
			hv /= 10;
			temp *= temp2;
		}
		hashVal = temp;
		return hashVal;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IPAddress other = (IPAddress) obj;
		if (host != other.host)
			return false;
		if (network != other.network)
			return false;
		if (subnet != other.subnet)
			return false;
		if (subnet2 != other.subnet2)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return network + "." + subnet + "." + subnet2 + "." + host;
	}
}
