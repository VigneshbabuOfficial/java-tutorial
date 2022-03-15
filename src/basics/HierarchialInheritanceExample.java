package basics;

class HIParentClass {

	void parentClassMethod() {
		System.out.println("HIParentClass - parentClassMethod");
	}
}

class HIParentClass1 extends HIParentClass {

	void parentClassMethod1() {
		super.parentClassMethod();
		System.out.println("HIParentClass1 - parentClassMethod1");
	}
}

class HIParentClass2 extends HIParentClass {
	
	void parentClassMethod2() {
		super.parentClassMethod();
		System.out.println("HIParentClass2 - parentClassMethod2");
	}
}

public class HierarchialInheritanceExample{

	public static void main(String[] args) {
		
		HIParentClass1 hip1 = new HIParentClass1();

		hip1.parentClassMethod1();
		
		System.out.println("-----------------------------");
		
		HIParentClass2 hip2 = new HIParentClass2();

		hip2.parentClassMethod2();

	}

}