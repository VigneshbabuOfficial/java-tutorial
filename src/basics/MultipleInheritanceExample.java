package basics;


interface MInterface {
	
	default void interfaceMethod() {
		System.out.println("MInterface - interfaceMethod");
	};
}

interface MInterface1 {
	
	default void interfaceMethod1() {
		System.out.println("MInterface1 - interfaceMethod1");
	};
}

interface MInterface2 extends MInterface,MInterface1 {
	
	public default void interfaceMethod2() {
		interfaceMethod();
		interfaceMethod1();
	};
}

class MInterfaceClass  implements MInterface2{
	
	void mInterfaceClassMethod() {
		interfaceMethod2();
		System.out.println("MInterfaceClass - mInterfaceClassMethod");
	}
	
}


public class MultipleInheritanceExample{
	
	public static void main(String[] args) {
		
		MInterfaceClass ml = new MInterfaceClass();
		ml.mInterfaceClassMethod();
		System.out.println("MultipleInheritanceExample - main");
		
	}
	
}
