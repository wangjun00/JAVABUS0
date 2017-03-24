package com.wangjun01.javacore;

import sun.management.Agent;

public class Administrator {

	private static String Name;
	private static int Pass;
	
	public static void main(String[] args) {
		Administrator administrator = new Administrator();
		administrator.Name = "张";
		administrator.Pass= 12345;
	System.out.println(Name +"\n" + "密码是："+ Pass );
	administrator.show();
		
		
	}

	private void show() {
		
	}

}
