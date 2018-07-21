public class Primenums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,m,count=0;
Scanner pn=new Scanner(System.in);
n =pn.nextInt();
m =pn.nextInt();
for(int i = n+1 ; i < m ; i++){
	count=0;
	for(int j = 2 ; j < i - 1 ; j++) {
		if(i % j == 0) {
			count++;
			break;
		}
	}
	if(count == 0) 
		System.out.println(i);
	}
  }
}
