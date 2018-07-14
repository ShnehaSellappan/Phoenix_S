public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch;
Scanner alp=new Scanner(System.in);
ch =alp.next().charAt(0);
if(Character.isAlphabetic(ch)) {
	System.out.println("Alphabet");
}
else {
	System.out.println("No");
}
	}

}
