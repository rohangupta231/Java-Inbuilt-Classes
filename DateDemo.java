import java.util.Date;
class DateDemo
{
	public static void main(String dt[])
	{
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getTime());//1-Jan-1970
		System.out.println(d.getYear());//difference add 1900
		System.out.println(d.getMonth());//stored in array
		System.out.println(d.getDate());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getDay());//0 is Sunday 6 is Saturday
	}
}