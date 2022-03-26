package com.bridgelabz.birdsanctuary;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UserInterface {

	void print(Set<Bird> birds) {
		for (Bird bird : birds) {
			System.out.println(bird);
		}
//		for(int i = 0; i < birds.size(); i++){
//			System.out.println(birds.get(i));
//		}
	}

	void printAllFlyingBirds(Set<Bird> listOfBirds) {
		for (Bird bird : listOfBirds) {
			bird.fly();
		}
//		for(int i = 0; i < listOfBirds.size(); i++){
//			listOfBirds.get(i).fly();
//		}
	}

}
