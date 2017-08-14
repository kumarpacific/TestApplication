
public class ParentApp {
	int a;
	
	ParentApp(int x) {
		 a=x;
		 System.out.println(toString());
	}
	/*void display(){
		
		System.out.println("Value of a is : "+a);
	}*/
	public String toString(){
				return "Value of a is : "+a;
	}
}
