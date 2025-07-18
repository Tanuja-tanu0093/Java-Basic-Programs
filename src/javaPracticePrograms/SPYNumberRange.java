package javaPracticePrograms;
import java.util.Scanner;

public class SPYNumberRange {
	public static int sumOfDigits(int num)
	{
		int sum=0;
		while(num>0)
		{
			int last_digit=num%10;
			sum=sum+last_digit;
			num=num/10;
		}
		return sum;
	}
	public static int productOfDigits(int num)
	{
		int product=1;
		while(num>0)
		{
			int last_digit=num%10;
			product=product*last_digit;
			num=num/10;
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  m value");
		int m=sc.nextInt();
		System.out.println("Enter  n value");
		int n=sc.nextInt();
		System.out.println("The spy numbers from "+m+"to "+n +" are:");
		for(int i=m;i<=n;i++)
			
		{
			if(sumOfDigits(i)==productOfDigits(i))
			{
			System.out.println(i);
		}
		
	}

}
}
