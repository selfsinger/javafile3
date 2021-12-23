package com.xworkz.moviehier;

public class English extends Movie{//subclass2
	 void lang2()
	 {
		 System.out.println("English movies have the best animation things,which s not in kannada and other languages");
	 }
	 public static void main(String args[])
	 {
		 Kannada kan=new Kannada();
		 English eng=new English();
		 kan.movies();
		 kan.lang();
		 
		 eng.lang2();
	 }

}
