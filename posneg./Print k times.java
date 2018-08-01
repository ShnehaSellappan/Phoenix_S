package Github;
import java.util.Scanner;
public class PrintKtimes {

	public static void main(String[] args) {
String s;
System.out.println("Enter the String :");
int i,k;
Scanner pk=new Scanner(System.in);
s=pk.next();
k=pk.nextInt();
for(i=0;i<k;i++) {
	System.out.println(s);
}
	}
}
