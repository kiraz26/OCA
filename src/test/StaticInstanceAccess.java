package test;

public class StaticInstanceAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticInstanceAccess st = new StaticInstanceAccess();
		st.add1(); // we need an object
		addStatic(); // we don't need an object
		st.add2(); // we need an object
		
		StaticInstanceAccess st2 = null;
		//st2.add1(); //java.lang.NullPointerException
	}

	// an instance method can call another instance method
	// an instance method can call a static method in same class
	// a static method can not call instance method in same class
	//a static method can call another static method in same class
	
	int add1() {
		add2(); // or this.add2(); we can call
		System.out.println("fake add");
		return 0;
	}

	int add2() {
		System.out.println("fake add");
		return 0;
	}

	static int addStatic() {
		System.out.println("fake add static");
		return 0;
	}

}
