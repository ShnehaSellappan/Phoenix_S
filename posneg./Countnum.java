public class Numbercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,rem,count=0;
System.out.println("Enter n nalue:");
Scanner nc=new Scanner(System.in);
n =nc.nextInt();
while(n!=0) {
	rem=n%10;
	count++;
	n=n/10;
}
System.out.println(count);
}
}
