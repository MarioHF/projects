package br.com.argentum.model;

import java.time.LocalDateTime;

import org.junit.Test;


/**
 * 
 * @author mario
 *
 * Testing the negociation class
 *
 */
public class NegociationTest {
	
	/**
	 * Expecting @IllegalArumentException when the price is less than zero
	 */
	@Test(expected = IllegalArgumentException.class)
	public void doNotCreateNegociationWithNegativePrice()
	{
		new Negociation(-20, 10, LocalDateTime.now());	
	}
	
	/**
	 * Expecting @IllegalArumentException when the date is null
	 */
	@Test(expected = IllegalArgumentException.class)
	public void doNotCreateNegociationWithoutDate()
	{
		new Negociation(20, 10, null);	
	}
	
	/**
	 * Expecting @IllegalArumentException when the quantity is less than zero
	 */
	@Test(expected = IllegalArgumentException.class)
	public void doNotCreateNegociationWithNegativeQuantity()
	{
		new Negociation(20, -10, LocalDateTime.now());	
	}

}
