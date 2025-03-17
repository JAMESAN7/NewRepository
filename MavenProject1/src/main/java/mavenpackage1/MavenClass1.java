package mavenpackage1;

public class MavenClass1 {
int a;
	public static void main(String[] args) {
		System.out.println(MavenClass1.param1(2,3));
		MavenClass1 mc=new MavenClass1("Hello");
		MavenClass1 mc1=new MavenClass1(5);
	mc1.instancemethod(3);
	mc1.instancemethod2();
		
	}
	public static int param1(int a , int b)
	{
		int c=a+b;
		return c;
	}
 public MavenClass1(String s)
 {
	
	System.out.println(s);
 }
 public MavenClass1(int a)
 {
	this.a=a;
	System.out.println(a);
 }
 public void instancemethod( int b)
 {
	int m=a*b;
	System.out.println(m);
 }
 public void instancemethod2()
 {
	
	System.out.println(a);
 }
}
