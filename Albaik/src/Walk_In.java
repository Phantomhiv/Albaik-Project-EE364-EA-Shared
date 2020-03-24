
import java.security.SecureRandom;

public class Walk_In extends Customer
{
	SecureRandom rnd = new SecureRandom();
	public int extraTimeMen()
	{
		// ordering time 5-30 S
		int orderingTime= rnd.nextInt(25)+5;
		//payment time 3-10
		int paymentTime= rnd.nextInt(7)+3;

		return orderingTime+paymentTime;
	}
}