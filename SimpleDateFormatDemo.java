import java.util.Date;
import java.text.SimpleDateFormat;
class SimpleDateFormatDemo
{
	public static void main(String dt[])
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/YYYY hh:mm:ss");
		Date d=new Date();
		String str=sdf.format(d);
		System.out.println(str);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		String str1="30/10/1997";
		try
		{
			Date d1= sdf1.parse(str1);//checked exception
			System.out.println(d1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}