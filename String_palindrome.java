package Github;
import java.util.Scanner;
public class Strpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
System.out.println("Enter the String :");
Scanner ps=new Scanner(System.in);
str=ps.next();
String str1=new StringBuffer(str).reverse().toString();
if(str.equalsIgnoreCase(str1)) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
	}
}
