package com.wangjun00.javacore;

import java.io.PrintStream;

public class YunSuan {

	public static void main(String[] args) {
		
		//关系运算符
	    int a =50;
	    int b =60;
	PrintStream prt = System.out;
	prt.println(a > b);
	prt.println(a < b);  
	
	   //基础运算符
         int int1 = 99;
         int int2 = 25;
    prt.println("int1 + int2 = " + (int1 + int2));
    prt.println("int1 - int2 = " + (int1 - int2));     
    prt.println("int1 * int2 = " + (int1 * int2));    
    prt.println("int1 / int2 = " + (int1 / int2));    
    prt.println("int1 % int2 = " + (int1 % int2));    
	    
      //逻辑运算符
       boolean bn1 = true;
       boolean bn2 = false;
    prt.println("bn1 && bn2 : " + (bn1 && bn2));
    prt.println("bn1 || bn2 : " + (bn1 || bn2));
       
       //三目运算符
        int i = 5, j = 9;
        int result = i > j ? i : j;
     prt.println("result :" + result);
     prt.println("result :" +((int)i > j));
               //"result"+(int)i大与j
     
       //字符串运算符
        String address1 = "Anhui";
        String address2 = "Hefei";
        int code = 5;
        String rest = address1 +" "+ address2 +" "+ code +" "+ "号";
     prt.println("rest :" + rest);
        
        //类型转换
         int num = 100;
         short shot;
         shot = (short) num;
     prt.println("shot :" + shot);
         byte bt;
         bt =(byte) num;
     prt.println("bt :" + bt);
         long lg;
         lg =(long) num;
     prt.println("lg :" + lg);
     
         //递增运算符
         int age =6;
     prt.println("age="+ age);
         age++;
     prt.println("age="+ age);
         age--;
     prt.println("age="+ age);
         ++age;
     prt.println("age="+ age);
         --age;
     prt.println("age="+ age);
         
     
         
     
     
     
     
     
     
     
     
    
    
    
    
	}

}
