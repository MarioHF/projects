package br.com.argentum.model;

import java.time.LocalDateTime;
import java.util.List;

public class CandlestickFactory {
	
	public Candlestick candlestickDateGenerator(List<Negociation> negociations, LocalDateTime date)
	{
		
		double openValue = negociations.get(0).getPrice();
		double closeValue = negociations.get(negociations.size()-1).getPrice();
		
		double volume = 0;
		double max=negociations.get(0).getPrice();
		double min=negociations.get(0).getPrice();
		
		for(Negociation negociation : negociations)
		{
			volume += negociation.getVolume();
			
			if(negociation.getPrice() > max)
			{
				max = negociation.getPrice();
			}
			else if (negociation.getPrice() < min)
			{
				min = negociation.getPrice();
			}
		}
		
		return new Candlestick(openValue, closeValue, max, min, volume, date);
	}

}
