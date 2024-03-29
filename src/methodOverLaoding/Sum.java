package methodOverLaoding;

//A class for adding upto 5 numbers
class Sum
{
  int add(int n1, int n2) 
  {
      return n1+n2;
  }
  
/*  void add(int n1, int n2)  // error  - not overloading
  {
      return n1+n2;
  }*/
  
  int add(int n1, int n2, int n3) 
  {
      return n1+n2+n3;
  }
  int add(int n1, int n2, int n3, int n4) 
  {
      return n1+n2+n3+n4;
  }
  int add(int n1, int n2, int n3, int n4, int n5) 
  {
      return n1+n2+n3+n4+n5;
  }
  
  public static void main(String args[])
  {
  	Sum obj = new Sum();
  	System.out.println("Sum of two numbers: "+obj.add(20, 21));
  	System.out.println("Sum of three numbers: "+obj.add(20, 21, 22));
  	System.out.println("Sum of four numbers: "+obj.add(20, 21, 22, 23));
  	System.out.println("Sum of five numbers: "+obj.add(20, 21, 22, 23, 24));
  }
}
