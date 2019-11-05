import java.util.*;
public class HelloWorldGraphics {

	public static void main(String[] args) 
	{
		double a,b,x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please input the inner r of annulus:");
		a=sc.nextDouble();
		System.out.print("Please input the external r of annulus:");
		b=sc.nextDouble();
		System.out.print("Please input the coornidate of the point:");
		x=sc.nextDouble();
		y=sc.nextDouble();
		sc.close();
		if (b>=a)
		{
			;
		}
		else
		{
			b=a;
		}
		if ((x*x+y*y>=a*a)&&(x*x+y*y<=b*b))
		{
			System.out.println("The point is in the annulus");
		}
		else
		{
			System.out.println("The point is not in the annulus");
		}
		
	    
	    
		
	}
}