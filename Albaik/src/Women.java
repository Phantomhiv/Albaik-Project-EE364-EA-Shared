import java.security.SecureRandom;

public class Women extends Customer
{
	SecureRandom rnd = new SecureRandom();
	public int extraTimeMen()
	{
		// ordering time 10-45 S
		int orderingTime= rnd.nextInt(35)+10;
		//payment time 5-15
		int paymentTime= rnd.nextInt(10)+5;

		return orderingTime+paymentTime;
	}
}