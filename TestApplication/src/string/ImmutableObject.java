package string;

class Immutables {

	int a;
	String s;
	Demo d;
	private Immutables(int a, String s, Demo d) {
		super();
		this.a = a;
		this.s = s;
		this.d = new Demo(d.getD());
	}
	
	public static Immutables InitializeObj(int a, String s, Demo d){
		return new Immutables(a,s,d);
	}
	
	public int getA() {
		return a;
	}
	public String getS() {
		return s;
	}
	public Demo getD() {
		return new Demo(d.getD());
	}
	
	public String toString(){
		return "["+a+" : "+s+" : "+d.getD()+"]";
	}
	
}

class Demo {
	int d;
	public Demo(int d){
		this.d=d;
	}
	
	public int getD() {
		return d;
	}
}

public class ImmutableObject{
	public static void main(String[] args) {
		 Immutables im = Immutables.InitializeObj(1,"Hello",new Demo(10));
		 System.out.println(im);
		 modification(im.getA(),im.getS(),im.getD());
		 System.out.println(im);
	}
	private static void modification(int a, String s, Demo d){
		a=10;
		s="Changed";
		d = new Demo(20);
	}
	
}
