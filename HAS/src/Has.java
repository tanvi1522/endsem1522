
public class Has {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Tv tv1 =new Tv(false,112,20);
	Light l1=new Light(false);
	Ac ac1=new Ac(false,17);
	Washing w1 =new Washing(false);
	Music m1=new Music(false,20);
	Howner o1= new Howner(tv1,l1,ac1,w1,m1);
	o1.tv.tvon();
	o1.tv.tvoff();
	o1.tv.chenneldown();
	o1.tv.chennelup();
	o1.tv.volumedown();
	o1.tv.volumeup();
	
	o1.ac.acon();
	o1.ac.tempraturedown();
	o1.ac.tempratureup();
	o1.ac.acoff();
	o1.washing.washon();
	o1.washing.washoff();
	o1.music.musicon();
	
	o1.music.volumedown();
	o1.music.volumeup();
	o1.music.musicoff();
	o1.light.lighton();
	o1.light.lightoff();
	}

}
