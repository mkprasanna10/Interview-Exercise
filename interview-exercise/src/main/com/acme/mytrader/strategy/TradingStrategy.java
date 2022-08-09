package main.com.acme.mytrader.strategy;

import main.com.acme.mytrader.price.PriceListener;

public class TradingStrategy implements PriceListener {

	@Override
	public void PriceUpdate(String security, double price)
	{	
		try
		{
			if(security==null)
				throw new NullPointerException();
			// TODO Auto-generated method stub
			System.out.println("Inside Price Update Method");
			System.out.println("Printing the Value of Security---->"+security);
			System.out.println("Double Price value ---->"+price);	
		}
		catch(NullPointerException exp)
		{
			exp.printStackTrace();
		}
	}
		
}

	

