package javaPracticePrograms;
import java.util.Scanner;

public class TwistedPrimeSeries {
	
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
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int prime_count=0;
		for(int i=1;true;i++)
		{
			if(countOfFactors(i)==2 &&reverseNumber(countOfFactors(i))==2)
					{
				        prime_count++;
				        System.out.println(i);
				        if(prime_count==number)
				        {
				        	break;
				        }
					}
		}
	}

}
