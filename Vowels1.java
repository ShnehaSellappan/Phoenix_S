package Github;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
Scanner vo=new Scanner(System.in);
str=vo.next();
int count=0;
for(int i=0;i<str.length();i++) {
	count=0;
char ch1=str.charAt(i);
char ch=Character.toLowerCase(ch1);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		count++;
	}
}
if(count>=1) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
	}
}
