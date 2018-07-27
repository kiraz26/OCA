package test;

public class NestedMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test book: chapter 6  question 4
		//System.out.println(add1()); // it is not compile
		
		
	}

	 static void add1() {
		 
		 System.out.println("add 1 no arg");
	}
	 //recursion 
	 static void add1(int i) {
		 add1(9);
		 System.out.println("add 1 1 arg");
	 }
}
