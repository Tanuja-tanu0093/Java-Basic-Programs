package javaPracticePrograms;
import java.util.Scanner;

public class NextSPYNumber {
	
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
		System.out.println("Enter  a number");
		int number=sc.nextInt();
		for(int i=number+1;true;i++)
		{
			if(sumOfDigits(i)==productOfDigits(i))
			{
				System.out.println(i);
				break;
			}
		}
	}

}
