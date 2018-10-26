package br.com.argentum.model;

import java.time.LocalDateTime;

/**
 * 
 * @author mario
 *
 */
public final class Negociation {

	private final double price;
	private final int quantity;
	private final LocalDateTime date;
	
	public Negociation(double price, int quantity, LocalDateTime date) {
		super();
		if(price<0)
		{
			throw new IllegalArgumentException("The price cannot be less than zero");
		}
		
		if(date ==null)
		{
			throw new IllegalArgumentException("The date cannot be null");
		}
		
		if(quantity < 0)
		{
			throw new IllegalArgumentException("The quantity cannot be less than zero");
		}
		this.price = price;
		this.quantity = quantity;
		this.date = date;
	}
	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public LocalDateTime getDate() {
		return date;
	}

	
	
	public double getVolume()
	{
		return this.getPrice() * this.getQuantity();
	}

}
