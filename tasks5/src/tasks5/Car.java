package tasks5;

public class Car {
	public String name;
	public int year;
	public int capasity;

	public Car(String name, int year, int capasity) {
		this.name = name;
		this.year = year;
		this.capasity = capasity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCapasity() {
		return capasity;
	}

	public void setCapasity(int capasity) {
		this.capasity = capasity;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + ", capasity=" + capasity + "]";
	}

}
