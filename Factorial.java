public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5,i,fac=1;
Scanner rs=new Scanner(System.in);
n =rs.nextInt();
for(i=n;i>=1;i--) {
	fac=fac*i;
}
System.out.println(fac);
	}
}
