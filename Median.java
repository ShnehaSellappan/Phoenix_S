package Github;
import java.util.Scanner;
public class Medianele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N;
System.out.println("Enter the N value:");
Scanner rs=new Scanner(System.in);
N=rs.nextInt();
int a[]=new int[N];
int i,j,tmp=0;
for(i=0;i<N;i++) {
	a[i]=rs.nextInt();
}
for(i=0;i<N;i++) {
	for(j=i+1;j<N;j++) {
	if(a[i]>a[j]) {
		tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
}
	}
System.out.print(a[N/2]);
}
}
