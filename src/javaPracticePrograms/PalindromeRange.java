package javaPracticePrograms;
import java.util.Scanner;

public class PalindromeRange {

	
	
	public static int reverseNumber(int num)
	{
		int reverse=0;
		while(num>0)
		{
			int last_digit=num%10;
			reverse=reverse*10+last_digit;
			num=num/10;
		}
		return reverse;
		}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("The palindrome numbers from "+m+" to "+n +" are:");
		for(int i=m;i<=n;i++)
		{
			if(reverseNumber(i)==i)
			{
				System.out.println(i);
			}
		
	}
	}
}
