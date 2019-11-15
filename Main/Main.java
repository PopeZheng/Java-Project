import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int need,num1,num2,num3,price1,price2,price3,cost1,cost2,cost3;
		need=sc.nextInt();
		num1=sc.nextInt();
		price1=sc.nextInt();
		num2=sc.nextInt();
		price2=sc.nextInt();
		num3=sc.nextInt();
		price3=sc.nextInt();
		sc.close();
		if(need<=10000&&num1<=10000&&num2<=10000&&num3<=10000&&price1<=10000&&price2<=10000&&price3<=10000) {
			double need1,need2,need3;
			need1=(double)need/num1;
			if(need1%1==0) {
				;
			}
			else {
				need1=(int)need1+1;
			}
			need2=(double)need/num2;
			if(need2%1==0) {
				;
			}
			else {
				need2=(int)need2+1;
			}
			need3=(double)need/num3;
			if(need3%1==0) {
				;
			}
			else {
				need3=(int)need3+1;
			}
			cost1=(int)need1*price1;
			cost2=(int)need2*price2;
			cost3=(int)need3*price3;
			if(cost1<=cost2&&cost1<=cost3) {
				System.out.println(cost1);
			}
			else if(cost2<=cost1&&cost2<=cost3){
				System.out.println(cost2);
			}
			else {
				System.out.println(cost3);
			}
				
		}
	}
}
