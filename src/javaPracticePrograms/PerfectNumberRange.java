package javaPracticePrograms;
import java.util.Scanner;

public class PerfectNumberRange {
	
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
		System.out.println("Enter M value");
		int m=sc.nextInt();
		System.out.println("Enter N value");
		int n=sc.nextInt();
		System.out.println("The perfect numbers between the range from "+m+" to "+n +" are:");
		for(int i=m;i<=n;i++)
		{
			if(sumOfFactors(i)==i)
			{
			System.out.println(i);
		
			
		}
		
	}

}
}
