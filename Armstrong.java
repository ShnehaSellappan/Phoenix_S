public class Armstrong {

	public static void main(String[] args) {
int N,i,count=0,r=1,r1,bas,exp,r3=0;
double res=0;
Scanner pn=new Scanner(System.in);
N =pn.nextInt();
bas=N;
		if(bas<=100000) {
while(bas!=0){
	r=bas%10;
	count++;
	bas=bas/10;
}
exp=count;
bas=num;
while(bas!=0){
	r1=bas%10;
  res=res+Math.pow(r1,exp);
	bas=bas/10;
}
int res1=  (int) res;
if(N==res1) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
  }
}
}
