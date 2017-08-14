package abstraction;

public class Abs {
	interface MathOp {
		int mathDo(int a, int b);
	}
	
	int operate(int a, int b, MathOp m){
		return m.mathDo(a, b);
	}
	
	public static void main(String... args){
		Abs ab=new Abs();
		MathOp add=(a,b)->a+b;
		MathOp sub=(a,b)->a-b;
		MathOp mul=(a,b)->a*b;
		
		System.out.println(ab.operate(50, 20, add));
		System.out.println(ab.operate(50, 20, sub));
		System.out.println(ab.operate(50, 20, mul));
	} 
}