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


	//将十进制整数转化为二进制(强用数组版)
	public void tenToTwo(int n){
		int quotient,reminder,size,i;
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


	//保留n位小数
	public void nDemicalPlace (double x , int n){
		System.out.printf("%.nf",x);
	}


	//乘方
	public double power(double a, int b){
		double s=1;
		int i =1;
		for (i=1;i<=b;i++){
			s*=2;
		}
		return s;
	}


	//得到一个pi(误差蛮大)
	public double pi1(int n){
		int i=1,j=0;
		double pi,x,y;
		for(i=1;i<=n;i++){
			x=Math.random();
			y=Math.random();
			if (x*x+y*y<=1){
				j++;
			}
		}
		pi=4*(double)j/n;
		return pi;
	}


	//得到一个pi(误差较小)
	public double pi2(){
		double pi,s=0;
		int i;
		for(i=1;i<=10000;i++){
			s+=1.0/i*i;
		}
		pi=Math.sqrt(6*s);
		return pi;
	}

	//判断一个数是否为质数
	public void prime(int a) {
		int judge=0;
		if(a<=1){
			judge=0;
		}
		else if (a==2){
			judge=1;
		}
		else {
			int b,c,i;
			b=(int)Math.sqrt(a);
			for(i=2;i<=b;i++){
				c=a%i;
			    if (c==0){
			    	judge=0;
			    	break;
			    }
			    else{
			    	judge=1;
			    }
			}
		}
		if(judge==0){
			System.out.println("This is not a prime");
			}
		else{
			System.out.println("This is a prime");
		}
	}



}
