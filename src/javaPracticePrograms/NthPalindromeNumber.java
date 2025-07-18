package javaPracticePrograms;
import java.util.Scanner;
public class NthPalindromeNumber {
	

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
		System.out.println("Enter nth value");
		int nth=sc.nextInt();
		int palindrome_count=0;
		for(int i=1;true;i++)
		{
			if(reverseNumber(i)==i)
			{
				palindrome_count++;
				if(palindrome_count==nth)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}

}
