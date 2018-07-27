package test;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnNumber(7);
		System.out.println(returnNumber(7));
	}

	static int returnNumber(int i) {
		// if(i>6) does not compile

		return i;
		// return i; but if we write a return; out of the condition or else with return;
		// it will compile
	}

}
