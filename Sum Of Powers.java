package Github_Pro;
import java.util.Scanner;
public class Sumofpowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N,i=0,r;
System.out.println("Enter N :");
Scanner pn=new Scanner(System.in);
N=pn.nextInt();
while(N!=0) {
	r=N%10;
   i=i+r*r;
	N=N/10;
}
System.out.println(i);
	}
}
