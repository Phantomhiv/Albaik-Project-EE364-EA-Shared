package application;

import java.util.ArrayList;
import java.util.Random;

public class AlbaikBranchWithOnline extends AlbaikBranch implements CanReceiveOnlineOnlineOrder
{
	Random gen = new Random();
	//for online order
	ArrayList<AlbaikOrder>OnlineOrderReady = new ArrayList<AlbaikOrder>();
	public void genOnlineOrder()
	{
		int work=0 ;
		int num;
		if (work%60== 0)
		 {
				num = gen.nextInt(5)+1;
				for (int count=0;count<=num;count++)
				{
					OnlineOrderReady.add(new AlbaikOrder());
				}
		 }
	}
    public void onlineCheck()
    {
    	System.out.print("Albaik Branch with Online");
    }

}