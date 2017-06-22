
public class ChildApp extends ParentApp {

	ChildApp(int x) {
		super(x);
	}

	public static void main(String[] args) {
		
		ParentApp pa = new ChildApp(98);
		ParentApp pb = new ChildApp(45);
		ParentApp pc = new ChildApp(85);
		pa.display();
		pb.display();
		pc.display();
		System.out.println("Child App");
		System.out.println("First Branch");

	}

}
