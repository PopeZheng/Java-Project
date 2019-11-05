import java.util.*;
public class HelloWorldGraphics {

	public static void main(String[] args) 
	{
		System.out.println("Please input the length of three sides ");
		double a,b,c,square,s;
		Scanner sc = new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		sc.close();
		if (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a)
		{
			s=(a+b+c)/2;
			square=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("The square of triangle is "+square);
		}
		else 
		{
			System.out.println("Error");
		}
		
	}
}