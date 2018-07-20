public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N,i,count=0;
Scanner rs=new Scanner(System.in);
N =rs.nextInt();
if(N<=1000) {
	for(i=2;i<=N/2;i++) {
		if(N%i==0) {
			count++;
		}
	}
	if(count>1){
		System.out.println("No");
	}
	else{
		System.out.println("Yes");
	}
} 
	}
}
