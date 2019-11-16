import java.util.*;
public class Main {
	public static void main(String[] args) {
		int i,a,b,q,r1,r2,r3;
		Set<Object> set1= new HashSet<Object> ();
		Set<Object> set2= new HashSet<Object> ();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(9);
		for(i=123;i<=329;i++) {
			q=i;
			a=2*i;
			b=3*i;
			do {
				r1=q%10;
				q=q/10;
				set2.add(r1);
			}while(q!=0);
			do {
				r2=a%10;
				a=a/10;
				set2.add(r2);
			}while(a!=0);
			do {
				r3=b%10;
				b=b/10;
				set2.add(r3);
			}while(b!=0);
			if(set1.size()==set2.size()) {
				System.out.println(i+" "+2*i+" "+3*i);
				System.out.println(set1);
				System.out.println(set2);
				set2.removeAll(set2);
			}
			else {
				;
			}
		}
		
		
	}
}
