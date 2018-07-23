public class Sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N;
System.out.println("Enter N:");
Scanner me=new Scanner(System.in);
N =me.nextInt();
int i,j,tmp=0;;
int a[]=new int[N];
for(i=0;i<N;i++) {
	a[i]=me.nextInt();
}
for(i=0;i<N;i++) {
	for(j=i+1;j<N;j++) {
	if(a[i]>a[j]) {
		tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
		}
}
	System.out.println(a[i]);
}
	}
}
