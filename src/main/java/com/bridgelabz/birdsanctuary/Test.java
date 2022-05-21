package com.bridgelabz.birdsanctuary;

import java.util.Arrays;

public class Test {
	
	public static void primeNumbers() {
		int num = 50;
		boolean isPrime = true;
		for(int j = 2; j <=num; ++j) {
			if(num%j == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num);
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,5,6,8,9,7,4};
		Arrays.sort(arr);
		System.out.println("Print Array: " + Arrays.toString(arr));
		
		int min = arr[0];
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println("Minimum is: " + min);
		System.out.println("Maximum is: " + max);
		
		primeNumbers();

	}

}
