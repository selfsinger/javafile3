package com.xworkz.instagram;

public class Instagram {

	String userName;
	String pageName;
	String edit;
	boolean block;
	String post;
	String fname="megha",lname="rani";
	
	public Instagram(String userName,String pageName,String edit,boolean block,String post)
	{
		
		this.userName=userName;
		this.pageName=pageName;
		this.edit=edit;
		this.block=block;
		this.post=post;
	}
	public static void main(String args[])
	{
		Instagram insta=new Instagram("sv_megha","meghasv_fc","pictures",false,"Stay Tuned");
		Instagram insta1=new Instagram("sv_megha","meghasv_fc","pictures",false,"Stay Tuned");
		System.out.println(insta);
		System.out.println(insta1);
		System.out.println(insta.userName);
		System.out.println(System.identityHashCode(insta));
		System.out.println(System.identityHashCode(insta1));
		System.out.println("Number of leters are used :"+insta.userName.length());
		System.out.println("Number of leters are used :"+insta.post.length());
		System.out.println("upper case :"+insta.userName.toUpperCase());
		System.out.println("lower case :"+insta.post.toLowerCase());
		System.out.println("index location :"+insta1.pageName.indexOf("fc"));
		System.out.println("name :"+insta.fname.concat(insta.lname));
		


	}
		
		
}
