package com.ajith.sample;

public class TestRunner{

	public static void main(String args[]) {
		System.out.println("Inside TestRunner main");
		
		Inf2 tester = null;
		
		System.out.println(Inf2.name);
		
		//name = "New Name";
		tester = new TestClass();

		System.out.println(tester.whoAmI());
		tester.testIt();
		
		
		System.out.println("Class1:" + (tester instanceof TestClass));
		if(tester instanceof TestClass2) {
			System.out.println("Test2:" + ((TestClass2) tester).test2());
		}else {
			System.out.println("I am not Test2");
		}
		
		tester = new TestClass2();
		
		System.out.println(tester.whoAmI());
		tester.testIt();
		
		if(tester instanceof TestClass2) {
			System.out.println("Test2:" + ((TestClass2) tester).test2());
		}else {
			System.out.println("I am not Test2");
		}
		
		
		System.out.println("Class2:" + (tester instanceof TestClass));
		
	}

}
