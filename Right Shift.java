package GitHub_set1r;
import java.util.Scanner;
public class Rightshift {

	public static void main(String[] args) {
int N,K;
System.out.println("Enter N value:");
Scanner sh=new Scanner(System.in);
N=sh.nextInt();
System.out.println("Enter K value:");
K=sh.nextInt();
System.out.println("Enter the Elements:");
int a[]=new int[N];
int i,j;
String str="",s1;
for(i=0;i<N;i++) {
	a[i]=sh.nextInt();
	str=str+Integer.toString(a[i]);
}
	for(j=0;j<K;j++) {
s1=str.substring(str.length()-1);
for(i=0;i<N-1;i++) {
	s1=s1+str.substring(i, i+1);
}
 str=s1;
	}
	System.out.print(Integer.parseInt(str)+" ");
}
}
