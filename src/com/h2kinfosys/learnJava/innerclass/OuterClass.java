package com.h2kinfosys.learnJava.innerclass;

public class OuterClass {
	
	private String outInstanceVariable = "Outer Class Instance Variable";
	private static String staticOutInstanceVariable = "Static Outer Class Instance Variable";
	
	//Constructor
	public OuterClass() {
		System.out.println("OuterClass");
	}
	
	public void tryAccessingThis(String success) {
		System.out.println("You Did it!! " + success);
	}
	
	public static void tryAccessingStatic(String success) {
		System.out.println("You Did it in Static Way!! " + success);
	}
	
	public void accessInnerClass() {
		InnerClass inner = new InnerClass();
		inner.printVariables();
		System.out.println(inner.innerInstanceVariable);
	}
	
	
	public void accessStaticInnerClass() {
		StaticInnerClass staticInner = new StaticInnerClass();
		staticInner.printVariables();
		System.out.println(staticInner.staticInnerInstanceVariable);
		
	}
	// Inner class - instance class
	class InnerClass {
		private String innerInstanceVariable = "Inner Class Instance Variable";
		//Constructor
		public InnerClass() {
			System.out.println("InnerClass");
		}
		/*
		 * Inner class can access private member variables of outer class (instance and class type)
		 */
		public void printVariables() {
			System.out.println(innerInstanceVariable);
			System.out.println(outInstanceVariable);
			System.out.println(staticOutInstanceVariable);
			tryAccessingThis("Yeee!!");
			tryAccessingStatic("Yeesss Again");
		}
		
	}
	
	// Static Inner class
	static class StaticInnerClass {
		private String staticInnerInstanceVariable = "Static Inner Class Instance Variable";
		//Constructor
		public StaticInnerClass() {
			System.out.println("StaticInnerClass");
		}
		
		/*
		 * StaticInnerClass can access private & static member variables of outer class 
		 */
		public void printVariables() {
			System.out.println(staticInnerInstanceVariable);
			//System.out.println(outInstanceVariable);
			System.out.println(staticOutInstanceVariable);
			// tryAccessingThis("Yeee!!");
			tryAccessingStatic("Yeesss Again");
		}
		
	}

}
