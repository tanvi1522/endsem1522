
public class Tv {

	private boolean status;
	private int channel;
	private int volume;

	public Tv(boolean status, int channel, int i) {
		// TODO Auto-generated constructor stub
		this.status=status;
		this.channel=channel;
		this.volume=i;
	}

	void tvon()
	{
		this.status=true;
		System.out.println("Tv is on");
	}
	void tvoff()
	{
		this.status=false;
		System.out.println("Tv is off");
	}
	void chennelup()
	{
		if(this.status==true)
		{
		this.channel=this.channel+1;
		System.out.println("channel is"+this.channel);
		}
		else
		{
			System.out.println("tv is off" );
		}
	}
	void chenneldown()
	{
		if(this.status==true)
		{
		this.channel=this.channel-1;
		System.out.println("channel is"+this.channel);
		}
		else
		{
			System.out.println("tv is off" );
		}
	}
	void volumeup()
	{
		if(this.status==true)
		{
		this.volume=this.volume+1;
		System.out.println("volume is"+this.volume);
		}
		else
		{
			System.out.println("tv is off" );
		}
	}
	void volumedown()
	{
		if(this.status==true)
		{
		this.volume=this.volume-1;
		System.out.println("volume is"+this.volume);
		}
		
		else
		{
			System.out.println("tv is off" );
		}
		
		
		}
	public int getchan()
	{
		return this.channel;
	}
}
