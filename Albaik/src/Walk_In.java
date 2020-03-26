package application;
import java.security.SecureRandom;

public class Walk_In extends Customer
{
	SecureRandom rnd = new SecureRandom();
	AlbaikOrder order = new AlbaikOrder();
	public Walk_In()
	{
		totalTimeMen();
	}
	public int totalTimeMen()
	{
		// ordering time 5-30 S
		int orderingTime= rnd.nextInt(60)+5;
		//payment time 3-10
		int paymentTime= rnd.nextInt(25)+3;

		return orderingTime+paymentTime+order.genOrder();
	}
	public String toString()
	{
		order.OrderTime.setSec(totalTimeMen());
		return String.format(" Time is: %s%nType: %s%n",order.toString(),getClass());
	}
}