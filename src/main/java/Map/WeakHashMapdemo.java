package Map;

import java.util.WeakHashMap;

public class WeakHashMapdemo {
	public static void main(String[] args) {
		Car car1 = new Car(1997, "RolsRoys");
		Car car2 = new Car(2020, "Maruti");
		Car car3 = new Car(1997, "Suzuki");
		Car car4 = new Car(2023, "Comet");
		Car car5 = car2;
		 
		WeakHashMap<Car, String> wm = new WeakHashMap<>();
		wm.put(car1, "AAAA");
		wm.put(car2, "BBBB");
		wm.put(car3, "CCCC");
		wm.put(car4, "DDDD");
		wm.put(car5, "EEEE");
		
		System.out.println("Before Gc: "+wm);
	
		car4=null;
		System.gc();
		System.out.println("After GC: "+wm);
	}

}
