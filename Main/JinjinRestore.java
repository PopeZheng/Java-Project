import java.util.*;
public class Main {
	public static void main(String[] args) {
		int ne1,ne2,ne3,ne4,ne5,ne6,ne7,ne8,ne9,ne10,ne11,ne12;
		int res1=0,res2=0,res3=0,res4=0,res5=0,res6=0,res7=0,res8=0,res9=0,res10=0,res11=0,res12=0;
		int rem1=0,rem2=0,rem3=0,rem4=0,rem5=0,rem6=0,rem7=0,rem8=0,rem9=0,rem10=0,rem11=0,rem12=0;
		int sum;
		Scanner sc= new Scanner(System.in);
		ne1=sc.nextInt();
		ne2=sc.nextInt();
		ne3=sc.nextInt();
		ne4=sc.nextInt();
		ne5=sc.nextInt();
		ne6=sc.nextInt();
		ne7=sc.nextInt();
		ne8=sc.nextInt();
		ne9=sc.nextInt();
		ne10=sc.nextInt();
		ne11=sc.nextInt();
		ne12=sc.nextInt();
		sc.close();
		if (ne1>300) {
			System.out.println(-1);
			System.exit(0);
		}
		else {
			res1=((300-ne1)/100)*100;
			rem1=300-ne1-res1;
		}
		if (ne2-rem1>300) {
			System.out.println(-2);
			System.exit(0);
		}
		else {
			res2=((300+rem1-ne2)/100)*100;
			rem2=rem1+300-ne2-res2;
		}
		if (ne3-rem2>300) {
			System.out.println(-3);
			System.exit(0);
		}
		else {
			res3=((300+rem2-ne3)/100)*100;
			rem3=rem2+300-ne3-res3;
		}
		if (ne4-rem3>300) {
			System.out.println(-4);
			System.exit(0);
		}
		else {
			res4=((300+rem3-ne4)/100)*100;
			rem4=rem3+300-ne4-res4;
		}
		if (ne5-rem4>300) {
			System.out.println(-5);
			System.exit(0);
		}
		else {
			res5=((300+rem4-ne5)/100)*100;
			rem5=rem4+300-ne5-res5;
		}
		if (ne6-rem5>300) {
			System.out.println(-6);
			System.exit(0);
		}
		else {
			res6=((300+rem5-ne6)/100)*100;
			rem6=rem5+300-ne6-res6;
		}
		if (ne7-rem6>300) {
			System.out.println(-7);
			System.exit(0);
		}
		else {
			res7=((300+rem6-ne7)/100)*100;
			rem7=rem6+300-ne7-res7;
		}
		if (ne8-rem7>300) {
			System.out.println(-8);
			System.exit(0);
		}
		else {
			res8=((300+rem7-ne8)/100)*100;
			rem8=rem7+300-ne8-res8;
		}
		if (ne9-rem8>300) {
			System.out.println(-9);
			System.exit(0);
		}
		else {
			res9=((300+rem8-ne9)/100)*100;
			rem9=rem8+300-ne9-res9;
		}
		if (ne2-rem1>300) {
			System.out.println(-10);
			System.exit(0);
		}
		else {
			res10=((300+rem9-ne10)/100)*100;
			rem10=rem9+300-ne10-res10;
		}
		if (ne11-rem10>300) {
			System.out.println(-11);
			System.exit(0);
		}
		else {
			res11=((300+rem10-ne11)/100)*100;
			rem11=rem10+300-ne11-res11;
		}
		if (ne12-rem11>300) {
			System.out.println(-12);
			System.exit(0);
		}
		else {
			res12=((300+rem11-ne12)/100)*100;
			rem12=rem11+300-ne12-res12;
		}
		sum=(int)((res1+res2+res3+res4+res5+res6+res7+res8+res9+res10+res11+res12)*1.2+rem12);
		System.out.println(sum);
	}
}
