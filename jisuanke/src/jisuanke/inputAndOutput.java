package jisuanke;
import java.util.Scanner;
public class inputAndOutput {
	//����һ��3ά��������
	public static int[] inputNumber() {
		Scanner sc=new Scanner(System.in);
		int number[]=new int[3];
		for(int i=0;i<3;i++)
			number[i]=sc.nextInt();
		sc.close();
		return number;
	}
	//���һ��3ά��������
	public static void output(int number[]) {
		for(int i=0;i<number.length;i++)
			System.out.print(number[i]+" ");
	}
	public static void main(String ags[]) {
		//�������3ά���������
		int number[]=inputNumber();
		output(number);
	}
}
