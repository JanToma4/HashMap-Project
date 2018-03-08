/**
 * Jan Toma
 * CS310 Section 2
 */
package dns_resolver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import data_structures.Hash;
import data_structures.HashI;
import exceptions.FileFormatException;


/**
 * The LoadInternetAddresses class should take a filename as a string, uses BufferedReader
 * to read the file, split the lines into URLs and IPAddresses, and create the appropriate
 * objects. It should add those objects to a hash, and finally, after reading the whole file
 * it should return the instance of the hash.
 * 
 * If there is an error with the file format, you should throw a new FileFormatException error
 * with an appropriate message.
 *  
 * @author Jan Toma CS310
 *
 */
public class LoadInternetAddresses {
	Hash<URL, IPAddress> hash;

	public LoadInternetAddresses() {
		hash = new Hash<URL, IPAddress>(100);
	}

	public HashI<URL, IPAddress> load_addresses(String filename) throws FileFormatException {
		BufferedReader br = null;
		String line;
		try {
			br = new BufferedReader(new FileReader(filename));

		} catch (FileNotFoundException e) {
			System.err.println("Error: File Not Found");
			e.printStackTrace();
			System.exit(1);
		}
		try{
			while((line = br.readLine()) != null) {
				String [] temp = line.split("\t");
				if(temp.length != 2) {
					throw new FileFormatException ("Error: There is something wrong with the file");
				}
				IPAddress ip = new IPAddress(temp[0]);
				URL u = new URL(temp[1]);
				hash.add(u, ip);
			}
		}
		catch(IOException e){

		}
		return hash;
	}

}
