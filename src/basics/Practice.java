package basics;

public class Practice {

	final int a;
	final static int b;
	final int c=10;
	final static int d=100;

	{
		a = 25;
		
//		ERROR : The final field Practice.b cannot be assigned -> static TO static concept
//		b = 25;
		
//		ERROR : The final field Practice.c cannot be assigned
//		c = 25;
		
//		ERROR : The final field Practice.d cannot be assigned
//		d = 25;
	}

	static {
		
//		ERROR : Cannot make a static reference to the non-static field a
//		a = 25;
		
		b = 25;
		
//		ERROR : Cannot make a static reference to the non-static field c
//		c = 25;
		
//		ERROR : The final field Practice.d cannot be assigned
//		d = 25;
	}

	private void assign() {
		
//		ERROR : The final field Practice.a b c d cannot be assigned
//		a = 25;
//		b = 25;
//		c = 25;
//		d = 25;
		
	}

	public static void main(String[] args) {
		
//		ERROR : Cannot make a static reference to the non-static field a
//		a = 25;
		
//		ERROR : The final field Practice.b cannot be assigned
//		b = 25;
		
//		ERROR : Cannot make a static reference to the non-static field c
//		c = 15;
		
//		ERROR : The final field Practice.d cannot be assigned
//		d = 15;
		
	}

}
