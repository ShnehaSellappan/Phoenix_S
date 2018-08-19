package Github_Pro;
import java.util.Scanner;
public class Reverse_voweleli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S;
System.out.println("Enter S :");
Scanner rs=new Scanner(System.in);
S=rs.nextLine();
String str=new StringBuffer(S).reverse().toString();
String s1=str.replaceAll("[AEIOUaeiou]","");
System.out.print(s1);
	}
}
