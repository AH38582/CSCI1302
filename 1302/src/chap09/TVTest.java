package chap09;

public class TVTest {

	public static void main(String[] args) {
		TV tv = new TV(4, 4, true);

		tv.channelUp();
		tv.volumeDown();
		tv.turnOn();

		System.out.println("Channel: " + tv.getChannel());
		System.out.println("Volume: " + tv.getVolumeLvl());

	}

}

class TV {
	private boolean on;
	private int channel, volumeLvl;

	public TV() {
		this(1, 100, true);
		System.out.println("Created new TV.");
	}

	public TV(int channel, int volumeLvl, boolean on) {
		System.out.println("Created new TV.");
		setChannel(channel);
		setVolumeLvl(volumeLvl);
		setIsOn(on);
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = (on && channel >= 1 && channel <= 100) ? channel : 1;
	}

	public int getVolumeLvl() {
		return volumeLvl;
	}

	public void setVolumeLvl(int volumeLvl) {
		this.volumeLvl = (on && volumeLvl >= 0 && volumeLvl <= 100) ? volumeLvl : 1;
	}

	public boolean getIsOn() {
		return on;
	}

	public void setIsOn(boolean on) {
		this.on = on;
	}

	public void channelUp() {
		this.channel++;
	}

	public void channelDown() {
		this.channel--;
	}

	public void volumeUp() {
		this.volumeLvl++;
	}

	public void volumeDown() {
		this.volumeLvl--;
	}

	public boolean turnOn() {
		return on = true;
	}

}