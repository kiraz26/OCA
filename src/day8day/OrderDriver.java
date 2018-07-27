package day8day;

public class OrderDriver {
	// Chapter 4 Question 22
	public static void main(String[] args) {
		System.out.print(Order.result + " ");
		System.out.print(Order.result + " ");
		new Order();
		new Order();
		System.out.print(Order.result + " ");
	}
}
