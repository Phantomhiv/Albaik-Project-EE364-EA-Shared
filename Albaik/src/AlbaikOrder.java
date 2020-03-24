import java.security.SecureRandom;
public class AlbaikOrder
{
	SecureRandom rnd = new SecureRandom();
    AlbaikOrderTime OrderTime = new AlbaikOrderTime();// object from AlbaikOrderTime
    private int time;
    public void generateOrder()
    {
    	time = rnd.nextInt(600)+60;
    }
    public int getTime()
    {
    	return time;
    }
    public String toString()
    {
        return String.format("%s%nOrder tag: %d",OrderTime.toString());//to represent a order time with order tag
    }
}