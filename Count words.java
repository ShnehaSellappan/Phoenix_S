package GitHub_set1r;
import java.util.Scanner;
public class Countwords {

	public static void main(String[] args) {
String str;
System.out.println("Entert str:");
Scanner cw=new Scanner(System.in);
str=cw.nextLine();
String s[]=str.split(" ");
	System.out.println(s.length);
	}
}
