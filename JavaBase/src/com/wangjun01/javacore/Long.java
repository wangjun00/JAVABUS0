package com.wangjun01.javacore;

import com.sun.pisces.GradientColorMap;

//	先定义一个属性（这是一个黄色的狮子）
public class Long {
	String color = "黄色";

//   写出他的方法（如：跑，叫）
	public void run() {
		System.out.println("正在以0.1米/秒的速度向前奔跑");
	}

//   写出他的方法（如：跑，叫）
	public String bark() {
		String sound = "大声吼叫";
		return sound;
    }
	 /*获得颜色*/

	public String  String; java.lang.String color(){
	    return color;
	}
	/*显示狮子特性*/
	public String showlion(){
//		在类的方法中，调用"该类"另一个方法

		return ("这是一个" + color() + "的玩具狮子！");
	}
	
	
	
	
	
	
}
