package pack1;

import login.loginclass;

public class AccessModifier {

	
	public static void main(String[] args) 
	{
		//get login pack.loginclass var
		//loginclass l=loginclass();//Care ::: errro no new opeartie
		loginclass l=new loginclass();// public class , we cna use in other package
		// note:: if loginclass is non public , we cant create use  in other package
		System.out.println("l.publicvar="+l.publicvar);
		l.publicvar="publ var val chnaged";
		System.out.println("l.publicvar="+l.publicvar);
		
		//System.out.println("l.privateva="+l.privatevar);//not visible
		//l.privatevar="Prv chnage";// cant acees priavte var in other class of other pack
		//priavtevar cannot be resolved or is not a field
		//System.out.println("l.privateva="+l.privatevar);
		
		//System.out.println("l.defStrvar="+l.defStrvar);//not visible
		//l.defStrvar="def changed";// error def var  of other pack can't be accessed  in  other  package
		//System.out.println("l.defStrvar="+l.defStrvar);
		
		//l.protectvar="protchnage";// error not visible 
		//System.out.println("l.protectvarr="+l.protectvar);
		
	}

}
