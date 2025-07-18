package javaPracticePrograms;
import java.util.Scanner;


public class NextPerfectNumber {
	
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
		System.out.println("Enter a  number");
		int number=sc.nextInt();
		for(int i=number+1;true;i++)
		{
			if(sumOfFactors(i)==i)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
