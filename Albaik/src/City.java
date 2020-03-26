package application;
import java.util.ArrayList;
import java.util.Random;

public class City
{
    static //new arrays
	ArrayList<AlbaikBranch> Branches = new ArrayList<AlbaikBranch>();
    static ArrayList<AlbaikBranchWithOnline> onlineBranch = new ArrayList<AlbaikBranchWithOnline>();
    ArrayList<Customer> customer = new ArrayList<Customer>();
    //orders
   	 AlbaikOrder order = new AlbaikOrder();
    //branch
    AlbaikBranch branch = new AlbaikBranch();
    //adding branches to array list
  //public void generateBranches()
  //  { //still in error
  //   Branches.addAll(Branches);
  // }

    //main method
    public static void main ( String[] args )
    {

        //method to count how many minutes in each branch

        //methos to generate customers
    	Random gen = new Random();
		 int work=0;//per min
		 int num;
    	while(work<=720)
    	 {
    			 if (work%60== 0)
    			 {
    					num = gen.nextInt(2)+1;
    					double percentage = gen.nextDouble();
    					if (percentage<=0.5)
    					{
    						for (int count=0;count<=num;count++)
    						{
    							Branches.add(new AlbaikBranch());
    						}
    					}
    					else
    					{
    						onlineBranch.add(new AlbaikBranchWithOnline());}
    			 }
    			 work++;
    			 // take off 60 s from each order time Orders from branch
    	 }
        //method to do the process which is decrising the time every customer order is finished ////branch.do_process(orders);
    	//////////////////
    	for(int i=0;i<Branches.size();i++)
    	{
    		Branches.get(i).genWalkInCustomers();
    		Branches.get(i).genOrders();

    		System.out.println(i);
    	}
		for(int i=0;i<onlineBranch.size();i++)
		{
			Branches.get(i).genWalkInCustomers();
			onlineBranch.get(i).genOnlineCustomers();
			onlineBranch.get(i).genOnlineOrder();
			Branches.get(i).genOrders();
			System.out.println(i);
		}

    }
}
