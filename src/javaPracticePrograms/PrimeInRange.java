package javaPracticePrograms;
import java.util.Scanner;

public class PrimeInRange {
	
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
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("The prime numbers between the range from "+m +" to "+n +"are:");
		for(int i=m;i<=n;i++)
		{
			if(countOfFactors(i)==2)
			{
				System.out.println(i);
			}
		}
		
	}

}
