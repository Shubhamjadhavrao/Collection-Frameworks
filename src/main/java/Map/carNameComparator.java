package Map;

import java.util.Comparator;

public class carNameComparator implements Comparator <Car> {

	@Override
	public int compare(Car c1, Car c2) {
		
		return c1.getName().compareTo(c2.getName());
	}

}
