package Generics;

public class Demo {
	public<T> boolean s1(T t) {
		System.out.println(t.getClass().getName());
		
		return false;
		
	}
	
	public<T extends Number> double average(T[] array) {
		double sum = 0.0;
		
		for(T element:array) {
			sum+=element.doubleValue();
		}
		return sum/array.length;
		
	}
	
	public static void main(String[] args) {
		Demo dm = new Demo();
		dm.s1("Shubham");
		
		Integer[] nums = {10,20,30,40,50};
		Long[] num2 = {10L,20L, 40L,50L,60L};
		
		System.out.println(dm.average(nums));
		System.out.println(dm.average(num2));
	}

}
