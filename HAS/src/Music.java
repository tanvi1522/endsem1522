
public class Music {

	private int volume;
	private boolean status;

	public Music(boolean b, int i) {
		// TODO Auto-generated constructor stub
		this.status=b;
		this.volume=i;
	}
	void musicon()
	{
		this.status=true;
		System.out.println("music is on");
	}
	void musicoff()
	{
		this.status=false;
		System.out.println("music is off");
	}
}
