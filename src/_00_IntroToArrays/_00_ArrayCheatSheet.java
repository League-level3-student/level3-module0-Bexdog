package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] string = { "Hi", "hello", "i = cool", "animal", "not you" };
		// 2. print the third element in the array
		System.out.println(string[2]);
		// 3. set the third element to a different value
		string[2] = "who are you";
		// 4. print the third element again
		System.out.println(string[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < string.length; i++) {
			string[i] = "Me too";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
		// 7. make an array of 50 integers
		int[] Me_Too = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		int randy = new Random().nextInt(1999999999);
		for (int i = 0; i < Me_Too.length; i++) {
			Me_Too[i] = randy;
			randy = new Random().nextInt(1999999999);
		}

		// 9. without printing the entire array, print only the smallest number on the
		// array
		int temp;
		for (int i = 0; i < Me_Too.length; i++) {
			for (int y = 0; y < Me_Too.length; y++) {
				if (Me_Too[i] < Me_Too[y]) {
					temp = Me_Too[i];
					Me_Too[i] = Me_Too[y];
					Me_Too[y] = temp;
				}
			}
		}
		System.out.println(Me_Too[0]);
		// 10 print the entire array to see if step 8 was correct
for(int i = 0;i<Me_Too.length;i++) {
		System.out.println(Me_Too[i]);
}
		// 11. print the largest number in the array.
System.out.println(Me_Too[49]);
		// 12. print only the last element in the array
System.out.println(Me_Too[49]);
	}
}
