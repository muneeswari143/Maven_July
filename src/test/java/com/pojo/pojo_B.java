package com.pojo;

import java.util.jar.Attributes.Name;

public class pojo_B {
	public static Pojo_A a=new Pojo_A();
	public static void main(String[] args) {
		int value = a.getA();
		System.out.println(value);
		a.setA(20);
		int value1 = a.getA();
		System.out.println(value1);
		String name = a.getName();
		System.out.println(name);
		
	}

}
