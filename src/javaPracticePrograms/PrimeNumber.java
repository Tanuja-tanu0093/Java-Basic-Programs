package javaPracticePrograms;
import java.util.Scanner;

public class PrimeNumber {
	
	
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
	public static boolean isPrime(int num)
	{
		int count_of_factors=countOfFactors(num);
		if(count_of_factors==2)
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
		System.out.println("Enter a Number ");
		int number=sc.nextInt();
		if(isPrime(number))
		{
			System.out.println("The number= "+number+" is a Prime Number");
		}
		else
		{
			System.out.println("The number= "+number+"  is not a Prime Number");
		}
	}

}
