package Map;

import java.util.Objects;

public class Car {
	private int makeYear;
	private String name;

	public Car(int makeYear, String name) {
		super();
		this.makeYear = makeYear;
		this.name = name;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car [makeYear=" + makeYear + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + makeYear;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)) {
			return false;

		}
		if (makeYear != other.makeYear) {
			return false;
		}
		return true;
	}

}
