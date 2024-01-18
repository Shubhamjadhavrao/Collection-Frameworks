package Generics;


public class Box<T> {
	private T t;

	public void add(T t) {
	
		this.t = t;
	}

	public T getT() {
		return t;
	}
public static void main(String[] args) {
		
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		
		integerBox.add(28);
		stringBox.add("Shubham");
		
		System.out.println("Box Integer is :"+integerBox.getT());
		System.out.println("Box String is :"+stringBox.getT());
				
	}
	 
}

