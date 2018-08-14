package GitHub_set1r;
import java.util.Scanner;
public class CountSpace {

	public static void main(String[] args) {
	String str;
	int count=0;
	System.out.println("Entert str:");
	Scanner cw=new Scanner(System.in);
	str=cw.nextLine();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch==' ') {
		 count++;	
		}
	}
	System.out.println(count);
	}
}
