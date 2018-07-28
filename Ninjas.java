package Github;
import java.util.Scanner;
public class Ninjasdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("Enter the n value:");
Scanner rs=new Scanner(System.in);
n=rs.nextInt();
int a[]=new int[n];
int i,j=0;
int b[]=new int[n];
for(i=0;i<n;i++) {
	a[i]=rs.nextInt();
}
System.out.println("OUTPUT:");
for(i=0;i<n;i++) {
	b[j]=a[i]-a[i+1];
	if(b[j]<0) {
		b[j]=-b[j];
	}
	System.out.println(b[j]);
	i++;
	j++;
}
	}

}
