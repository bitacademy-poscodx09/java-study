package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPEchoClient {
	public static final String SERVER_IP = "127.0.0.1";
	
	public static void main(String[] args) {
		Scanner scanner = null;
		DatagramSocket socket = null;
		
		try {
			//1. 스캐너 생성
			scanner = new Scanner(System.in);
			
			//2. 소켓 생성
			socket = new DatagramSocket();
			
			while(true) {
				String message = scanner.nextLine();

				if("quit".equals(message)) {
					break;
				}
				
				byte[] sndData = message.getBytes("UTF-8");
				
				// 3. 보내기
				DatagramPacket sndPacket = new DatagramPacket(
					sndData,
					sndData.length,
					new InetSocketAddress(SERVER_IP, UDPEchoServer.PORT));
				
				socket.send(sndPacket);
				
				// 4. 받기
				DatagramPacket rcvPacket = new DatagramPacket(new byte[UDPEchoServer.BUFFER_SIZE], UDPEchoServer.BUFFER_SIZE);
				socket.receive(rcvPacket);
				
				byte[] rcvData = rcvPacket.getData();
				int offset = rcvPacket.getLength();
				
				message = new String(rcvData, 0, offset, "UTF-8");
				System.out.println("[UDP Echo Client] received:" + message);
			}
			
		} catch (SocketException e) {
			System.out.println("[UDP Echo Client] error:" + e);
		} catch (IOException e) {
			System.out.println("[UDP Echo Client] error:" + e);
		} finally {
			if(scanner != null) {
				scanner.close();
			}
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		}
	}

}
