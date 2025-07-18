package javaPracticePrograms;
import java.util.Scanner;

public class PerfectSquareRange {
	public static void perfectSquareRange(int m,int n)
	{
		System.out.println("Perfect Square numbers from "+m +" to "+n +" are:");
	
		for(int i=1;i*i<=n;i++)
		{
			int square=i*i;
			
			if(square>=m)
			{
				System.out.println(square);
                     			
			}
		
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		perfectSquareRange(m,n);
		
		
	}
}
	
