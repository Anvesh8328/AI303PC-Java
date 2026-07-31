class LAB2Prog2
{
	public static void main(String[] args)
	{
		byte b = 10;
		short s = 234;
		int i = 12;
		long l = 1234;
		float f = 12.5f;
		double d = 1234.5432;

		float fb = b;
		byte bf = (byte)l;
		double ds = i;
		int ik = (int)d;
		long la = (long)d;
		IO.println("byte to float:" +fb);
		IO.println("long to byte:" +bf);
		IO.println("int to double:" +ds);
		IO.println("double to int:" +ik);
		IO.println("double to long:" +la);
	}
}