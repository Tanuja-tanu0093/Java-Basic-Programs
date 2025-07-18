package javaPracticePrograms;
import java.util.Scanner;

public class NthSunnyNumber {
	
	public static void nthSunnyNumber(int nth)
	{
		int sunny_number=0;
		for(int i=1;true;i++)
		{
			int square=i*i;
			sunny_number++;
			if(sunny_number==nth)
			{
				System.out.println("The "+nth+" sunny number is :"+(square-1));
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth value");
		int nth=sc.nextInt();
		nthSunnyNumber(nth);
		
	}

}
