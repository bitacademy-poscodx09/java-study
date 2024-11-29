package chat;

import java.net.Socket;

public class ChatClientThread extends Thread {
	private Socket socket;
	
	public ChatClientThread( Socket socket ) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
	}
}