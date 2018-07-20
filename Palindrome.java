public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,r,q = 0,k=0,s,l;
Scanner pl=new Scanner(System.in);
n =pl.nextInt();
s=n;
while(n!=0) {
	r=n%10;
    n=n/10;
   q=q*10+r;
}
if(s==q) {
System.out.println("R");
	}
else {
	System.out.println("p");
}
	}
}
