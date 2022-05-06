package com.bridgelabz.birdsanctuary;

import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.birdsanctuary.Bird.Color;

public class Main {
	
	BirdsRepository birdRepo = BirdsRepository.getInstance();
	static UserInterface userInterface = UserInterface.getInstance();
	
	public static void main(String[] args) {
		System.out.println("Welcome to bird sanctuary !");
	
		int i = 0;
		while(i != 5) {
			int select = userInterface.showMainMenu();
			Main main = new Main();
			main.handleUserSelection(select);
		}
	}

	public void addBird() {
		Scanner sc = new Scanner(System.in);
		Bird bird = new Bird();
		System.out.println("Enter the bird id: ");
		String bId = sc.nextLine();
		bird.setBirdId(bId);

		System.out.println("Enter the bird name: ");
		String bName = sc.nextLine();
		bird.setName(bName);

		System.out.println("Choose the bird color: ");
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
		birdRepo.addBird(bird);
		System.out.println("Bird is added successfully..");

//		UserInterface userInterface = new UserInterface();
//		userInterface.print(birdRepo.getListBirds());

//		BirdsRepository birdRepo = new BirdsRepository();
//		Duck duck = new Duck();
//		duck.birdId = "d001";
//		Penguin penguin = new Penguin();
//		penguin.birdId = "pn001";
//		Ostrich ostrich = new Ostrich();
//		ostrich.birdId = "os001";
//		Parrot parrot = new Parrot();
//		parrot.birdId = "p001";
//
//		birdRepo.addBird(duck);
//		birdRepo.addBird(penguin);
//		birdRepo.addBird(ostrich);
//		birdRepo.addBird(parrot);
//		
//		UserInterface userInterface = new UserInterface();
//		userInterface.print(birdRepo.getListBirds());
	}

	public void removeBird() {
		System.out.println("Enter the bird id for delete: ");
		Scanner sc = new Scanner(System.in);
		String bId = sc.next();

		Bird bird = birdRepo.getBirdId(bId);
		birdRepo.removeBird(bird);
		System.out.println("Bird is removed.");

	}
	
	public void updateBird() {
		Scanner sc = new Scanner(System.in);
		Bird bird = new Bird();
		System.out.println("Enter bird id to update: ");
		String birdId = sc.next();
		if(birdId.equalsIgnoreCase(bird.getBirdId())) {
			System.out.println("Enter new bird name: ");
			String birdName = sc.next();
			bird.setName(birdName);
			
			System.out.println("Choose the bird color: ");
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
			BirdsRepository birdRepo = new BirdsRepository();
			birdRepo.addBird(bird);

//			UserInterface userInterface = new UserInterface();
//			userInterface.print(birdRepo.getListBirds());
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
		}
	}

}
