package thisKey;

class B{
	

	B getB(){
		return this;		
	}
	void add(){
		System.out.println("Passed this");
		
	}
}

public class This2 {

	public static void main(String[] args) {
		new B().getB().add();

	}

}
