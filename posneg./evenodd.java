public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("Enter n:");
Scanner eo=new Scanner(System.in);
n =eo.nextInt();
	 if(n%2==0) {
		System.out.println("Even"); 
	 }
	 else if(n%2==1) {
		 System.out.println("odd");
	 }
 else {
	 System.out.println("Invalid");
}
	}

}
