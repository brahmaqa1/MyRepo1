package interfaceProg;
//note1: class implements interface mthods()...but interface does not impleent class
//?????/ interface implements interface 
public class hsbcbank implements bankIF
{
	@Override
	public void tarnsfer_money() {
		// TODO Auto-generated method stub
		System.out.println("hsbc transfer oney");		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc credit oney");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc debit oney");
	}
	
//	//extra methods
	public void recharge() {
		System.out.println("hsbc rechrge mobile");		
	}
	


	
	
}
