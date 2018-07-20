public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,pwr,ans,i,m=1;
System.out.println("Enter num,pwr:");
Scanner np=new Scanner(System.in);
num =np.nextInt();
pwr =np.nextInt();
if(num>0 && pwr==0){
	System.out.println("1");
}
else if(num==0 && pwr>0) {
System.out.println("0");
	}
	else {
		for(i=1;i<=pwr;i++) {
			m=m*num;
		}
		System.out.println("m="+m);
	}
	}
}
