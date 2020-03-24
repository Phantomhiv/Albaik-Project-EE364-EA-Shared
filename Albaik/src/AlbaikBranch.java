import java.util.ArrayList;

public class AlbaikBranch
{
	// update latency then use this variable
	AlbaikOrderTime OrderLatency = new AlbaikOrderTime();//is one element of OrdersTime Array

	 ArrayList<AlbaikOrder>Orders = new ArrayList<AlbaikOrder>();//to be like [order 1,order 2,...] and so on
	public ArrayList<AlbaikOrder> addArrayList(AlbaikOrder x)//No need for this method
	{
	        Orders.add(x);
	        return Orders;
	}
	int OrderTag=1;

    public  void AlbaikOrder()
    {
        OrderTag++;
    }
	public ArrayList<AlbaikOrder> subArrayList(AlbaikOrder x)//No need for this method
	{
	        Orders.remove(0);
	        return Orders;
	}
	////////////
	public int sumOfArray(AlbaikBranch x)
	{
		int time=0;
		int total=0;
		 for(int i=0;i<Orders.size();i++)
		 {
			 time= Orders.get(i).getTime();
			 total= total+ time;
		 }
		 return total;
	}

	public int UpdateLatency(AlbaikBranch x)// to update the waiting time in the branch
	{

		int latency = (int) (sumOfArray(x)/Cashier.getSpeed()+Men_Queue.size()+Women_Queue.size());// extra time* the number in the queue
		return latency;
	}
	//Walk-in Queue
	ArrayList<Walk_In>Men_Queue= new ArrayList<Walk_In>();// to generate as many as object and add them
	public ArrayList<Walk_In> addWomen(Walk_In x)//No need for this method
    {
		Men_Queue.add(x);
        return Men_Queue;
    }
	public ArrayList<Walk_In> subWomen(Walk_In x)//No need for this method
    {
		Men_Queue.remove(0);
        return Men_Queue;
    }
	ArrayList<Women> Women_Queue = new ArrayList<Women>();// to generate as many as object and add them10
	public ArrayList<Women> addWomen(Women x)//No need for this method
    {
		Women_Queue.add(x);
        return Women_Queue;
    }
	public ArrayList<Women> subWomen(Women x)//No need for this method
    {
		Women_Queue.remove(0);
        return Women_Queue;
    }
	//cashier
	AlbaikCashier Cashier= new AlbaikCashier();// create an object here
	//for online orders
	ArrayList<AlbaikOrder>OnlineOrderReady = new ArrayList<AlbaikOrder>();//????????????????

	// order history
	String OrderHistory;// for placing orders : could be a method

	/////////////////////////
	public void generateCustomers()// HOW????
	{
		////////////////////
	}
	// doing the process
	public void Do_process(AlbaikOrder x)
	{
		addArrayList(x);
		OrderLatency.setSec(OrderLatency.getSec()-60);
		//checking order ready
		if(OrderCheck(x)==true)// deletes the completed order from the array list
		{
			subArrayList(x);
		}
	}
	//create a method for cashier speed, somehow related to orders or days
	public boolean OrderCheck(AlbaikOrder x)
	{
		if(x.OrderTime.getSec()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
