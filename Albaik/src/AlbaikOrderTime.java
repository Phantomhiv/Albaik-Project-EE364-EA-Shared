public class AlbaikOrderTime
{
	//instance variable
	private int sec;// for seconds
	//constructors
	public AlbaikOrderTime( int sec)
	{
		setSec(sec);
	}
	//with no-argument
	public AlbaikOrderTime()
	{
		this.sec=0;
	}
	//setter
	public void setSec(int sec) // sth has to be done
	{
		this.sec=sec;
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
		return String.format("%02d:%02d",min,(getSec()-min*60));// 11:11
	}
}
