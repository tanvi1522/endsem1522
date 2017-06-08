
public class Ac {

	private int temprature;
	private boolean status;

	public Ac(boolean b, int i) {
		// TODO Auto-generated constructor stub
		this.status=b;
		this.temprature=i;
	}
	void acon()
	{
		this.status=true;
		System.out.println("ac is on");
	}
	void acoff()
	{
		this.status=false;
		System.out.println("ac is off");
	}
	void tempratureup()
	{
		if(this.status==true)
		{
		this.temprature=this.temprature+1;
		System.out.println("channel is"+this.temprature);
		}
		else
		{
			System.out.println("ac is off" );
		}
	}

	void tempraturedown()
	{
		if(this.status==true)
		{
		this.temprature=this.temprature-1;
		System.out.println("channel is"+this.temprature);
		}
		else
		{
			System.out.println("ac is off" );
		}
	}
}
