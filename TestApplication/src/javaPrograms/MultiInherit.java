package javaPrograms;

class DrawClass{
	void draw(){
		System.out.println("Show in Class");		
	}
}

  public class MultiInherit extends DrawClass implements Draw {
   public void draw(){
	   System.out.println("111");
   }
	public static void main(String[] args) {
		MultiInherit mi=new MultiInherit();

		mi.draw();
		
	}
	@Override
	public int square(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int cube(int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
