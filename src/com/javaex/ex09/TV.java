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

	public void channel(int channel) {
		if(power) {
			
			if (channel > 255) {
				this.channel = 255;
			} else if (channel < 1) {
				this.channel = 1;
			}else {
				this.channel = channel;
			}
		}
		
	}

	public void channel(boolean channel) {
		if(power) {
			if (channel) {
				this.channel++;

			} else {
				this.channel--;
			}
			channel(this.channel);
		}
		
	}

	public void volume(int volume) {
		if(power) {
			
			if(volume > 100) {
				this.volume = 100;
			}else if(volume < 0) {
				this.volume = 0;
			}else {
				this.volume = volume;
			}
		}
		
	
	}

	public void volume(boolean volume) {
		if(power) {
			if (volume) {
				this.volume++;
			} else {
				this.volume--;
			}
			volume(this.volume);
		}
	}

	void status() {

		System.out.println("채널 : " +channel +  "\t불륨 :" + volume + "\t전원 :" + power);;
	}

}
