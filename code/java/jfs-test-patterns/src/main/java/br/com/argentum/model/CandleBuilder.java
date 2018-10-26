package br.com.argentum.model;

import java.time.LocalDateTime;


/**
 * 
 * @author mario
 *
 */
public class CandleBuilder {
	
	private double openValue;
	private double closeValue;
	private double maxValue;
	private double minValue;
	private double volume;
	private LocalDateTime date;
	
	public CandleBuilder withOpenValue(double openValue)
	{
		this.openValue = openValue;
		return this;
	}
	
	public CandleBuilder withCloseValue(double closeValue)
	{
		this.closeValue = closeValue;
		return this;
	}
	
	public CandleBuilder withMaxValue(double max)
	{
		this.maxValue = max;
		return this;
	}
	
	public CandleBuilder withMinValue(double min)
	{
		this.minValue = min;
		return this;
	}
	
	public CandleBuilder withVolume(double volume)
	{
		this.volume = volume;
		return this;
	}
	
	public CandleBuilder withDate(LocalDateTime date)
	{
		this.date = date;
		return this;
	}
	
	public Candlestick build()
	{
		return new Candlestick(openValue, closeValue, maxValue, minValue, volume, date);
	}

}
