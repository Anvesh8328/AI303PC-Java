class Parent{
	static int a;
	public int display( int val){
		a=val;
		return a;
	}
}
public class Child extends Parent{
	public static void main(String...args){
		Child ch = new Child();
		a=20;
		System.out.println(ch.display(ch.a));
		System.out.println(Child.class.isInstance(ch));
	}
}