package application;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class AlbaikBranch
{
	// update latency then use this variable
	AlbaikOrderTime OrderLatency = new AlbaikOrderTime();//is one element of OrdersTime Array
	//cashier
	AlbaikCashier Cashier= new AlbaikCashier();// create an object here
	Random ran= new Random();
	//AlbaikBranch branch = new AlbaikBranch();
	/////////////////////////
	//constructor
	public AlbaikBranch()//BIG ISSUE HERE
	{
		//updateLatency();
		//genOrders();
		//generateCustomers();
		//toString();
	}
	 ArrayList<AlbaikOrder>Orders = new ArrayList<AlbaikOrder>();//to be like [order 1,order 2,...] and so on
	int OrderTag=0;
	public void genOrders()
	{
		 int work=0 ;//per min
		 int num;
    	 while(work<=720)
    	 {
    			 if (work%30== 0)
    			 {

    				 num = ran.nextInt(5)+1;
    				 for (int count=0;count<=num;count++)
    				 {
    					 Orders.add(new AlbaikOrder());
    				 }
    			 }
    			 work++;
    			 // take off 60 s from each order time Orders from branch
    	 }

	}
    public  int orderTag()// to be stored in AlbaikOrder class
    {
        OrderTag++;
        return OrderTag;
    }
	public ArrayList<AlbaikOrder> subArrayList(AlbaikOrder x)//No need for this method
	{
	        Orders.remove(0);
	        return Orders;
	}
	public int sumOfOrders()

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

	//Walk-in Queue
	Queue<Walk_In>Men_Queue= new LinkedList<Walk_In>();// to generate as many as object and add them
	public Queue<Walk_In> subWomen(Walk_In x)//No need for this method
    {
		Men_Queue.remove();
        return Men_Queue;
    }
	Queue<Women> Women_Queue = new LinkedList<Women>();// to generate as many as object and add them10
	public Queue<Women> subWomen(Women x)//No need for this method
    {
		Women_Queue.remove();
        return Women_Queue;
    }
	//Online array list
	Queue<OnlineCustomer> Online_Queue = new LinkedList<OnlineCustomer>();
	Queue<DeliveryCompany> Delivery_Queue = new LinkedList<DeliveryCompany>();
	// order history
	String OrderHistory;// for placing orders : could be a method

	/////////////////////////
	public void genWalkInCustomers()// work is for while loop on city class
	{
		int work=0;//per min
		int num;
		while(work<=720)
		{
			num = ran.nextInt(2)+1;
			double percentage = ran.nextDouble();
			if (percentage<=0.3)
			{
				for (int count=0;count<=num;count++)
				{
					Women_Queue.add(new Women());
				}
			}
			else
			{
				Men_Queue.add(new Walk_In());
			}
			 work++;
			 // take off 60 s from each order time Orders from branch
		}
	}
	public void genOnlineCustomers()// work is for while loop on city class
	{
		int work=0;//per min
		int num;
		while(work<=720)
		{
			num = ran.nextInt(2)+1;
			double percentage = ran.nextDouble();
			if (percentage<=0.5)
			{
				for (int count=0;count<=num;count++)
				{
					Online_Queue.add(new OnlineCustomer());
				}
			}
			else
			{
				Delivery_Queue.add(new DeliveryCompany());
			}
			 work++;
			 // take off 60 s from each order time Orders from branch
		}
	}
	// doing the process
	public void do_process(AlbaikOrder x)
	{
		OrderLatency.setSec(OrderLatency.getSec()-60);
		//checking order ready
		if(orderCheck(x)==true)// deletes the completed order from the array list
		{
			subArrayList(x);
		}
	}
	//create a method for cashier speed, somehow related to orders or days
	public boolean orderCheck(AlbaikOrder x)
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
	public int updateLatencyMen()// to update the waiting time in the branch
	{

		int latency = (int) (sumOfOrders()/(Cashier.getSpeed()+Men_Queue.size()));// extra time* the number in the queue
		Cashier.increase();
		return latency;
	}
	public int updateLatencyWomen()// to update the waiting time in the branch
	{

		int latency = (int) (sumOfOrders()/(Cashier.getSpeed()+Women_Queue.size()));// extra time* the number in the queue
		return latency;
	}
	public String tostring()
	{
		int min = (int) (updateLatencyMen()/60);
		return String.format("%norder tag: %d%nLatency: %02d:%02d%n",orderTag(),min,updateLatencyMen()-min*60);
	}
}
