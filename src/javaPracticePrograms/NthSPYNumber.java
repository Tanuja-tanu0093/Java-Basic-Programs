package javaPracticePrograms;
import java.util.Scanner;

public class NthSPYNumber {
	
	public static int sumOfDigits(int num)
	{
		int sum=0;
		while(num>0)
		{
			int last_digit=num%10;
			sum=sum+last_digit;
			num=num/10;
		}
		return sum;
	}
	public static int productOfDigits(int num)
	{
		int product=1;
		while(num>0)
		{
			int last_digit=num%10;
			product=product*last_digit;
			num=num/10;
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth value");
		int nth=sc.nextInt();
		int spy_count=0;
		for(int i=1;true;i++)
		{
			if(sumOfDigits(i)==productOfDigits(i))
			{
				spy_count++;
				if(spy_count==nth)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}


