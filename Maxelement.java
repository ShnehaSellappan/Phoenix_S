public class Maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N;
System.out.println("Enter N:");
Scanner me=new Scanner(System.in);
N =me.nextInt();
int i,max;
int a[]=new int[N];
for(i=0;i<N;i++) {
	a[i]=me.nextInt();
}
max=a[0];
for(i=1;i<N;i++) {
	if(max<a[i]) {
		max=a[i];
	}
}
System.out.println(max);
	}
}
