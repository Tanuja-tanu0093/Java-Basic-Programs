package javaPracticePrograms;
import java.util.Scanner;

public class NthTwistedPrimeNumber {
	
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
		System.out.println("Enter nth value");
		int nth=sc.nextInt();
		int n=1;
		int prime_count=0;
		System.out.println("The "+nth+"Twisted Prime Number is :");
		while(n>0)
		{
			if(countOfFactors(n)==2 && reverseNumber(countOfFactors(n))==2)
			{
				prime_count++;
				if(prime_count==nth)
				{
					System.out.println(n);
					break;
				}
			}
			n++;
		}
	}

}
