public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s;
    char ch;
    Scanner vo=new Scanner(System.in);
    ch =vo.next().charAt(0);
    char s1=Character.toLowerCase(ch);
    if(s1=='a' ||s1=='e' || s1=='i' || s1=='o' || s1=='u') {
    	System.out.println("Vowel");
    }
    else if(s1>=97 && s1<=121) {
    	System.out.println("Consonant");
    }
    else {
    	System.out.println("Invalid");
    }
	}

}
