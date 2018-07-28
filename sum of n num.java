package Github;
import java.util.Scanner;
public class Sumofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N;
System.out.println("Enter N value:");
Scanner sn=new Scanner(System.in);
N=sn.nextInt();
int a[]=new int[N];
int i,sum=0;
for(i=0;i<N;i++) {
  a[i]=sn.nextInt();
}
for(i=0;i<N;i++) {
	sum=sum+a[i];
}
System.out.println(sum);
	}
}
