package javaPracticePrograms;
import java.util.Scanner;

public class PerfectSquareSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int perfect_square_count=0;
		for(int i=1;true;i++)
		{
			int square=i*i;
			perfect_square_count++;
			System.out.println(i*i);
			if(perfect_square_count==number)
			{
				break;
			}
		}
		
		
		
	}
}
