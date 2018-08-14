package GitHub_set1r;
import java.util.Scanner;
public class Holiday {

	public static void main(String[] args) {
	String day;
	System.out.println("Enter Day:");
	Scanner hd=new Scanner(System.in);
	day=hd.next();

if(day.equalsIgnoreCase("Monday") ||day.equalsIgnoreCase("Tuesday") ||day.equalsIgnoreCase("Wednesday") ||day.equalsIgnoreCase("Thursday") ||day.equalsIgnoreCase("Friday")) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
}
}
