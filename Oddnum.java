public class Oddnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N,Q,i=0,j=0;
Scanner nn=new Scanner(System.in);
N =nn.nextInt();
Q =nn.nextInt();
if(Q<=100000)
for(i=N+1;i<Q;i++) {
	if(i%2!=0) {
		System.out.println(i);
	}
}
