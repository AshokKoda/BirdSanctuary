package com.bridgelabz.birdsanctuary;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BirdsRepository {
	
	//private List<Bird> birdsList = new ArrayList();
	private Set<Bird> listBirds = new HashSet<Bird>();
	private static BirdsRepository instance;
	
	public static BirdsRepository getInstance() {
		if(instance == null) {
			instance = new BirdsRepository();
		}
		return instance;
	}
	
	Set getListBirds() {
		return listBirds;
	}
	
	public void addBird(Bird bird) {
		listBirds.add(bird);
	}
	
	
	public void removeBird(Bird bird) {
		listBirds.remove(bird);
	}
	
	Bird getBirdId(String birdId) {
		Iterator<Bird> iterator = listBirds.iterator();
		while(iterator.hasNext()) {
			Bird b = iterator.next();
			if(b.birdId.equalsIgnoreCase(birdId)) {
				return b;
			}
		}
		return null;
	}
}
