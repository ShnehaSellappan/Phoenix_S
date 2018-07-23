public class Minelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		System.out.println("Enter N:");
		Scanner me=new Scanner(System.in);
		N =me.nextInt();
		int i,min;
		int a[]=new int[N];
		for(i=0;i<N;i++) {
			a[i]=me.nextInt();
		}
		min=a[0];
		for(i=1;i<N;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
