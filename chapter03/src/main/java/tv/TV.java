package tv;

public class TV {
private int channel;    // 1~255 
	private int volume;     // 1~100
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean on) {
		power = on;
	}
	
	public void channel(boolean up) {
		channel(channel + (up ? 1 : -1));
	}

	public void channel(int channel) {
		if(!power) {
			return;
		}
		
		if(channel <= 0) {
			channel = 255;
		} else if(channel > 255){
			channel = 1;
		}
		
		this.channel = channel;
	}
	
	public void volume(boolean up) {
		volume(volume + (up ? 1 : -1));
	}

	public void volume(int volume) {
		if(!power) {
			return;
		}
		
		if(volume < 0) {
			volume = 100;
		} else if(volume > 100){
			volume = 0;
		}
		
		this.volume = volume;
	}

	public void status() {
		System.out.println(
			"TV[channel=" + channel + ", " +
			"volume=" + volume + ", " +
			"power=" + (power ? "on" : "off") +"]");
	}
}
