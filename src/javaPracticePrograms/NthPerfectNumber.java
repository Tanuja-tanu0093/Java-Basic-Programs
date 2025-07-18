package javaPracticePrograms;
import java.util.Scanner;

public class NthPerfectNumber {
	
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
		System.out.println("Enter nth value");
		int nth=sc.nextInt();
		int perfect_count=0;
		System.out.println("The "+nth+" perfect Number is:");
		for(int i=1;true;i++)
		{
			if(sumOfFactors(i)==i)
			{
				perfect_count++;
				if(perfect_count==nth)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}

}
