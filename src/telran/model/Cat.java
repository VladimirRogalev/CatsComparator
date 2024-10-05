package telran.model;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {
	private String name;
	private String breed;
	private Integer age;
	private Double weight;

	public Cat(String name, String breed, Integer age, Double weight) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public int compareTo(Cat o) {
		int res = name.compareTo(o.name);
		res = res == 0 ? age.compareTo(o.age) : res;
		return res == 0 ? weight.compareTo(o.weight) : res;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", breed=" + breed + ", age=" + age + ", weight=" + weight + "]";
	}

	public static Comparator<Cat> comparatorByName = new Comparator<Cat>() {

		@Override
		public int compare(Cat o1, Cat o2) {

			return o1.name.compareTo(o2.name);
		}

	};
	public static Comparator<Cat> comparatorByBreed = new Comparator<Cat>() {

		@Override
		public int compare(Cat o1, Cat o2) {

			return o1.breed.compareTo(o2.breed);
		}

	};
	public static Comparator<Cat> comparatorByWeightAndAge = new Comparator<Cat>() {

		@Override
		public int compare(Cat o1, Cat o2) {
			int res =o1.weight.compareTo(o2.weight);
			return res == 0 ? o1.age.compareTo(o2.age)  : res;

		}

	};

}
