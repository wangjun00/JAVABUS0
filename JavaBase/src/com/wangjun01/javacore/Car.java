package com.wangjun01.javacore;

import com.sun.webkit.ContextMenu.ShowContext;

public class Car {
//	private static final char[] Car = null;
	private String name = "qq";
	private int site = 4;

	Car() {
		System.out.println("这辆汽车的型号是：" + name +"\n"+ "能坐：" + site);

	}

	public String showCar() {

		return name;
	}
}
