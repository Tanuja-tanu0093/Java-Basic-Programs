package javaPracticePrograms;
import java.util.Scanner;

public class PerfectSquare {
	
	public static void isPerfectSquare(int num)
	{
		for(int i=1;i<=num/2+1;i++)
		{
			if(i*i==num)
			{
				System.out.println("The number=" +num+" is a Perfect Square ");
				break;
			}
		
			else if(i*i>num)
		{
			System.out.println("The number="+num+" is not  a Perfect Square");
			break;
			
		}
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		isPerfectSquare(number);
		
		
	}
}
	