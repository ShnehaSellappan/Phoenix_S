import java.util.Scanner;
public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N;
Scanner rn=new Scanner(System.in);
N =rn.nextInt();
String s=String.valueOf(N);
String s1=new StringBuffer(s).reverse().toString();
int N1=Integer.parseInt(s1);
System.out.println(s1);
	}

}
