class TV{
	private int size;
	public TV(int size)
	{
		this.size=size;
	}
	protected int getSize() {return size;}
}

class ColorTV extends TV
{
	private int color;
	public ColorTV(int size,int color)
	{
		super(size);
		this.color=color;
	}
	public void  printProperty()
	{
		System.out.println(super.getSize()+"��ġ "+color+"�÷�");
	}
	
	
}

class IPTV extends ColorTV
{
	private String ip;
	public IPTV(String ip,int size,int color)
	{
		super(size,color);
		this.ip=ip;
	}
	public void printProperty()
	{
		System.out.print("���� IPTV�� "+ip+"�ּ��� ");
		super.printProperty();	
	}
	
}
public class KHYExercise1{

	public static void main(String[] args) {
		ColorTV myTV=new ColorTV(32,1024);
		myTV.printProperty();		
		
		/*IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();*/
	}
}