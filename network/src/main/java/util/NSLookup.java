package util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print(">>");
				String line = scanner.nextLine();
				
				if("exit".equals(line)) {
					break;
				}
				
				InetAddress[] inetAddresses = InetAddress.getAllByName(line);
				for(InetAddress inetAddress : inetAddresses) {
					System.out.println(line + ":" + inetAddress.getHostAddress());
				}
			} catch(UnknownHostException ex) {
				System.out.println("unknown host");
			}
			
		}
		
		scanner.close();
	}

}
