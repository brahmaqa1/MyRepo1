package login;

public class AccessModifierinLocalPackge {

	private  static String privatestaticlocal="Privte local";
	private String privatenonStaticvarlocal="Private nons static val";
	
	private void  PvtLocalMethod1()
	{
		System.out.println("Calling  local pvt methods");
	}
	
	public static void main(String[] args) {
		
		loginclass l=new loginclass();// public class , we cna use in other package
		// note:: if loginclass is non public , we cant create use  in other package
		System.out.println("l.publicvar="+l.publicvar);
		l.publicvar="publ var val chnaged";
		System.out.println("l.publicvar="+l.publicvar);
		
		System.out.println("calling  public mehods********************************");
		l.loginUser();//press ctrl over method--open declaration
		//ctrl+shft+R-- to search class
		//back to test
		//l.PriavteloginUser();// error The method PriavteloginUser() from the type loginclass is not visible
		
		//pvt method can be called from local by creating obj of lco
		AccessModifierinLocalPackge obj1=new AccessModifierinLocalPackge();
		obj1.PvtLocalMethod1();
		
		//System.out.println("l.privateva="+l.privatevar);// get errror priavte var can't be accessed in other package
		//l.privatevar="Prv chnage";//  The field loginclass.privatevar is not visible
		//cant acees priavte var in other class of other pack
		//System.out.println("l.privateva="+l.privatevar);
		
		
		System.out.println("privtaelocal= accessed in the same class**************");
		System.out.println("privatestaticlocal used in same class="+AccessModifierinLocalPackge.privatestaticlocal);
		
		//System.out.println("privatenonStaticvarlocal="+AccessModifierinLocalPackge.privatenonStaticvarlocal);//care error
		//NON STATic Var cant be used in  static Methods main()
		
		System.out.println("************* defStrvar**************");
		System.out.println("l.defStrvar="+l.defStrvar);
		l.defStrvar="def  var changed";// in current package
		System.out.println("l.defStrvar="+l.defStrvar);
		
		System.out.println("********** protectvar**************");
		System.out.println("l.protectvar="+l.protectvar);
		l.protectvar="protect var chnaged";//  visible 
		System.out.println("l.protectvar="+l.protectvar);
		
		
	}

}
