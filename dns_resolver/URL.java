/**
 * Jan Toma
 * CS310 Section 2
 */
package dns_resolver;

/**
 * A URL Object is a representation of the URL that we have been giving. 
 * It knows how to compare URLs!
 * 
 * @author Jan Toma CS310
 *
 */
public class URL implements Comparable<URL> {
	String u;
	public URL(String obj) {
		u = obj;
	}
	
	@Override
	public int compareTo(URL obj) {
		return u.compareTo(obj.u);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		URL other = (URL) obj;
		if (u == null) {
			if (other.u != null)
				return false;
		} else if (!u.equals(other.u))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		byte [] b = u.getBytes();
		long hash, part1 = 0, part2 = 0;
		long offset = 1; long hashAdd = 0;
		
		for(int i = 0; i < 3; i++) {
			part1 += (int) b[i] * offset;
			part2 += (int) b[i+3] * offset;
			offset <<= 3;
		}
		hash = part1 + part2;
		for(int i = 0; i < u.length(); i++){
			hashAdd += (b[i]-26);
		}
		hash += hashAdd;
		return (int) hash;
	}
	
	public String toString() {
		return u;
	}
}
