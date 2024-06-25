package baisc_Interger_Program;

public class FabonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=0,b=1,c=0,n=10;
		 for(int i=1;i<=n;i++){
		     System.out.println(c);
		  c=a+b;
		  a=b;
		  b=c;
		 }
	}

}
