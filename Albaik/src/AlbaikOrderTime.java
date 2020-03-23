package application;
import java.util.Scanner;
public class AlbaikOrderTime
{
	//instance variable
	private int sec;// for seconds
	//constructors
	public AlbaikOrderTime( int sec)
	{
		try
		{
		setSec(sec);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
	public AlbaikOrderTime()
	{
		Scanner input= new Scanner(System.in);// to enter seconds, when creating object from this class
		System.out.print("Enter period of time in seconds: ");
		try
		{
			setSec(input.nextInt());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
	//setter
	public void setSec(int sec) throws IllegalArgumentException
	{
		if(sec>=0)
		{
			this.sec=sec;
		}
		else
		{
			throw new IllegalArgumentException("Seconds can't be negative");
		}

	}
	//getter
	public int getSec()
	{
		return sec;
	}
	//to return a representation as 00:00
	public String toString()
	{
		int min= (getSec()/60);//to obtain the value of min
		return String.format("%02d:%02d",min,(getSec()-min*60));
	}
}
