package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPEchoServer {
	public static final int PORT = 50000;
	public static final int BUFFER_SIZE = 256;
	
	public static void main(String[] args) {
		DatagramSocket socket = null;
		
		try {
			//1. 소켓 생성
			socket = new DatagramSocket(PORT);
			
			while(true) {
				DatagramPacket rcvPacket = new DatagramPacket(new byte[BUFFER_SIZE], BUFFER_SIZE);
				socket.receive(rcvPacket);
				
				
			}
			
		} catch (SocketException e) {
			System.out.println("[UDP Echo Server error:" + e);
		} catch (IOException e) {
			System.out.println("[UDP Echo Server error:" + e);
		} finally {
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		}
	}

}
