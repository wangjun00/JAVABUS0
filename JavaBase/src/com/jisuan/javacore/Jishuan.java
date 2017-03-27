package com.jisuan.javacore;

public class Jishuan {

	public static void main(String[] args) {

		// int sum;
		// for(int i =1; i<=9; i++){
		// for(int j =1; j<=i; j++){
		// sum =i *j;
		// System.out.println(j+i+sum+" ");
		// }
		// System.out.println();
		// }
		// }
		//
		// }
		int i = 1;
		int sum;
		while (i <= 9) {
        int j=i ;
        while(j<i){
        sum=i*j;
        
        System.out.println(j+"*"+i+"="+sum+" ");
        j++;}
		i++;
		System.out.println();
		}

	}}
