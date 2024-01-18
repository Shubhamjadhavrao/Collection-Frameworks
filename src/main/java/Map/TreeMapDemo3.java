package Map;

import java.util.TreeMap;

public class TreeMapDemo3 {
	public static void main(String[] args) {
		Car car1 = new Car(1234,"AAA");
		Car car2 = new Car(2311,"BBB");
		Car car3 = new Car(2020,"CCC");
		Car car4 = new Car(2023,"DDD");
		
//		TreeMap<Car, String> tree = new TreeMap<>(new carNameComparator());
		TreeMap<Car, String> tree = new TreeMap<>(new carYearComparator());

		tree.put(car1, "Shubham");
		tree.put(car2, "Vardhan");
		tree.put(car3, "Ram");
		tree.put(car4,"Sham");

		System.out.println(tree);

	}

}
