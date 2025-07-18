package javaPracticePrograms;
import java.util.Scanner;

public class NthPrimeNumber {
	
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
	System.out.println("Enter nth value");
	int nth=sc.nextInt();
	int n=1;
	int prime_count=0;
	while(n>0)
	{
		if(countOfFactors(n)==2)
		{
			prime_count++;
			if(prime_count==nth)
			{
				System.out.println("The "+nth+" prime number is :"+n);
				break;
			}
			
		}
		n++;
	}
}

}
