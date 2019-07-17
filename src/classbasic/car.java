package classbasic;

public class car 
{

	String name;
	int price;
	int wheels;	
	
	static int  statwheel;//why
	
	//Constructor name =calss name
	// car()  // alos ok
	 public   car()  // no retun type (void, int) for constr 
	{
		System.out.println("constr has no args");
	}
	// constr has args
	// public car(String n,int p)  // no retun type for constr  //ok
	public car(String name,int price)// 2 para constr
		{
			System.out.println("constr has 2 args");
			//1
		/*	name=n;
			price=p;*/
			
			//2
			/*name=name;
			price=price;*/
			
			//
			this.name=name;
			this.price=price;
			// note::this refers current obj --so this conains curent obj mathdso and vars				
		}
	
	
	public static void main(String[] args) {
		// 
		/*new car();//creating obj of class  but no reference to obj
		
		new car();
		new car();
		new car().name="Maruthi ";
		
		System.out.println(new car().name);// null  ....create obj with null stored in name // null
		System.out.println(new car().wheels);// 0
*/		
		
		
		//***********************************
			 car c1=new car();// call default  constr
			 c1.name="Maruthi";
			 c1.price=250000;
			 c1.wheels=4;
			 
			 c1.statwheel=5;// bad practise bcoz it shows warning msg ***********
			 //The static field car.statwheel should be accessed in a static way			 
			 // care: but c1 contains wheels ie.   staic stuff????/
			 car c2=new car();
			 c2.name="Swift";
			 c2.price=850000;
			 c2.wheels=5;
			 
			 System.out.println("c1.name=--->"+c1.name);//c1.name=--->Maruthi
			 System.out.println("c2.name=--->"+c2.name);//c2.name=--->Swift
			 
			 //note::: non statc methods should be called from obj only....directly we can't call 
			// start();// error 
			// acceleartor();//error  Cannot make a static reference to the non-static method acceleartor() from the type car
			 c1.start();//  obj.method();
			 c1.acceleartor();
			 
			 c2.start();
			 
		}
	
	public void start()// non stat method
	{
		System.out.println("in start()");
		System.out.println(name+"car starting ");// val of name  var which obj is referred		
	}
	
	public void acceleartor()  // non static method
	{
		System.out.println("in acceleartor()");
		System.out.println(name+"car acceleartor ");
	}	
	
}
