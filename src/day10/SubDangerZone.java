package day10;

import java.io.FileNotFoundException;

public class SubDangerZone extends DangerZone{

	//Rule 1 for overriding related to exception
	//it can not throw a new checked Exception
	//you can throw a new runtime Exception
	//when overiiding a method that throw a checked exception
	//you can throws same exception in method declaration or any sub classes of that exception
	//you can just take out throws keyword to make the method throws nothing 
	
	@Override
	//void dangerous_FileMethod() throws FileNotFoundException { GOOD
	//void dangerous_FileMethod() throws IOFoundException { BAD -- it can be subtype not supertype
	//void dangerous_FileMethod() throws RuntimeException {
	void dangerous_FileMethod() {
		
	}
	
	
	@Override
	//void dangerousMethod() throws FileNotFoundException{ BAD!!!
	//void dangerousMethod() throws RuntimeException {
	void dangerousMethod() {
		super.dangerousMethod();
		
	}
	
	
}
