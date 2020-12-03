package com.aakash.ihs;

import java.io.IOException;

public class OverridingTest1 {

}

class OverridingA {

	public int x = 10;

	public void shows() throws IOException {
		System.out.println(x);
	}

	public void shows1() throws NullPointerException {
		System.out.println(x);
	}
}

class OverridingB extends OverridingA {

	public int x = 20;

	public void shows() throws IOException {
		System.out.println(x);
	}
	public void shows1() throws NullPointerException {
		System.out.println(x);
	}

	public static void main(String arr[]) throws IOException {
		OverridingA a = new OverridingB();
		System.out.println(a.x);// 10
		a.shows();// 20
	}

}