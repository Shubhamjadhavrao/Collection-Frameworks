package EnumDemo;

import java.util.EnumMap;
import java.util.Map;

public class TestPlanet {
	public static void main(String[] args) {
		EnumMap<Planet, String>planet = new EnumMap<>(Planet.class);
		planet.put(Planet.MERCURY, "Closet to Sun");
		planet.put(Planet.JUPITER, "Largest Planet");
		planet.put(Planet.VENUS, "Hot Planet");
		
		System.out.println(planet);
		
//		Getting value of From planet
		System.out.println(planet.get(Planet.MERCURY));
//		Checking key or value in planet
		System.out.println(planet.containsKey(Planet.JUPITER));
		System.out.println(planet.containsValue("Red Planet"));
		
		planet.remove(Planet.MERCURY);
		System.out.println(planet);
		
		System.out.println(planet.size());
		
//		Itrating over the planet 
		
		for(Map.Entry<Planet, String> entry : planet.entrySet()) {
			System.out.println(entry.getKey()+  "::" +entry.getValue());
			
		}
	}

}
