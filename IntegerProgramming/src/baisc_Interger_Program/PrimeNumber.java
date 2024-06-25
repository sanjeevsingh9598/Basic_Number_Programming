package baisc_Interger_Program;

public class PrimeNumber {

	public static void main(String[] args) {
	
		 int n=13,count=0;
		 if(n==1 || n==0)System.out.println(" number is not prime");
		 else if(n>1){
		     for(int i=2;i<=n/2;i++)
		     {
		         if(n%i==0)
		         {
		             count++;
		            
		         }
		       
		     }
		     if(count>0)System.out.println("number is not prime");
		     else System.out.println("no is prime");
		    
		 }

	}

}
