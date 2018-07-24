import java.util.Scanner;
public class Evenoddpos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N;
Scanner oe=new Scanner(System.in);
N =oe.nextInt();
int i,m=0,n=0;
if(N<=100000) {
int a[]=new int[N];
for(i=0;i<N;i++) {
	a[i]=oe.nextInt();
}
int b[]=new int[N];
int c[]=new int[N];
for(i=0;i<N;i++) {
	if(i%2==0) {
		if(a[i]%2!=0) {
			System.out.println(a[i]);
		}
	}
	if(i%2!=0) {
		if(a[i]%2==0) {
			System.out.println(a[i]);
		}
	}
}
	}
	}
}
