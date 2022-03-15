package basics;

class ParentClass {

	void parentClassMethod() {
		System.out.println("ParentClass - parentClassMethod");
	}
}

public class SingleInheritanceExample extends ParentClass {
	
	
	void parentClassMethod1() {
		
		super.parentClassMethod();
		System.out.println("SingleInheritanceExample - parentClassMethod");
	}

	public static void main(String[] args) {

		SingleInheritanceExample si = new SingleInheritanceExample();
		
		si.parentClassMethod1();
		
		
	}

}
