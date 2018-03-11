class Time
{
	private int h,m,s;
	public Time()
	{
		h=0;
		m=0;
		s=0;
	}
	/*public void input(int i,int j,int k)
	{
		h=i;
		m=j;
		s=k;
	}
	public void display()
	{
		System.out.print(h+":"+m+":"+s+"\n");
	}*/
	public Time add(Time x,Time y)
	{
		Time sum=new Time();
		sum.s=x.s+y.s;
		sum.m=x.m+y.m;
		sum.h=x.h+y.h;
		if(sum.s>=60)
		{
			sum.s=sum.s-60;
			sum.m=sum.m+1;
		}
		if(sum.m>=60)
		{
			sum.m=sum.m-60;
			sum.h=sum.h+1;
		}
		return sum;
	}
	public static Time parseTime(String str)
	{
		Time t=new Time();
		String arr[]=str.split(":");
		t.h=Integer.parseInt(arr[0]);
		t.m=Integer.parseInt(arr[1]);
		t.s=Integer.parseInt(arr[2]);
		return t;
	}
	public String toString()
	{
		return (this.h+":"+this.m+":"+this.s);
	}
}
class TimeAddParseToString
{
	public static void main(String dt[])
	{
		Time t1=Time.parseTime(dt[0]);
		Time t2=Time.parseTime(dt[1]);
		Time t3;
		//t1.input(45,45,45);
		//t2.input(24,45,30);
		t3=t2.add(t1,t2);
		//t1.display();
		//t2.display();
		//t3.display();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}+