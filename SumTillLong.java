import java.math.BigInteger;
class SumTillLong
{
	public static void main(String dt[])
	{
		long i,a=9223372036854775807L;
		BigInteger bi=BigInteger.valueOf(1);
		for(i=0;i<=a;i++)
		{
			bi=bi.add(BigInteger.valueOf(i));
			//System.out.print("a");
		}
		System.out.println(bi);
	}
}