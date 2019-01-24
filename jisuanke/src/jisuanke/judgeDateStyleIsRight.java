package jisuanke;
import java.util.Scanner;
public class judgeDateStyleIsRight {
	public static int returnRightNumber(double number) {
		char tmp[]=String.valueOf(number).toCharArray();
		if(tmp[tmp.length-1]=='0')
			return (int) (number);
		else
			return 0;
	}
	public static int[] produceDate() {
		Scanner sc=new Scanner(System.in);
		double numberArray[]=new double[3];
		numberArray[0]=sc.nextDouble();
		numberArray[1]=sc.nextDouble();
		numberArray[2]=sc.nextDouble();
		int realNumberArray[]=new int[3];
		for(int i=0;i<3;i++)
			realNumberArray[i]=returnRightNumber(numberArray[i]);
		sc.close();
		return realNumberArray;
	}
	public static void main(String args[]) {
		try {
			int realNumberArray[]=produceDate(),result;
			if(realNumberArray[0]<=0)
				result=0;
			else if(realNumberArray[1]==0||realNumberArray[2]==0)
				result=0;
			else if(realNumberArray[1]<=0||realNumberArray[1]>=13)
				result=0;
			else if(realNumberArray[0]%400==0||realNumberArray[0]%100!=0&&realNumberArray[0]%4==0)
				if(realNumberArray[1]==1||realNumberArray[1]==3||realNumberArray[1]==5||realNumberArray[1]==7||realNumberArray[1]==8||realNumberArray[1]==10||realNumberArray[1]==12)
					if(realNumberArray[2]>0&&realNumberArray[2]<32)
						result=1;
					else
						result=0;
				else if(realNumberArray[1]==2)
					if(realNumberArray[2]>0&&realNumberArray[2]<30)
						result=1;
					else
						result=0;
				else
					if(realNumberArray[2]>0&&realNumberArray[2]<31)
						result=1;
					else
						result=0;
			else {
				if(realNumberArray[1]==1||realNumberArray[1]==3||realNumberArray[1]==5||realNumberArray[1]==7||realNumberArray[1]==8||realNumberArray[1]==10||realNumberArray[1]==12)
					if(realNumberArray[2]>0&&realNumberArray[2]<32)
						result=1;
					else
						result=0;
				else if(realNumberArray[1]==2)
					if(realNumberArray[2]>0&&realNumberArray[2]<29)
						result=1;
					else
						result=0;
				else
					if(realNumberArray[2]>0&&realNumberArray[2]<31)
						result=1;
					else
						result=0;
			}
			System.out.print(result);
		}
		catch(Exception e){
			System.out.print(0);
			System.exit(0);
		}
	}
}
