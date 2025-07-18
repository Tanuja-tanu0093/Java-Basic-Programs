package javaPracticePrograms;
import java.util.Scanner;

public class PerfectNumberSeries {
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
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int perfect_count=0;
		for(int i=1;true;i++)
		{
			if(sumOfFactors(i)==i)
			{
				System.out.println(i);
				perfect_count++;
				if(perfect_count==number)
				{
					break;
				}
			}
		}
		}

}
