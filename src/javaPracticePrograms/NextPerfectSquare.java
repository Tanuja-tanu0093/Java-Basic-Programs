package javaPracticePrograms;
import java.util.Scanner;

public class NextPerfectSquare {
	
	public static void nextPerfectSquare(int num)
	{
		for(int i=1;true;i++)
		{
			if(i*i>num)
			{
				System.out.println("The next Perfect Square number  after the number ="+num +" is :"+i*i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a  number");
		int number=sc.nextInt();
		nextPerfectSquare(number);
		
	}
}