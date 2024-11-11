package com.jb.main;

import java.util.Arrays;

import com.jb.comp.Demo;

public class ClassOperationTest {

	public static void main(String[] args) {
		Class c1 = Demo.class;

		System.out.println("c1 class name:-> " + c1.getClass());
		System.out.println("c1 obj data:-> " + c1.toString());

		System.out.println("\nDemo class details are: ");
		System.out.println("c1 class name:-> " + c1.getClass());
		System.out.println("c1 super class name:-> " + c1.getSuperclass());
		System.out.println("List of implemented interfaces in Demo class: " + Arrays.toString(c1.getInterfaces()));
		System.out.println("List of method present in Demo class: " + Arrays.toString(c1.getMethods()));
		System.out.println("List of fields present in Demo class: " + Arrays.toString(c1.getFields()));
		System.out.println("List of constructor present in Demo class: " + Arrays.toString(c1.getConstructors()));

	}

}
