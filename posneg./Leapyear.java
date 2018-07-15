public class Leapyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
Scanner ly=new Scanner(System.in);
year =ly.nextInt();
if(((year%4==0) && (year%100!=0))|| ((year%400==0) && (year%100==0))) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
	}

}
