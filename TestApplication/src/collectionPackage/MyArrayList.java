package collectionPackage;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList{

	private Object[] myStore;
	private int actSize = 0;

	public MyArrayList() {
		myStore = new Object[10];
	}

	public Object get(int index) {
		if (index < actSize) {
			return myStore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void add(Object obj) {
		if (myStore.length - actSize <= 5) {
			increseListSize();
		}
		myStore[actSize++] = obj;

	}

	private void increseListSize() {
		myStore = Arrays.copyOf(myStore, myStore.length * 2);
	}
	
	public int size(){
		return actSize;
	}
	
	public Object remove(int index){
		if(index<actSize){
			Object obj = myStore[index];
			myStore[index] = null;
			int temp = index;
			while(temp<actSize){
				myStore[temp] = myStore[temp+1];
				myStore[temp+1]=null;
				temp++;				
			}
			actSize--;
			return obj;
					
		}
		else
			return new ArrayIndexOutOfBoundsException();
	}
	

	public static void main(String[] args) {
		MyArrayList ma = new MyArrayList();
		ma.add("Hello");
		ma.add("World");
	
		System.out.println("Element 1"+ma.get(1));
		System.out.println("Removing 0"+ma.remove(0));
		
		System.out.println("Size :"+ma.size());
		
	}



}
