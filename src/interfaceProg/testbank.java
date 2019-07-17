package interfaceProg;

public class testbank 
{
	public static void main(String[] args) 
	{
		//bank - interface name
		//note::
		//bankIF b=new bankIF();//  Cannot instantiate the type bankIf
		// note: cannot create obj for interface...new interfacename is not possible...
		bankIF bankinterfaceref=new hsbcbank();
		bankinterfaceref.credit();
		bankinterfaceref.debit();
		bankinterfaceref.tarnsfer_money();
		
		//note: interface can access only interface methods  
		//bankinterfaceref.recharge();// ??????????? why????error //The method recharge() is undefined for the type bankIF
		
		//Interface.interfaceVaraible;
		System.out.println(bankinterfaceref.min_bal);
		//bankinterfaceref.min_bal=500;// cant chnage inteface var val 
		//care: default after compilation all interface var- public static const (final)
		
		//2*******************************
		System.out.println("******class implements all  interface mthods and has its own extra methods ***********");
		hsbcbank x=new hsbcbank();
		x.credit();
		x.debit();
		
		x.recharge();
		
		//What is webdriver??
		//Webdriver is an interface… and it has x no of methods.
		//Firefoxdriver, iedriver ….classes to implement interface methods..
		
	}

}
