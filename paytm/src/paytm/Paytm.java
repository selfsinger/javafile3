package paytm;

public class Paytm {
public Paytm()
{
	this("safe and secure","Net banking ,credit & debit card,paytm wallet","getting insurance from paytmbank , investment or opening bank in paytmbank");
	System.out.println("defualt constructor");
}
public Paytm(String featuers,String transaction,String banking)
{
	this("utitlity bills,mobile & digital tv charge");
	System.out.println("Features of Paytm :" +featuers+ "\n MoneyTransaction done through :" +transaction+ "\n Paytm banking :" +banking);
}
public Paytm(String billpayments)
{
	System.out.println("BillPayments :" +billpayments);
}
}
