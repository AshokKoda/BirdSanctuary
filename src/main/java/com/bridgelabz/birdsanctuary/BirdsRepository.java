package com.bridgelabz.birdsanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdsRepository {

	private List birdsList = new ArrayList();
	
	List getListBirds() {
		return birdsList;
	}
	
	public void addBird(Duck duck) {
		birdsList.add(duck);
	}
	
	public void addBird(Parrot parrot) {
		birdsList.add(parrot);
	}
	
	public void addBird(Ostrich ostrich) {
		birdsList.add(ostrich);
	}
	
	public void addBird(Penguin penguin) {
		birdsList.add(penguin);
	}
	
	public void removeBird(Duck duck) {
		birdsList.add(duck);
	}
	
	public void removeBird(Parrot parrot) {
		birdsList.remove(parrot);
	}
	
	public void removeBird(Ostrich ostrich) {
		birdsList.remove(ostrich);
	}
	
	public void removeBird(Penguin penguin) {
		birdsList.remove(penguin);
	}
	
}
