package Github;
import java.util.Scanner;
public class Printspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N;
System.out.println("Enter the value of N:");
Scanner rs=new Scanner(System.in);
N=rs.nextInt();
int i=0,count=0;
int k[]=new int[50];
while(N!=0) {
	k[i]=N%10;
	i++;
	count++;
	N=N/10;
}
for(i=count-1;i>=0;i--) {
	System.out.print(k[i]+" ");
}
	}
}
