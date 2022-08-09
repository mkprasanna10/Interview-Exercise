package main.com.acme.mytrader.price;

public interface PriceListener {

	void PriceUpdate(String security,double price);
	
}
