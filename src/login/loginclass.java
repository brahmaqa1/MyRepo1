package login;

public class loginclass  //public class
//class loginclass // non public class
{
	public String name="Ram";
	public int sno=101;
	
	// all access modiifer
	public String publicvar="publicvarval";
	
	private String privatevar="Priavte val";
	
	String defStrvar="Defstr  var val";
	
	protected String protectvar="Protect var val";
	
	
	public void  loginUser()
	{
		System.out.println("user login");
		PriavteloginUser();
		
	}
	
	
	private void  PriavteloginUser()
	{
		System.out.println("--------->>>>Priavte user login");
	}
		
	
	

}
