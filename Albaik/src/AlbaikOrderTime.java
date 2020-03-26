package application;

public class AlbaikOrderTime
{
	//instance variable
	private long sec;// for seconds
	//constructors
	public AlbaikOrderTime( long sec)
	{
		setSec(sec);
	}
	//with no-argument
	public AlbaikOrderTime()
	{
		this.sec=0;
	}
	//setter
	public void setSec(long sec) // sth has to be done
	{
		this.sec=sec;
	}
	//getter
	public long getSec()
	{
		return sec;
	}
	//to return a representation as 00:00
	public String toString()
	{
		long min= (getSec()/60);//to obtain the value of min
		return String.format("%02d:%02d",min,(getSec()-min*60));// 11:11
	}
}
