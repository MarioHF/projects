package br.com.argentum.model;

import java.time.LocalDateTime;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 
 * @author mario
 *
 *         Testing the @Candlestick class
 */
public class CandlestickTest {

	
	/**
	 * @author mario
	 * 
	 * Check if the min value is higher than max value
	 */
	@Test(expected = IllegalArgumentException.class)
	public void minValueCannotBeLessThanMax()
	{
		CandleBuilder builder = new CandleBuilder();
		Candlestick candlestick = builder
									.withOpenValue(10.0)
									.withCloseValue(20.0)
									.withMaxValue(100.0)
									.withMinValue(1000.0)
									.withVolume(100)
									.withDate(LocalDateTime.now())
									.build();
	}
	
	/**
	 * 
	 * @author mario
	 * 
	 * Check if the Candlestick is high when the close value is higher or equals to open value
	 */
	@Test
	public void isHighIfCloseValueIsEqualsToOpenValue()
	{
		CandleBuilder builder = new CandleBuilder();
		Candlestick candlestick = builder
									.withOpenValue(10.0)
									.withCloseValue(10.0)
									.withMaxValue(100.0)
									.withMinValue(100.0)
									.withVolume(100)
									.withDate(LocalDateTime.now())
									.build();
		
		assertTrue(candlestick.isHigh());
		
	}
	
	/**
	 * @author mario
	 * 
	 * Check if the open value is less than zero
	 */
	@Test(expected = IllegalArgumentException.class)
	public void openValueCannotBeLessThanZero()
	{
		CandleBuilder builder = new CandleBuilder();
		Candlestick candlestick = builder
									.withOpenValue(-10.0)
									.withCloseValue(20.0)
									.withMaxValue(1000.0)
									.withMinValue(100.0)
									.withVolume(100)
									.withDate(LocalDateTime.now())
									.build();
	}
	
	/**
	 * @author mario
	 * 
	 * Check if the close value is less than zero
	 */
	@Test(expected = IllegalArgumentException.class)
	public void closeValueCannotBeLessThanZero()
	{
		CandleBuilder builder = new CandleBuilder();
		Candlestick candlestick = builder
									.withOpenValue(10.0)
									.withCloseValue(-20.0)
									.withMaxValue(1000.0)
									.withMinValue(100.0)
									.withVolume(100)
									.withDate(LocalDateTime.now())
									.build();
	}
	
	/**
	 * @author mario
	 * 
	 * Check if the max value is less than zero
	 */
	@Test(expected = IllegalArgumentException.class)
	public void maxValueCannotBeLessThanZero()
	{
		CandleBuilder builder = new CandleBuilder();
		Candlestick candlestick = builder
									.withOpenValue(10.0)
									.withCloseValue(20.0)
									.withMaxValue(-1000.0)
									.withMinValue(100.0)
									.withVolume(100)
									.withDate(LocalDateTime.now())
									.build();
	}
	
	/**
	 * @author mario
	 * 
	 * Check if the min value is less than zero
	 */
	@Test(expected = IllegalArgumentException.class)
	public void minValueCannotBeLessThanZero()
	{
		CandleBuilder builder = new CandleBuilder();
		Candlestick candlestick = builder
									.withOpenValue(10.0)
									.withCloseValue(20.0)
									.withMaxValue(1000.0)
									.withMinValue(-100.0)
									.withVolume(100)
									.withDate(LocalDateTime.now())
									.build();
	}
	
	
	/**
	 * @author mario
	 * 
	 * Check if the volume is less than zero
	 */
	@Test(expected = IllegalArgumentException.class)
	public void volumeValueCannotBeLessThanZero()
	{
		CandleBuilder builder = new CandleBuilder();
		Candlestick candlestick = builder
									.withOpenValue(10.0)
									.withCloseValue(20.0)
									.withMaxValue(1000.0)
									.withMinValue(100.0)
									.withVolume(-100)
									.withDate(LocalDateTime.now())
									.build();
	}
	
	/**
	 * @author mario
	 * 
	 * Check if the date is null
	 */
	@Test(expected = IllegalArgumentException.class)
	public void dateCannotBeNull()
	{
		CandleBuilder builder = new CandleBuilder();
		Candlestick candlestick = builder
									.withOpenValue(10.0)
									.withCloseValue(20.0)
									.withMaxValue(1000.0)
									.withMinValue(100.0)
									.withVolume(100)
									.withDate(null)
									.build();
	}

}
