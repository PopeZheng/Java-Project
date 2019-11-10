public class PopeZhengMath{
	//求平方数
	public double square(double x){
		double response;
		response=x*x;
		return response;
	}


	//求解一元二次方程
	public void quarticEquation(double a,double b,double c){
		double d=0;
		d=b*b-4*a*c;
		if(d<0){
			System.out.println("This equation has no solution");
		}
		else if(d==0){
			double x= -b/(2*a);
			System.out.println("x1=x2="+x);
		}
		else {
			double x1, x2;
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("x1="+x1+",x2="+x2);
		}
	}


	//将十进制整数转化为二进制
	int quotient,reminder,size,i;
	public void tenToTwo(int n){
		int [] array= {};
		quotient=n;
		do{
			reminder=quotient%2;
			quotient=quotient/2;
			array = Arrays.copyOf(array, array.length + 1); 
		    array[array.length - 1] = reminder;
		}while(quotient !=0);
		size=array.length-1;
		System.out.print("所得的二进制数为：");
		for (i=0;i<=size;i++) {
			System.out.print(array[size-i]);
		}
		
	}
}
//未完待续
