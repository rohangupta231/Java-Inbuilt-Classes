import java.math.BigDecimal;
import java.math.MathContext;
class PiValue
{
	public static void main(String dt[])
	{
		MathContext mc1 = new MathContext(10000);
		float a=22/7F;
		System.out.println(a);
		BigDecimal b1=new BigDecimal(a,mc1);
		BigDecimal b2=b1.round(mc1);
		System.out.println(b1);
		System.out.println(b2);
	}
}