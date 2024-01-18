package Map;

import java.util.Comparator;

public class carYearComparator implements Comparator <Car> {

	@Override
	public int compare(Car c1, Car c2) {
		if(c1.getMakeYear()==c2.getMakeYear())
		return 0;
		else
			if(c1.getMakeYear()<c2.getMakeYear())
				return 1;
			else
				return -1;
		
	}

}
