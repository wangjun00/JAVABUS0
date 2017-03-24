package com.wangjun00.javacore;

import sun.security.util.Password;

public class Customer {
	private static final String Password = null;
	private static String name;
	private String password;
	public static void main(String[] args) {
	Customer cus = new Customer();
	    cus.name ="李四";
        cus.password = "123456";
     System.out.println(  "您的名字是：" + name +"\n" + "密码是:"+Password);
       cus.show(); 
}
	private void show() {
		
		
	}
}