class FinalDemo{
	final static int x = 5;

	final public static void display(){
		System.out.println("Hiiii");
	}
	public static void main(String...args){

		IO.println(x);
		x = 10;
		IO.println(x);
		display();
	}
}