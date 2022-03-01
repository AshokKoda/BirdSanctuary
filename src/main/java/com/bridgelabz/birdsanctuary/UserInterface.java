package com.bridgelabz.birdsanctuary;

import java.util.List;

public class UserInterface {
	
	void print(List birds) {
		for(int i = 0; i < birds.size(); i++){
			System.out.println(birds.get(i));
		}
	}
	
	void printAllFlyingBirds(List<Bird> listOfBirds) {
		for(int i = 0; i < listOfBirds.size(); i++){
			listOfBirds.get(i).fly();
			//listOfBirds.get(i).eat();
		}
	}

}
