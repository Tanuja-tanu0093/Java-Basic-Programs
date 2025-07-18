package javaPracticePrograms;
import java.util.Scanner;

public class SpyNumber {
	
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
	
	public static boolean isSpyNumber(int num)
	{ 
		int sum_of_digits=sumOfDigits(num);
		int product_of_digits=productOfDigits(num);
		if(sum_of_digits==product_of_digits)
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
		if(isSpyNumber(number))
		{
			System.out.println("The number= "+number+" is a SPY Number");
		}
		else
		{
			System.out.println("The number= "+number+" is not a SPY Number");
		}
		
		
	}
	

}
