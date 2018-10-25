package br.com.argentum.model;

import java.time.LocalDateTime;

public final class Candlestick {
	
	private final double openValue;
	private final double closeValue;
	private final double max;
	private final double min;
	private final double volume;
	private final LocalDateTime date;
	
	public Candlestick(double openValue, double closeValue, double max, double min, double volume, LocalDateTime date) {
		super();
		this.openValue = openValue;
		this.closeValue = closeValue;
		this.max = max;
		this.min = min;
		this.volume = volume;
		this.date = date;
	}
	
	public double getOpenValue() {
		return openValue;
	}
	public double getCloseValue() {
		return closeValue;
	}
	public double getMax() {
		return max;
	}
	public double getMin() {
		return min;
	}
	public double getVolume() {
		return volume;
	}
	public LocalDateTime getDate() {
		return date;
	}
	
	public boolean isHigh()
	{
		return this.closeValue > this.openValue;
	}
	
	public boolean isDown()
	{
		return this.closeValue < this.openValue;
	}
	
	

}
