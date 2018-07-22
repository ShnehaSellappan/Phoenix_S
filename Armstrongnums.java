public class Armstrongnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,count=0,r=1,r1,bas,exp,i1;
		double res=0;
		Scanner pn=new Scanner(System.in);
		num =pn.nextInt();
		int m=pn.nextInt();
		for(i=num+1;i<m;i++) {
			i1=i;
			count=0;
			res=0;
		while(i1!=0){
			i1=i1/10;
			count++;
		}
		i1=i;
		while(i1!=0){
			r1=i1%10;
		  res=res+Math.pow(r1,count);
			i1=i1/10;
		}
		int res1=  (int) res;
		i1=i;
		if(i1==res) 
			System.out.println(res1);
		
		}
       	}
}
