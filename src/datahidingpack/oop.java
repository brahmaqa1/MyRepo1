package datahidingpack;

class datahiding
{

		  private int  pra=	99;
		  
		  public void getDM()
		  {
			  System.out.println("pra var through method="+pra);
		  }
}

//**********************
public class oop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datahiding dh=new datahiding();
		//System.out.println("val="+dh);// eompile error shoul
		//val=datahidingpack.datahiding@3590ed52
		dh.getDM();// ??? we shoul get data 
		

	}

}
