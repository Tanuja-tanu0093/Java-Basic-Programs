package javaPracticePrograms;
import java.util.Scanner;

public class TwistedPrimeRange {

	
	public static int countOfFactors(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int reverseNumber(int num) {
		int reverse = 0;
		while (num > 0) {
			int last_digit = num % 10;
			reverse = reverse * 10 + last_digit;
			num = num / 10;
		}
		return reverse;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			if(countOfFactors(i)==2 && reverseNumber(countOfFactors(i))==2)
			{
				System.out.println(i);
			}
		}
		
	}
}
