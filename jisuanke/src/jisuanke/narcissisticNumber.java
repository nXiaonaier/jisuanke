package jisuanke;
import java.lang.Math;
public class narcissisticNumber {
	public static void main(String args[]) {
		for(int i=100;i<1000;i++) {
			//取3位数的各个数字
			int a=i/100,b=i%100/10,c=i%100;
			//满足水仙花数的结果输出
			if(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)==i)
				System.out.println(i);
		}
	}
}
