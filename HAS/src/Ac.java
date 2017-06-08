
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
}
