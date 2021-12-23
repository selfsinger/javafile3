package com.xworkz.movieshyb;

public class Main extends Best{//subclass4
	
	void disp()
	{
		movieName="Aptharakshaka"; hero="vishnuvardhana"; heroin="soundarya"; villan="nagavalli";
		System.out.println("If the actors stories are good,then we can see the best in the movies like below movie,my ever favone ");
		System.out.println("Name of the movie is:"+movieName+ "\n Hero:"+hero+ "\n heroin:"+heroin+ "\n villan:"+villan );
	}
	
     public static void main(String args[])
     {
    	 Main m=new Main();
    	 Worst w=new Worst();
    	 Action a=new Action();
    	 m.kinds();
    	 m.good();
    	 w.notgood();
    	 a.fights();
    	 m.disp();
     }
}
