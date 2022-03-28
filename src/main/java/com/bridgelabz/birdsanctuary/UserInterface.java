package com.bridgelabz.birdsanctuary;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {

	void print(Set<Bird> birds) {
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}

	void printAllFlyingBirds(Set<Bird> listOfBirds) {
		for (Bird bird : listOfBirds) {
			bird.fly();
		}
	}
	
	int showMainMenu() {
		System.out.println("Choose Options:");
		System.out.println(" 1.Add Bird\n 2.Delete Bird\n 3.Update Bird\n 4.Print Birds\n 5.Exit");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		return select;
		
	}

}
