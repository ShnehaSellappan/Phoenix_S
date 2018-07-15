public class Sumnaturalnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		System.out.println("Enter the value of n:");
		Scanner nn=new Scanner(System.in);
		n =nn.nextInt();
for( int i=1;i<=n;i++) {
	sum=sum+i;
}
System.out.println(sum);
	}
}
