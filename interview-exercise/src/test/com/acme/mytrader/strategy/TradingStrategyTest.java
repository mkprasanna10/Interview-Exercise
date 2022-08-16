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
    public void testPriceUpdatePositive()
	{					
		String Message = "Test the value";	//Given
		Double price = 100.0;	
		strategy.PriceUpdate(Message, price); //When
		assertNotNull(Message);//Then
	}

	@Test(expected = NullPointerException.class)		
    public void testPriceUpdateNegative() throws Exception
	{
		String Message = null; //Given
		Double price = 100.0; 
		
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("Null Pointer Exception Message Expected");

		strategy.PriceUpdate(Message, price); //When
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDoublePriceUpdate()
	{
		String Message = "Test the value";	//Given
		Double price = -100.0;	
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Negative Values are Not Accepted for Price Value");

		strategy.PriceUpdate(Message, price); //When
	}
	
}
