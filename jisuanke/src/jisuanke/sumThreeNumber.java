package jisuanke;
import java.util.Scanner;
public class sumThreeNumber {
	//输入3个数组成数组
	public static int[] inputNumber() {
		Scanner sc=new Scanner(System.in);
		int number[]=new int[3];
		for(int i=0;i<3;i++)
			number[i]=sc.nextInt();
		sc.close();
		return number;
	}
	//对这3个数进行求和
	public static int getThreeNumberSum(int number[]) {
		int sum=0;
		for(int i=0;i<3;i++)
			sum+=number[i];
		return sum;
	}
	//输出结果
	public static void outputResult(int number[]) {
		System.out.println(getThreeNumberSum(number));
	}
	public static void main(String args[]) {
		try {
			//如果输入的是3个整数，求和输出结果
			outputResult(inputNumber());
		}
		catch(Exception e) {
			//否则提示"输入3个整数"
			System.out.println("请输入3个整数!");
		}
	}
}
