package javaPracticePrograms;
import java.util.Scanner;

public class NextPrimeNumber {

	public static int countOfFactors(int num)
	{
		int count_of_factors=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
			{
				count_of_factors ++;
			}
		}
		return count_of_factors;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		for(int i=number+1;true;i++)
		{
			if(countOfFactors(i)==2)
			{
				System.out.println("The next Prime Number after the number= "+number +"is :"+i);
				break;
			}
		}
	}
}
