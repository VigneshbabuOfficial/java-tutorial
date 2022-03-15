package basics;

class MLParentClass {

	void parentClassMethod() {
		System.out.println("MLParentClass - parentClassMethod");
	}
}

class MLParentClass1 extends MLParentClass {

	void parentClassMethod1() {
		super.parentClassMethod();
		System.out.println("MLParentClass1 - parentClassMethod1");
	}
}

class MLParentClass2 extends MLParentClass1 {
	
	void parentClassMethod2() {
		super.parentClassMethod1();
		System.out.println("MLParentClass2 - parentClassMethod2");
	}
}

public class MultilevelInheritanceExample{

	public static void main(String[] args) {
		
		MLParentClass2 mlp = new MLParentClass2();

		mlp.parentClassMethod2();

	}

}