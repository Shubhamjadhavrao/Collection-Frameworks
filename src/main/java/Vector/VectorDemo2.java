package Vector;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector vector = new Vector<>();

		vector.add(1234);
		vector.add("shubham");
		vector.add("Ram");
		vector.add("Hii");
		vector.add("aaa");

		System.out.println("Size:" + vector.size());
		System.out.println("Capacity:" + vector.capacity());
	}

}
