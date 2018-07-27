package test;

public class PassByValueOrReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Chapter 4 Question 16

		// Java is Pass by Value language
		// Pass by value means just taking a copy of
		// value and pass it as argument
		// original value will not be affected

		int i = 5;
		changeNum(i);
		System.out.println("After method call " + i);

	}

	static void changeNum(int x) {
		x = 12;
		System.out.println("Inside method call " + x);
	}

}
