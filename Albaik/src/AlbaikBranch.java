package application;

public class AlbaikBranch
{
	AlbaikOrderTime OrderLatency = new AlbaikOrderTime();//is one element of OrdersTime Array

	AlbaikOrderTime[] OrdersTime;//to be like [10:10,6:00,...] and so on

	public AlbaikOrderTime UpdateLatency()//not sure if this right, but it needs some changes
	{
		//should use OrdersTime Array, so you can store each element to OrderLatencey each time
		return OrderLatency;
		// the way to do it is the sum of OrderTimes over the number of customers
		//it determines if the customer stays or goes to another branch
	}
	//in store Queue
	Walk_In [] Man_Walk_In_Queue;
	Women[] Women_Queue;
	//cashier
	AlbaikCashier Cashier;
	//for online orders
	AlbaikOrder [] OnlineOrderReady;
	// order history
	String OrderHistory;
	// doing the process
	/////////////////////////
	public void Do_process(AlbaikOrderTime OrderLatency)
	{
		int Sec = OrderLatency.getSec();
		Sec=-60;

	}




}
