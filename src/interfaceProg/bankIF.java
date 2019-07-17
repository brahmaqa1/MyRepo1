package interfaceProg;

public interface bankIF {
	//interface --no statcis methods
	//cant change value of var
	
	//must assign valu to var
	
	/*int d;// error
	d=45;*/// even if we aissgn val , errro
	
	//cant create obj for interface
	
	//has only method  but no body
	int min_bal=1000;
	
	public void tarnsfer_money();
	public void credit();
	
	public abstract void debit();
	//interface ---– no static methods
	//- note::Illegal modifier for the interface method payrechrge; only public & abstract are 	 permitted
	//public static void  payrechrge();// error
	
	static int max_bal=50000;//but interface --static var
	/// note in interface , all var ---public abstract  static constants  final 
	
	final float pi=3.142f;
	//By default final var and  fun in interface even if we don’t declare..chk for methods

}
