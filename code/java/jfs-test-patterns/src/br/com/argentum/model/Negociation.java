package br.com.argentum.model;

import java.time.LocalDateTime;

public final class Negociation {

	private final double price;
	private final int quantity;
	private final LocalDateTime date;
	
	public Negociation(double price, int quantity, LocalDateTime date) {
		super();
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
