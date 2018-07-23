public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N,i,fac=1;
Scanner fn=new Scanner(System.in);
N =fn.nextInt();
if(N<=20) {
	for(i=N;i>=1;i--) {
		fac=fac*i;
	}
}
System.out.println(fac);
	}

}
