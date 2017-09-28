package javaPrograms;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	abstract void draw();
}
class Circle extends Shape{
	public void draw(){		
	System.out.println("Circle");
	}
}
class Rectangle extends Shape{
	public void draw(){
		System.out.println("Rectangle");
	}
}

public class GenericsExample {
    
	public static void displayShape(List <? extends Shape> list){
		for (Shape s : list){
	s.draw();
		}
	}
	public static void main(String[] args) {
	 List<Shape> li=new ArrayList<>();
	 li.add(new Circle());
	 List<Shape> lii=new ArrayList<>();
	 lii.add(new Rectangle());
	 lii.add(new Circle());
	 
	 displayShape(li);
	 displayShape(lii);
	}

}
