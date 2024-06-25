package baisc_Interger_Program;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=1234321,rem,rev=0,t=a;
		 while(a>0){
		 rem=a%10;
		 rev=(rev*10)+rem;
		 a=a/10;
		 }
		 System.out.println(rev);
		 if (rev==t)System.out.println("number is palindrom");
		 else System.out.println("number is not palindrom");
	}

}
