class Parent{
	static int a;
	public static int display( int val){
		a=val;
		return a;
	}
}
public class Child extends Parent{
	public static void main(string...args){
		a=20;
		system.out.println(display(a));
	}
}