package com.bridgelabz.birdsanctuary;

import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.birdsanctuary.Bird.Color;

public class Main {

	static Scanner sc;
	BirdsRepository birdRepo = BirdsRepository.getInstance();
	static UserInterface userInterface = UserInterface.getInstance();
	Bird bird = new Bird();
	static boolean exit = false;

	public static void main(String[] args) {
		System.out.println("Welcome to bird sanctuary !");

		while (!exit) {
			int select = userInterface.showMainMenu();
			Main main = new Main();
			main.handleUserSelection(select);
		}
	}

	public void addBird() {
		sc = new Scanner(System.in);
		System.out.println("Enter the bird id: ");
		String bId = sc.nextLine();
		bird.setBirdId(bId);

		System.out.println("Enter the bird name: ");
		String bName = sc.nextLine();
		bird.setName(bName);

		System.out.println("Choose the bird color: ");
		chooseColor();
		birdRepo.addBird(bird);
		System.out.println("Bird is added successfully..");
	}

	public void removeBird() {
		sc = new Scanner(System.in);
		System.out.println("Enter the bird id for delete: ");
		String bId = sc.next();

		Bird bird = birdRepo.getBirdId(bId);
		birdRepo.removeBird(bird);
		System.out.println("Bird is removed.");

	}

	public void updateBird() {
		sc = new Scanner(System.in);
		System.out.println("Enter bird id to update: ");
		String birdId = sc.next();
		bird.setBirdId(birdId);

		if (bird.getBirdId().equalsIgnoreCase(birdId)) {
			boolean exit = false;
			while (!exit) {
				sc = new Scanner(System.in);
				System.out.println("1.Bird name\n2.Choose color\n3.Quit");
				System.out.println("-----------Enter the option-------------");
				int options = sc.nextInt();

				switch (options) {
				case 1:
					System.out.println("Enter new bird name: ");
					String birdName = sc.next();
					bird.setName(birdName);
					break;
				case 2:
					System.out.println("Choose the bird color: ");
					chooseColor();
					break;
				case 3:
					exit = true;
				default:
					System.out.println("Invalid option.");
				}
				birdRepo.removeBird(bird);
				birdRepo.addBird(bird);
				System.out.println("Bird is Updated successfully.");
			}

		}
	}

	public void chooseColor() {
		sc = new Scanner(System.in);
		System.out.println("1.BLACK\n2.WHITE\n3.BROWN\n4.YELLOW\n5.GREEN");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			bird.setColor(Color.BLACK);
			break;
		case 2:
			bird.setColor(Color.WHITE);
			break;
		case 3:
			bird.setColor(Color.BROWN);
			break;
		case 4:
			bird.setColor(Color.YELLOW);
			break;
		case 5:
			bird.setColor(Color.GREEN);
			break;
		default:
			System.out.println("Invalid option.");
		}
	}

	public void handleUserSelection(int op) {
		switch (op) {
		case 1:
			addBird();
			break;
		case 2:
			removeBird();
			break;
		case 3:
			updateBird();
			break;
		case 4:
			Set<Bird> birdList = birdRepo.getListBirds();
			userInterface.print(birdList);
			break;
		case 5:
			exit = true;
			System.out.println("*********** Thank you ***********");
		}
	}

}
