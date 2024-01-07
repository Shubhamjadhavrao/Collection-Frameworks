package Vector;

import java.util.Vector;

public class VectorDemo3 {

	public static void main(String[] args) {
		Vector vector = new Vector(4,7);

		vector.add(1234);
		vector.add("shubham");
		vector.add("Ram");
		vector.add("Hii");
		vector.add("aaa");
		vector.add(1234);
		vector.add("shubham");
		vector.add("Ram");
		vector.add("Hii");
		vector.add("aaa");
		vector.add("ZZZ");

		System.out.println("Size:" + vector.size());
		System.out.println("Capacity:" + vector.capacity());
	}

}
