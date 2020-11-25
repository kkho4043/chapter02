package com.javaex.ex09;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public TV() {

	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
		this.power = on;
	}

	public int channel(int channel) {
		this.channel = channel;
		if (channel > 255) {
			this.channel = 255;
		} else if (channel < 1) {
			this.channel = 1;
		}
		
		return this.channel;
	}

	public void channel(boolean channel) {

		if (channel) {
			this.channel++;

		} else {
			this.channel--;
		}
		this.channel = channel(this.channel);
	}

	public int volume(int volume) {
		this.volume = volume;
		if(volume > 100) {
			this.volume = 100;
		}else if(volume < 0) {
			this.volume = 0;
		}
		return this.volume;
	}

	public void volume(boolean volume) {
		if (volume) {
			this.volume++;
		} else {
			this.volume--;
		}
		this.volume = volume(this.volume);
	}

	void status() {

		if (power) {
			System.out.println("TV´Â \"ÄÑÁü\" Ã¤³Î : " + channel + " ºÒ·ý : " + volume);
		} else {
			System.out.println("TV´Â \"²¨Áü\" Ã¤³Î : " + channel + " ºÒ·ý : " + volume);
		}
	}

}
