
public class Washing {

	private boolean status;

	public Washing(boolean b) {
		// TODO Auto-generated constructor stub
		this.status = b;
	}
	void washon()
	{
		this.status=true;
		System.out.println("wash is on");
	}
	void washoff()
	{
		this.status=false;
		System.out.println("wash is off");
	}
}
