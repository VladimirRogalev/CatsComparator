package telran.model;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Cat[] cats = { new Cat("Whiskers", "Siamese", 3, 4.5), new Cat("Tom", "Persian", 5, 5.0),
				new Cat("Felix", "Maine Coon", 2, 6.0), new Cat("Felix", "Bengal", 4, 4.0),
				new Cat("Garfield", "Tabby", 6, 6.5)
		};
		
		Arrays.sort(cats);
		System.out.println("Sorted by natural order: ");
		printCats(cats);
		
		System.out.println("Sorted by name : ");
		Arrays.sort(cats, Cat.comparatorByName);
		printCats(cats);
		
		System.out.println("Sorted by breed : ");
		Arrays.sort(cats, Cat.comparatorByBreed);
		printCats(cats);

		System.out.println("Sorted by weight : ");
		Arrays.sort(cats, Cat.comparatorByWeightAndAge);
		printCats(cats);
	}

	public static void printCats(Cat[] cats) {
		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i]);
		}
	}

}
