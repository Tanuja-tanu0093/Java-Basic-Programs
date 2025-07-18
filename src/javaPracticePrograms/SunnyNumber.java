package javaPracticePrograms;
import java.util.Scanner;

public class SunnyNumber {
	public static void  sunnyNumber(int num)
	{
		for(int i=1;i<=num/2+1;i++)
		{
		
			if(i*i==num)
			{
				System.out.println(num-1+" is a sunny number");
				break;
				
			}
			else if(i*i>num)
			{
				System.out.println(num-1+" is not a sunny number");
				break;
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a  number");
		int number=sc.nextInt();
		sunnyNumber(number+1);
	}
}
		
