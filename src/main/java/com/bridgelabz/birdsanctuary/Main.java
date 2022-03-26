package com.bridgelabz.birdsanctuary;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to bird sanctuary !");

		Duck duck = new Duck();
		duck.birdId = "d001";
		Penguin penguin = new Penguin();
		penguin.birdId = "pn001";
		Ostrich ostrich = new Ostrich();
		ostrich.birdId = "os001";
		Parrot parrot = new Parrot();
		parrot.birdId = "p001";
		Parrot parrot1 = new Parrot();
		parrot1.birdId = "p001";

		BirdsRepository birdRepo = new BirdsRepository();
		birdRepo.addBird(duck);
		birdRepo.addBird(penguin);
		birdRepo.addBird(ostrich);
		birdRepo.addBird(parrot);
		birdRepo.addBird(parrot1);

		UserInterface userInterface = new UserInterface();
		userInterface.print(birdRepo.getListBirds());
		userInterface.printAllFlyingBirds(birdRepo.getListBirds());

		birdRepo.removeBird(duck);
		birdRepo.removeBird(parrot);
		System.out.println("-----------Printing the birds after removal-----------");
		userInterface.print(birdRepo.getListBirds());
		userInterface.printAllFlyingBirds(birdRepo.getListBirds());
	}

}
