import java.util.Scanner;
public class Duplieleminate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N;
Scanner dn=new Scanner(System.in);
N =dn.nextInt();
int i,j,count=0;
if(N<=100000) {
	int a[]=new int[N];
	for(i=0;i<a.length;i++) {
		a[i]=dn.nextInt();
	}
 for(i=0;i<a.length;i++) {
	   count=0;
	 for(j=i;j<a.length;j++) {
		 if(a[i]==a[j]) {
			 count++;
		 }
	 }
 if(count==2) {
	 System.out.println(a[i]+" ");
 }
 }
}
	}
}


