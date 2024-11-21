package tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	
	public void status() {
		System.out.println(
			"TV[channe=" + channel +
			", volume=" + volume +
			", power=" + (power ? "on" : "off") + "]");
	}
	
	
	
}
