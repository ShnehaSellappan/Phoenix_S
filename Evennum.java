public class Evennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,m,i,j;
Scanner en=new Scanner(System.in);
n =en.nextInt();
m =en.nextInt();
for(i=n+1;i<m;i++) {
	if(i%2==0) {
		System.out.println(i);
	}
}
	}

}
