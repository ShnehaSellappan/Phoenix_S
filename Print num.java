package Github;
import java.util.Scanner;
public class Printspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N;
System.out.println("Enter the value of N:");
Scanner rs=new Scanner(System.in);
N=rs.nextInt();
int i,j=0,k=0;
while(N!=0) {
	j=N%10;
	k=k*10+j;
	N=N/10;
	}
while(k!=0) {
	j=k%10;
	System.out.print(j+" ");
	k=k/10;
}
	}
}
