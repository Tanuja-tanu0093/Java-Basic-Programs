package javaPracticePrograms;
import java.util.Scanner;

public class NthPerfectSquare {
	
	public static void nthPerfectSquare(int nth)
	{
		int perfect_square_count=0;
		System.out.println("The "+nth+"perfect Square Number is:");
	
		for(int i=1;true;i++)
		{
			int square=i*i;
			perfect_square_count++;
			if(perfect_square_count==nth)
			{
				System.out.println(i*i);
				break;
			}
			
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth value");
		int nth=sc.nextInt();
		nthPerfectSquare(nth);
	
		
	}
}