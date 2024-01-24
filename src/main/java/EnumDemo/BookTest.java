package EnumDemo;

import java.awt.print.Book;
import java.util.EnumMap;
import java.util.Map;

public class BookTest {
	public enum Key {
		One, Two, Three

	};

	public static void main(String[] args) {
		EnumMap<Key, Books> map = new EnumMap<>(Key.class);
		Books b1 = new Books(101, "Java", "Games Gosling", "BPG", 2);
		Books b2 = new Books(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Books b3 = new Books(103, "Operating System", "Galvin", "Wiley", 6);

		map.put(Key.One, b1);
		map.put(Key.Two, b2);
		map.put(Key.Three, b3);

		for (Map.Entry<Key, Books> entry : map.entrySet()) {
			Books b = entry.getValue();
			System.out.println(b.id + " " + b.name + " " + b.Author + " " + b.Publihsher + " " + b.Quantity);
		}

	}

}
