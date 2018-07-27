package Github;
import java.util.Scanner;
public class Voltsacuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int L,B,H;
Scanner vt=new Scanner(System.in);
L=vt.nextInt();
B=vt.nextInt();
H=vt.nextInt();
int vol,tsa;
tsa=2*((L*B)+(B*H)+(H*L));
vol=L*B*H;
System.out.print(tsa+" "+vol);
	}

}
