package day10;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DangerZone {

	public static void main(String[] args) {
		// Test Book Chapter 7 Question 12
		
		DangerZone d = new DangerZone();
		
		// try {
		// System.out.println(5/0); //ArithmeticException
		// //catch(Throwable e)
		// //catch(Exception e)
		// }catch(ArithmeticException e) {
		// System.out.println("got you!!!");
		// }
		// System.out.println("end");

		System.out.println("start");
		
		try {
			d.dangerous_FileMethod();
		} catch (FileNotFoundException e) {
			System.out.println("Exception caught from file method");
			//e.printStackTrace();
		}
		
//		try {
//			dangerousMethod();
//		} catch (Exception e) {
//			System.out.println("danger caught");
//		}

		System.out.println("end");
	}

	 void dangerousMethod() {
		// we can use try catch to handle the exception
		System.out.println(5 / 0);
		System.out.println("end of method call");
	}

	 void dangerous_FileMethod() throws FileNotFoundException {
		FileReader fr = new FileReader("SomeTextFile");
//		try {
//			FileReader fr = new FileReader("SomeTextFile");
//		} catch (FileNotFoundException e) {
//			System.out.println("your file does not exist");
//			e.printStackTrace();
//		}
	}

}
