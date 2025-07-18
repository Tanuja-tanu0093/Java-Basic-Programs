package javaPracticePrograms;
import java.util.Scanner;

public class NextSunnyNumber {
	public static void nextSunnyNumber(int num)
	{
		for(int i=1;true;i++)
		{
			int square=i*i;
			if(square>num)
			{
				System.out.println("The next Sunny Number is :"+(square-1));
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		nextSunnyNumber(number);
		
		
	}

}
