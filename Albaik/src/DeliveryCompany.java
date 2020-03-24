import java.security.SecureRandom;

public class DeliveryCompany extends Customer
{

	SecureRandom rnd = new SecureRandom();
    public int extraOnline()
    {
    	int timeToBranch = rnd.nextInt(15)+5;// time to get to the branch

    	return timeToBranch;
    }
	  // how far is he
	   // high volume affect waiting
}