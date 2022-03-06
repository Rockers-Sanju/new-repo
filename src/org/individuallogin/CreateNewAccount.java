package org.individuallogin;

public class CreateNewAccount {

	private void name() {
		
		System.out.println("sanjeev");

	}
	private void emailId() {
		
		System.out.println("sanjeev.dntopn@gmail.com");

	}
    private void password() {
	
    	System.out.println("123456789");

    }
    public static void main(String[] args) {
		
    	//object creation - ClassName ojectName = new ClassName();
    	
    	CreateNewAccount c = new CreateNewAccount();
    			
    	//method call - ojectName.methodName();
    	
    			c.emailId();
    	        c.name();
    	}
	
}
