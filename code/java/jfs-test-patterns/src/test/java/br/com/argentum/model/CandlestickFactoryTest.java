package br.com.argentum.model;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class CandlestickFactoryTest {

	@Test
	public void simpleNegociationSequence() {
		
		LocalDateTime now = LocalDateTime.now();
		
		Negociation n1 = new Negociation(40.0, 100, now);
		Negociation n2 = new Negociation(35.0, 100, now);
		Negociation n3 = new Negociation(45.0, 100, now);
		Negociation n4 = new Negociation(20.0, 100, now);
		
		List<Negociation> negociations = Arrays.asList(n1,n2,n3,n4);
		
		CandlestickFactory candlestickFactory = new CandlestickFactory();
		Candlestick candlestick = candlestickFactory.candlestickDateGenerator(negociations, now);
		
		Assert.assertEquals(20.0, candlestick.getMin(),0.000001);
		Assert.assertEquals(45.0, candlestick.getMax(),0.000001);
		Assert.assertEquals(40.0, candlestick.getOpenValue(),0.000001);
		Assert.assertEquals(20.0, candlestick.getCloseValue(),0.000001);
		Assert.assertEquals(14000, candlestick.getVolume(),0.000001);
	}
	
	@Test
	public void generateCandletickWithSingleNegociation()
	{
		LocalDateTime now = LocalDateTime.now();
		Negociation negotiation = new Negociation(40.0, 100, now);
		
		List<Negociation> negociations = Arrays.asList(negotiation);
		
		CandlestickFactory candlestickFactory = new CandlestickFactory();
		
		Candlestick candlestick = candlestickFactory.candlestickDateGenerator(negociations, now);
		
		Assert.assertEquals(40.0, candlestick.getMin(),0.000001);
		Assert.assertEquals(40.0, candlestick.getMax(),0.000001);
		Assert.assertEquals(40.0, candlestick.getOpenValue(),0.000001);
		Assert.assertEquals(40.0, candlestick.getCloseValue(),0.000001);
		Assert.assertEquals(4000, candlestick.getVolume(),0.000001);
		
	}
	
	@Test
	public void generateCandletickWithoutNegociation()
	{
		LocalDateTime now = LocalDateTime.now();
		
		List<Negociation> negociations = new ArrayList<>();
		
		CandlestickFactory candlestickFactory = new CandlestickFactory();
		
		Candlestick candlestick = candlestickFactory.candlestickDateGenerator(negociations, now);
		
		Assert.assertEquals(0.0, candlestick.getMin(),0.000001);
		Assert.assertEquals(0.0, candlestick.getMax(),0.000001);
		Assert.assertEquals(0.0, candlestick.getOpenValue(),0.000001);
		Assert.assertEquals(0.0, candlestick.getCloseValue(),0.000001);
		Assert.assertEquals(0, candlestick.getVolume(),0.000001);
		
	}

}
