package GitHub_set1r;
import java.util.Scanner;
public class Countcharonly {

	public static void main(String[] args) {
String str;
System.out.println("Enter str:");
Scanner cc=new Scanner(System.in);
str=cc.nextLine();
int i,count=0;
for(i=0;i<str.length();i++) {
	char ch=str.charAt(i);
	if(ch!=' ') {
		count++;
	}
}
System.out.println(count);
	}
}
