package com.bridgelabz.birdsanctuary;

public class Bird {
	enum Color {
		BLACK, WHITE, BROWN, YELLOW, GREEN
	}

	String name;
	Color color;
	String birdId;

	void eat() {
		System.out.println(getClass().getSimpleName() + " can eat");
	}

	void fly() {
		System.out.println(getClass().getSimpleName() + " can fly !");
	}

	void swim() {
		System.out.println(getClass().getSimpleName() + " can swim !");
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", color=" + color + ", birdId=" + birdId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birdId == null) ? 0 : birdId.hashCode());
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
		Bird other = (Bird) obj;
		if (birdId == null) {
			if (other.birdId != null)
				return false;
		} else if (!birdId.equals(other.birdId))
			return false;
		return true;
	}

}
