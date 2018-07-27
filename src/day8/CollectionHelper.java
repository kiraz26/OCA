package day8;

import java.util.ArrayList;
import static java.util.Collections.*;

public class CollectionHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lst =new ArrayList<>();
		lst.add(4);
		lst.add(5);
		lst.add(1);
		lst.add(0);
		
		sort(lst); // sort is static method from Collections
		
		
		System.out.println(lst);
 	}

}
