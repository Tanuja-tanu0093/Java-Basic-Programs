package javaPracticePrograms;
import java.util.Scanner;

public class PalindromeNumber {
	
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
	
	public static boolean isPalindromeNumber(int num)

	{
		if(reverseNumber(num)==num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		if(isPalindromeNumber(number))
		{
			System.out.println("The number="+number+" is a Palindrome Number");
		}
		else
		{
			System.out.println("The number="+number+" is  not a Palindrome Number");
		}
	}
	

}
