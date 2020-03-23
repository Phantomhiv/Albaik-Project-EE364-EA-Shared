package application;

public class AlbaikOrder
{
	AlbaikOrderTime OrderTime = new AlbaikOrderTime();// object from AlbaikOrderTime
	public static int OrderTag=0;//created as static to be shared by all object of this class
	int OT=0;//to store the value of OrderTag every time it's increased
	public AlbaikOrder()// to link the number of objects created with the order tag
	{
		OrderTag++;
		OT = OrderTag;
	}
	public String toString()
	{
		return String.format("%s%nOrder tag: %d",OrderTime.toString(),OT);//to represent a order time with order tag
	}
}
