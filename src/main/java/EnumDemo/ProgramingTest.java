package EnumDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;

public class ProgramingTest {
	public static void main(String[] args) {
		EnumMap<Tutorial, String> map = new EnumMap<>(Tutorial.class);
		
		map.put(Tutorial.Java," 1");
		map.put(Tutorial.Html, "2");
		map.put(Tutorial.Css, "3");
		map.put(Tutorial.JavaScript, "4");
		map.put(Tutorial.Python, "5");
		
		System.out.println(map);
		Collection<String> values = map.values();
		System.out.println("Values: "+values);
	}

}
