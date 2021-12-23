package coffeecupshyb;

public class SuperCups extends Black{ //subclass 3
	
	void comfort()
	{
		System.out.println("very comfortable to drink coffee or any other in a cups");
	}
	public static void main(String args[])
	{
		SuperCups cups=new SuperCups();
		Choclate choc=new Choclate();
		cups.drinking();
		cups.sip();
		cups.comfort();
		choc.flavour();
		
		
	}

}
