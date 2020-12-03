package com.aakash.ihs;

public class OverridingTest2 {
	
	public static void main(String[] args) {

		A a = new B();
		a.printValue();// B
		System.out.println(a.i);// 10
	}
}

class A {
	int i = 10;

	public void printValue() {
		System.out.println("A");
	}
}

class B extends A {
	int i = 20;

	public void printValue() {
		System.out.print("B");
	}
}
