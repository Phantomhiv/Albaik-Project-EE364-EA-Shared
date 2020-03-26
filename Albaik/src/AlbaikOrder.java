package application;
import java.security.SecureRandom;
public class AlbaikOrder
{
	SecureRandom rnd = new SecureRandom();
    AlbaikOrderTime OrderTime = new AlbaikOrderTime();// object from AlbaikOrderTime
    AlbaikBranch branch = new AlbaikBranch();// to get the order type and order tag

    private int time;
    //constructor
    public AlbaikOrder(AlbaikBranch x)
    {
    	genOrder();
    	branch.orderTag();
    	onlinePrinter(x);
    }
    public AlbaikOrder()
    {
    	genOrder();
    	branch.orderTag();
    }
    public void generateOrder()
    {
    	time = rnd.nextInt(600)+60;
    }
    public int genOrder()
    {
    	time = rnd.nextInt(600)+60;
    	return time;
    }

    public int getTime()
    {
    	return time;
    }
    public String onlinePrinter(AlbaikBranch x)
    {
    	if(x instanceof CanReceiveOnlineOnlineOrder)
    	{
    		return String.format("Regular Branch");
    	}
    	else
    	{
    		return String.format(" Online Branch");
    	}
    }
    public String toString()
    {
        return String.format("%s%nOrder tag: %f%nOrder type: Not Online%n%n",OrderTime.toString(),branch.orderTag());//to represent a order time with order tag and order type
    }
}