package test.com.acme.mytrader.strategy;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import main.com.acme.mytrader.strategy.TradingStrategy;

@junit
public class TradingStrategyTest 
{	
	TradingStrategy strategy = new TradingStrategy();
	
	@Test	
    public void testPricePositive()
	{					
		String Message = "Test the value";	//Given
		Double price = 100.0;	
		strategy.PriceUpdate(Message, price); //When
		assertNotNull(Message);//Then
	}

	@Test(expected = Exception.class)		
    public void testPriceNegative()
	{
		String Message = null; //Given
		Double price = 100.0; 
		strategy.PriceUpdate(Message, price); //When
		assertNull(Message);
	}
	
}
