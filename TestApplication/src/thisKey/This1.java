package thisKey;

class A{
	This1 bs;
	A(This1 bs){
		this.bs=bs;
	}
	void display(){
		System.out.println(bs.a);
	}
}
public class This1 {
int a=2;

This1(){
	A aa=new A(this);
	aa.display();
}

public static void main(String... args){
	This1 b = new This1();
}
}
