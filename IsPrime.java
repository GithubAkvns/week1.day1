package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		int i,k;
		int j = 0;
		int n = 98;
		for (i = 2; i <= n-1; i++)
		{
			 j = n%i;	
		}
		k = j;
		if (k == 0)			
			System.out.println("Given Num is not a prime number");
		else			
			System.out.println("Given Num is a prime number");
		
	}

}