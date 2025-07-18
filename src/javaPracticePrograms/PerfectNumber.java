package javaPracticePrograms;
import java.util.Scanner;

public class PerfectNumber {
	public static int sumOfFactors(int num)
	{
		int sum_of_factors=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum_of_factors=sum_of_factors+i;
			}
		}
		return sum_of_factors;
	}
	
	public static boolean isPerfectNumber(int num)
	{
		 int sum=sumOfFactors(num);
		 if(sum==num)
		 {
			 return true;
		 }
		 else
		 {
			 return false ;
		 }
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		if(isPerfectNumber(number))
		{
			System.out.println("The number="+number +" is a Perfect Number");
		}
		else
		{
			System.out.println("The number="+number +" is  not a Perfect Number");	
		}
	}

}
