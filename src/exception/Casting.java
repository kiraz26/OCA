package exception;

public class Casting {

	public static void main(String[] args) {

		// OCA Book Chapter 6 Question 4

		Object obj = new Integer(10);
		Integer in = (Integer) obj;
		System.out.println(in);

		// String str = (String) obj; // ClassCastException: java.lang.Integer cannot be
		// cast to java.lang.String
		// System.out.println(str);

		// Can we cast it to Double
		//Double db = (Double) obj; // ClassCastException: java.lang.Integer cannot be cast to java.lang.Double
		
	
		System.out.println(Casting.doIt());
	}

	// Question 13
	static Exception doIt()  {
		Exception e = new Exception("Hahahah");
	
		return e; 
	}

	static String doIt2() throws Exception {
		String e = new String();
	
		return e; 
	}
}
