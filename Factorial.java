import java.math.BigInteger;
class Factorial
{
	public static void main(String dt[])
	{
		int n=1000;
		BigInteger fact=BigInteger.valueOf(1);
		
		if(n==0)                                                                                                                                                                      
		{
			System.out.println("Factorial is 1");
		}
		else if(n==1)
		{
			System.out.println("Factorial is 1");
		}
		else
		{
			int i=1;
			while(i<=n)
			{
				//fact=fact*i;
				fact=fact.multiply(BigInteger.valueOf(i));//one is passed through this and other is passed in arugment but first it is conerted into BigInteger object with help of valueOf() 
				i++; 
			}
			System.out.print("Factorial is "+fact);
		}
	}
}