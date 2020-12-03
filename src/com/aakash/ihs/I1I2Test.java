package com.aakash.ihs;

public class I1I2Test implements I1,I2{

	public static void main(String[] args) {
		I2 obj = new I1I2Test();
		obj.m1();
	}

	@Override
	public void m1() {
		I1.super.m1();
	}

}
