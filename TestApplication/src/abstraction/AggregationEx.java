package abstraction;

class Operation{
	int square(int a){
		return a*a;
	}
	
}
class Circle implements Abc{
	Operation o;
	double pi=3.14;
	double area(int radius){
		o=new Operation();
		int sq= o.square(radius);
		return sq*pi;
	}
	@Override
	public void print() {
	System.out.println("print");
		
	}
	@Override
	public void show() {
	System.out.println("show");
		
	}
	
}
public class AggregationEx  {
   
	public static void main(String[] args) {
				Circle c=new Circle();
		double ar= c.area(5);
		System.out.println(ar);
		c.show();
		c.print();

	}

}

interface Abc{
	int a=4;
	 void print();
	 void show();
}

