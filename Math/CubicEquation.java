import java.util.*;
public class CubicEquation {

	public static void main(String[] args) 
	{
		System.out.println("You are goning to use this to solve an equation"
				+ "and its style is ax^2+bx+c=0\n"
				+ "Please input a,b,c ");
		double a,b,c,d,x1,x2,x;
		char i;
		Scanner sc= new Scanner(System.in);
		do
		{
		System.out.print("a:");
		a=sc.nextDouble();
		System.out.print("b:");
		b=sc.nextDouble();
		System.out.print("c:");
		c=sc.nextDouble();
		d=b*b-4*a*c;
		if (d<0)
		{
			System.out.println("This equation has no solution");
		}
		else if (d==0)
		{
			x=-(b/(2*a));
			System.out.println("The solutionS of this equation is:x1=x2="+x);
		}
		else
		{
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The solution of this equation are:x1="+x1+",x2="+x2);
			
		}
		System.out.print("Do you want to use me again?(T/F)");
		i=sc.next().charAt(0);
		}while(i=='T');
		sc.close();
		System.out.println("Thank you for using me");
		
		
	}
}
