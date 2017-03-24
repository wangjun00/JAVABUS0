package com.wangjun00.javacore;

public class BaoBao {


		private String name="Jack";
		private int age=35;
		private boolean married=true;

		public BaoBao() { 
			
		}
		
		public BaoBao(String str, int i, boolean flag){
			name = str;
			age = i;
			married = flag;
		}
		
		
		public void display() {
			System.out.println(name + " " + age + " " + married);
		}
		
		public static void main(String[] args){
		    BaoBao BaoBao = new BaoBao("rose", 20, false);
		    BaoBao.display();
		
		}
		}
		
		
