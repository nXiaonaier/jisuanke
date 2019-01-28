package jisuanke;
import java.util.Scanner;
public class inputAndOutput {
	//输入一个3维的整数组
	public static int[] inputNumber() {
		Scanner sc=new Scanner(System.in);
		int number[]=new int[3];
		for(int i=0;i<3;i++)
			number[i]=sc.nextInt();
		sc.close();
		return number;
	}
	//输出一个3维的整数组
	public static void output(int number[]) {
		for(int i=0;i<number.length;i++)
			System.out.print(number[i]+" ");
	}
	public static void main(String ags[]) {
		//将输入的3维整数组输出
		int number[]=inputNumber();
		output(number);
	}
}
