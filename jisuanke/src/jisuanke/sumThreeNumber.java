package jisuanke;
import java.util.Scanner;
public class sumThreeNumber {
	//����3�����������
	public static int[] inputNumber() {
		Scanner sc=new Scanner(System.in);
		int number[]=new int[3];
		for(int i=0;i<3;i++)
			number[i]=sc.nextInt();
		sc.close();
		return number;
	}
	//����3�����������
	public static int getThreeNumberSum(int number[]) {
		int sum=0;
		for(int i=0;i<3;i++)
			sum+=number[i];
		return sum;
	}
	//������
	public static void outputResult(int number[]) {
		System.out.println(getThreeNumberSum(number));
	}
	public static void main(String args[]) {
		try {
			//����������3�����������������
			outputResult(inputNumber());
		}
		catch(Exception e) {
			//������ʾ"����3������"
			System.out.println("������3������!");
		}
	}
}
