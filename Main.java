import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int mon1,mon2,tus1,tus2,wen1,wen2,thu1,thu2,fri1,fri2,sat1,sat2,sun1,sun2;
		int mon,tus,wen,thu,fri,sat,sun;
		mon1=sc.nextInt();
		mon2=sc.nextInt();
		tus1=sc.nextInt();
		tus2=sc.nextInt();
		wen1=sc.nextInt();
		wen2=sc.nextInt();
		thu1=sc.nextInt();
		thu2=sc.nextInt();
		fri1=sc.nextInt();
		fri2=sc.nextInt();
		sat1=sc.nextInt();
		sat2=sc.nextInt();
		sun1=sc.nextInt();
		sun2=sc.nextInt();
		sc.close();
		mon=mon1+mon2;
		tus=tus1+tus2;
		wen=wen1+wen2;
		thu=thu1+thu2;
		fri=fri1+fri2;
		sat=sat1+sat2;
		sun=sun1+sun2;
		if(mon<=8&&tus<=8&&wen<=8&&thu<=8&&fri<=8&&sat<=8&&sun<=8) {
			System.out.println(0);
		}
		else {
			if(mon>=tus&&mon>=wen&&mon>=thu&&mon>=fri&&mon>=sat&&mon>=sun) {
				System.out.println(1);
			}
			else if(tus>mon&&tus>=wen&&tus>=thu&&tus>=fri&&tus>=sat&&tus>=sun) {
				System.out.println(2);
			}
			else if(wen>mon&&wen>tus&&wen>=thu&&wen>=fri&&wen>=sat&&wen>=sun) {
				System.out.println(3);
			}
			else if(thu>mon&&thu>tus&&thu>wen&&thu>=fri&&thu>=sat&&thu>=sun) {
				System.out.println(4);
			}
			else if(fri>mon&&fri>tus&&fri>wen&&fri>thu&&fri>=sat&&fri>=sun) {
				System.out.println(5);
			}
			else if(sat>mon&&sat>tus&&sat>wen&&sat>thu&&sat>fri&&sat>=sun) {
				System.out.println(6);
			}
			else {
				System.out.println(7);
			}
		}
		
		
		
	}
}
