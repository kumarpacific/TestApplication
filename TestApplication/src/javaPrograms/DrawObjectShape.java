package javaPrograms;

   class DrawObj implements Draw{
	
	@Override
	public void draw() {
		System.out.println("Draw");
		
	}

	@Override
	public int square(int a) {
		
		return a*a;
	}

	@Override
	public int cube(int b) {
		// TODO Auto-generated method stub
		return b*b*b;
	}

		
}
public class DrawObjectShape {
	  protected String name = "Parent App Protected var"; 
	  public static void main(String[] args) {
		  
		DrawObj dobj=new DrawObj();
	System.out.println(dobj.cube(5));	
		dobj.draw();
		System.out.println(dobj.square(9));
	}
	
	 
;
}
