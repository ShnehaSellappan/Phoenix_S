public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("Enter n:");
Scanner eo=new Scanner(System.in);
n =eo.nextInt();
 if(n>=0) {
	 if(n%2==0) {
		System.out.println("Even"); 
	 }
	 else {
		 System.out.println("odd");
	 }
 }
 else {
	 System.out.println("Invalid");
}
	}

}
