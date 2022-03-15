package basics;

public class OpertorsExample {

	public static void main(String args[]) {

		// Unary Operator Example: ++ and -- -->> starts

		int x1 = 10;
		int x2 = 10;
		int x3 = 10;
		int x4 = 10;

		System.out.println(" x1 = " + x1 + "  x1++ = " + x1++);// 10 (11)
		System.out.println(" x2 = " + x2 + "  ++x2 = " + (++x2));// 12
		System.out.println(" x3 = " + x3 + "  x3-- = " + x3--);// 12 (11)
		System.out.println(" x4 = " + x4 + "  --x4 = " + (--x4));// 10

		// Unary Operator Example: ++ and -- -->> ends

		// Shift Operator starts

		System.out.println(10 << 2);// 10*2^2=10*4=40 ==>> 1010 -> 0010 1000
		System.out.println(10 << 3);// 10*2^3=10*8=80 ==>> 1010 -> 0101 0000
		System.out.println(20 << 2);// 20*2^2=20*4=80
		System.out.println(15 << 4);// 15*2^4=15*16=240

		System.out.println(10 >> 2);// 1010 -> 0010 --> 2 , 10/(2^2)=10/4 = 2
		System.out.println(10 >> 3);// 1010 -> 0001 --> 1 , 10/(2^3)=10/8 = 1

		// Shift Operator ends

		// Logical and Bitwise Operator starts

		// The logical && operator doesn't check the second condition if the first
		// condition is false. It checks the second condition only if the first one is
		// true.

		// The bitwise & operator always checks both conditions whether first condition
		// is true or false.

		// The logical || operator doesn't check the second condition if the first
		// condition is true. It checks the second condition only if the first one is
		// false.

		// The bitwise | operator always checks both conditions whether first condition
		// is true or false.

		// Logical and Bitwise Operator ends

	}
}
