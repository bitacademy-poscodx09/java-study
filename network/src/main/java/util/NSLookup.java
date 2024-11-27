package util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookup {

	public static void main(String[] args) {
		try {
			InetAddress[] InetAddresses = InetAddress.getAllByName("www.poscodx.com");
			
			for(InetAddress inetAddress : InetAddresses) {
				System.out.println(inetAddress.getHostAddress());
			}
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		

	}

}
