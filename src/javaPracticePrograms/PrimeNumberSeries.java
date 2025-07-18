package javaPracticePrograms;
import java.util.Scanner;

public class PrimeNumberSeries {
	
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int prime_count=0;
		int n=1;
		System.out.println("The first"+number+" prime numbers are:");
		while(prime_count<number)
		{
			if(countOfFactors(n)==2)
			{
				System.out.println(n);
				prime_count++;
				
			}
			n++;
			
		}
		

}
}
