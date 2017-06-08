
public class Tv {

	private boolean status;
	private int channel;

	public Tv(boolean status, int channel) {
		// TODO Auto-generated constructor stub
		this.status=status;
		this.channel=channel;
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
}
