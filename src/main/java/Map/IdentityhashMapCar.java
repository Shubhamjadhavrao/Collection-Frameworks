package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityhashMapCar {
	public static void main(String[] args) {
		Car car1 = new Car(1997, "Suzuki");
		Car car2 = new Car(2020, "Maruti");
		Car car3 = new Car(1997, "Suzuki");
		Car car4 = new Car(2023, "Comet");
		Car car5 = car2;

		HashMap<Car, String> hm = new HashMap<Car, String>();
		hm.put(car1, "aaa");
		hm.put(car2, "bbb");
		hm.put(car3, "ccc");
		hm.put(car4, "ddd");
		hm.put(car5, "eee");

		System.out.println(hm);
		System.out.println("<<<<<<IdentityHashMap>>>>>");
		IdentityHashMap<Car, String> ihm = new IdentityHashMap<Car, String>();
		ihm.put(car1, "aaa");
		ihm.put(car2, "bbb");
		ihm.put(car3, "ccc");
		ihm.put(car4, "ddd");
		ihm.put(car5, "eee");
		System.out.println(ihm);

	}

}
