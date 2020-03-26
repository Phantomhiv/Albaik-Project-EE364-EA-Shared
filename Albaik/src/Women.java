package application;
import java.security.SecureRandom;

public class Women extends Customer
{
	AlbaikOrder order = new AlbaikOrder();
	SecureRandom rnd = new SecureRandom();
	public Women()
	{
		totalTimeWomen();
	}
	public int totalTimeWomen()
	{
		// ordering time 10-45 S
		int orderingTime= rnd.nextInt(90)+10;
		//payment time 5-15
		int paymentTime= rnd.nextInt(30)+5;


		return orderingTime+paymentTime+order.genOrder();
	}
	public String toString()
	{
		order.OrderTime.setSec(totalTimeWomen());
		return String.format("Time is: %s%nType: %s%n",order.toString(),getClass());
	}
}