import java.util.Scanner;
public class Money {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("STB的成绩是：");
		int stb = input.nextInt(80);     //stb分数
		 //省略接收Java分数和SQL分数……
		int diffen = 80;       //分数差
		double avg;       //平均分
		 //省略输出成绩单代码……
		diffen = diffen - stb; //计算Java课和SQL课的成绩差
		System.out.println("Java和SQL的成绩差：" + diffen);
		avg = (stb + diffen + stb) / 3;	//计算平均分
		System.out.println("3门课的平均分是: " + avg);
	}
}

		
	
		
	


