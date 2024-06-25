package baisc_Interger_Program;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=153,rem,sum=0;
		 int temp=a;
		 while(a>0){
		 int mod=a%10;
//		 System.out.println(mod);
		 sum=sum+(mod*mod*mod);
//		 System.out.println(sum);
		 a=a/10;
		 }
		 if(sum==temp)System.out.println("number is Amstrong");
		 else System.out.println("number is not Amstrong");

	}

}
