public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1,n2,n3;
Scanner gn=new Scanner(System.in);
n1 =gn.nextInt();
n2 =gn.nextInt();
n3 =gn.nextInt();
if(n1>n2 && n1>n3) {
	System.out.println(n1);
}
else if(n2>n1 && n2>n3) {
	System.out.println(n2);
}
else {
	System.out.println(n3);
}
	}

}
