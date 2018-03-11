class TestingInnerClasses
{
	public static void main(String dt[])
	{
		System.out.println(" "+Math.PI);
		System.out.println(" "+Math.E);
		System.out.print(" "+Math.log(Math.E));
		System.out.println(" "+Math.pow(2,3));
		System.out.println(" "+Math.round(Math.E));
		System.out.println(" "+Math.nextAfter(4,3));
		String str= new String("Hello");
		char c[]={'h','e','l','l','o'};
		//String str1= new String(c[]);
		//String str2= new String(c[],0,3);
		String str3= "hello";
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.charAt(1));
		System.out.println(str.equals(str3));
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(str.compareTo(str3));
		System.out.println(str.indexOf('e'));
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.substring(1,4));
		System.out.println(str.concat(str3));
		System.out.println(str.replace('l','L'));
		System.out.println(str.replaceAll(str,str3));
	}
}