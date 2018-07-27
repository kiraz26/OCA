package test;

public class ReferenceTypePassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chapter 4 question 17
		
		StringBuilder s1 = new StringBuilder("S1");
		addToStringBuilder(s1);
		System.out.println("after value " + s1.toString());
		StringBuilder s2 = new StringBuilder("S2");
		StringBuilder s3 = work(s1, s2); //s3 = a
		//s1 remain the same "S1"
		//s2 "s2b"

	}

	static void addToStringBuilder(StringBuilder s) {

		s.append("abc");
		System.out.println("inside " + s.toString());
	}

	static StringBuilder work(StringBuilder a, StringBuilder b) {
		a = new StringBuilder("a");
		b = b.append("b");
		return a;
	}

}
