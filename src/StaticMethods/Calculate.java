package StaticMethods;

//Program to get cube of a given number by static method  

class Calculate
{  
				int y=10;
			static int cube(int x)//static  method 
			
			{  
				//1.Care:	The static method can not use non static data member or call non-static method directly
				//System.out.println("non static data memeber="+y);// error:: non static var -should not be used in static method
				
				//2.call non static methods from static?? how to call????????
				//add();//error 
				
				Calculate cobj2=new Calculate();
				cobj2.add();//ok
				//int z=15156;
				//return z;
			   return x*x*x; //8   27  64
			  //System.out.println("HI");//error should not write
			}  
			
			void add()//non static method
			{
				System.out.println("in non statci add ()");
				
			}

			public static void main(String args[])
				{  
				//1.calling static method  -->  classname.staticmethod();
				System.out.println(Calculate.cube(2)); 	//8
				
				//2 calling static method --directly******vimp
				System.out.println(cube(3));//27
				
				//3 calling static method--- **not good practise -- will show warning 
				Calculate cobj=new Calculate();
				System.out.println(cobj.cube(4)); //64
					
				}  
}  
