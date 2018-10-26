package br.com.argentum.model;

import java.time.LocalDateTime;


/**
 * 
 * @author mario
 *
 */
public final class Candlestick {
	
	private final double openValue;
	private final double closeValue;
	private final double maxValue;
	private final double minValue;
	private final double volume;
	private final LocalDateTime date;
	
	public Candlestick(double openValue, double closeValue, double maxValue, double minValue, double volume, LocalDateTime date) {
		super();
		
		if(openValue < 0)
		{
			throw new IllegalArgumentException("Open value cannot be less than zero");
		}
		
		if(closeValue < 0)
		{
			throw new IllegalArgumentException("Close value cannot be less than zero");
		}
		
		if(minValue < 0)
		{
			throw new IllegalArgumentException("Min value cannot be less than zero");
		}
		
		if(maxValue < 0)
		{
			throw new IllegalArgumentException("Max value cannot be less than zero");
		}
		
		if(volume < 0)
		{
			throw new IllegalArgumentException("Volume cannot be less than zero");
		}
		
		if(date == null)
		{
			throw new IllegalArgumentException("Date cannot be null");
		}
		
		if(minValue>maxValue)
		{
			throw new IllegalArgumentException("Min value cannot be higher than max value");
		}
		
		this.openValue = openValue;
		this.closeValue = closeValue;
		this.maxValue = maxValue;
		this.minValue = minValue;
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
		return maxValue;
	}
	public double getMin() {
		return minValue;
	}
	public double getVolume() {
		return volume;
	}
	public LocalDateTime getDate() {
		return date;
	}
	
	public boolean isHigh()
	{
		return this.closeValue >= this.openValue;
	}
	
	public boolean isDown()
	{
		return this.closeValue < this.openValue;
	}
	
	

}
