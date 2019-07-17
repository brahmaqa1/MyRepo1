package thisprograms;

	 
JBT2() {
this("JBT2");
System.out.println("Inside Constructor without parameter");
}
 
JBT2(String str) {
System.out.println("Inside Constructor with String parameter as " + str);
}
 
public static void main(String[] args) {
JBT2 obj = new JBT2();
}
}

