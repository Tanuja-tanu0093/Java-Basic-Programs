package javaPracticePrograms;
import java.util.Scanner;

public class PalindromeSeries {

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
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int palindrome_count=0;
		for(int i=1;true;i++ )
		{
			if(reverseNumber(i)==i)
			{
				System.out.println(i);
				palindrome_count++;
				if(palindrome_count==number)
				{
					break;
				}
			}
	}
	}
}
