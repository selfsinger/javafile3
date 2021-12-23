package jewellerhier;

public class Design extends Jewels{ //subclass 2
	
	void womens()
	{
		System.out.println("Design of jewel is the first impression to buy and its a most usable thing to the womens");
	}
	public static void main(String args[])
	{
		Carat c=new Carat();
		Design d=new Design();
		c.high();
		c.quality();
		d.womens();
	}

}
