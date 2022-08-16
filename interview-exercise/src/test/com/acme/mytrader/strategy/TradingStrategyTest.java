package test.com.acme.mytrader.strategy;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.com.acme.mytrader.strategy.TradingStrategy;

@junit
public class TradingStrategyTest 
{
	TradingStrategy strategy = new TradingStrategy();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test	
    public void testPricePositive()
	{					
		String Message = "Test the value";	//Given
		Double price = 100.0;	
		strategy.PriceUpdate(Message, price); //When
		assertNotNull(Message);//Then
	}

	@Test(expected = NullPointerException.class)		
    public void testPriceNegative() throws Exception
	{
		String Message = null; //Given
		Double price = 100.0; 
		
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("Null Pointer Exception Message");

		strategy.PriceUpdate(Message, price); //When
	}
	
}
