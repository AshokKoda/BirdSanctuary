package com.bridgelabz.birdsanctuary;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to bird sanctuary !");

		UserInterface userInterface = new UserInterface();
		int select = userInterface.showMainMenu();

		Main main = new Main();
		main.handleUserSelection(select);
	}

	public void addBird() {
		BirdsRepository birdRepo = new BirdsRepository();
		Duck duck = new Duck();
		duck.birdId = "d001";
		Penguin penguin = new Penguin();
		penguin.birdId = "pn001";
		Ostrich ostrich = new Ostrich();
		ostrich.birdId = "os001";
		Parrot parrot = new Parrot();
		parrot.birdId = "p001";

		birdRepo.addBird(duck);
		birdRepo.addBird(penguin);
		birdRepo.addBird(ostrich);
		birdRepo.addBird(parrot);
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(birdRepo.getListBirds());
	}
	
	public void removeBird() {
		BirdsRepository birdRepo = new BirdsRepository();
		System.out.println("Enter the bird id for delete: ");
		Scanner sc = new Scanner(System.in);
		String bId = sc.next();
		
		Bird bird = birdRepo.getBirdId(bId);
		birdRepo.removeBird(bird);
		System.out.println("Bird is removed.");
		
		
	}
	
	public void printBirds() {
		
	}

	public void handleUserSelection(int op) {

		switch (op) {
		case 1:
			addBird();
			break;
		case 2:
			removeBird();
			break;
		}
	}

}
