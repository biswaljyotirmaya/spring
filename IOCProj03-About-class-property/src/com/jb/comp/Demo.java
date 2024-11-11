package com.jb.comp;

public class Demo {
	private int a;
	private int b;

	Demo() {
		System.out.println("Demo.default:Demo()");
	}

	Demo(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Demo.2parameterized:Demo()");
	}

	public void m1() {
		System.out.println("Demo.m1()");
	}

	public void m2() {
		System.out.println("Demo.m2()");
	}

}
