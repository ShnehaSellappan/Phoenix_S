public class Sumofkint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n,k,i,sum=0;
  System.out.println("n:");
  System.out.println("Enter k:");
  System.out.println("Elements:");
  Scanner nk=new Scanner(System.in);
  n =nk.nextInt();
  k =nk.nextInt();
  int a[]=new int[n];
for(i=0;i<a.length;i++) {
	a[i] =nk.nextInt();
}
for(i=0;i<k;i++) {
	sum=sum+a[i];
}
System.out.println(sum);
	}
}
