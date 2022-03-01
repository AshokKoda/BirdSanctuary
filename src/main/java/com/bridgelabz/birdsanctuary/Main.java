package com.bridgelabz.birdsanctuary;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to bird sanctuary !");
		
		Duck duck = new Duck();
		Penguin penguin = new Penguin();
		Ostrich ostrich = new Ostrich();
		Parrot parrot = new Parrot();
		
		BirdsRepository birdRepo = new BirdsRepository();
		UserInterface  userInterface = new UserInterface();
		
		birdRepo.addBird(duck);
		birdRepo.addBird(penguin);
		birdRepo.addBird(ostrich);
		birdRepo.addBird(parrot);
		
//		System.out.println("---------After removed birds-----------");
//		birdRepo.removeBird(duck);
//		birdRepo.removeBird(penguin);
		userInterface.print(birdRepo.getListBirds());
		userInterface.printAllFlyingBirds(birdRepo.getListBirds());

	}

}
