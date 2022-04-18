package tech.donho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Double> doubles = new ArrayList<>();

	public static void createNonCollectibleObjects() {
		for (int i = 0; i < 10_000_000; i++) {
			doubles.add(Math.random());
		}

		System.out.println("Created non-garbage collectible objects");
	}

	public static void releaseNonCollectibleObjects() {
		doubles = new ArrayList<>();

		System.out.println("Released non-garbage collectible objects");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("[1] Create objects\t[2] Release objects\t[0] Exit");
			int option = scanner.nextInt();
			switch (option) {
				case 1:
					createNonCollectibleObjects();
					break;
				case 2:
					releaseNonCollectibleObjects();
					break;
				case 0:
					System.exit(0);
			}
		}
	}
}
