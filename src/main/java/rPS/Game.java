package rPS;

import java.util.Random;

public class Game {

	private static Random rand = new Random();

	public static Hand play(Hand choice) { // Hand is enum, choice is input variable
		int rng = rand.nextInt(99); // random number generation with 99 options

		Hand result = null; // link random number generation to RPS hands
		if (rng < 33) {
			result = Hand.PAPER;
		} else if (rng < 66) {
			result = Hand.ROCK;
		} else {
			result = Hand.SCISSORS;
		}

		System.out.println("You chose " + choice + " and RNGesus picked " + result);

		// decide game outcomes
		if (choice == result) { // as enums are stored in one place in memory
			System.out.println("Draw!"); // == can be used to compare two values
		} else if (result == Hand.PAPER) {
			if (choice == Hand.ROCK) {
				System.out.println("Loss!");
			} else if (choice == Hand.SCISSORS) {
				System.out.println("Win!");
			}
		} else if (result == Hand.ROCK) {
			if (choice == Hand.SCISSORS) {
				System.out.println("Loss!");
			} else if (choice == Hand.PAPER) {
				System.out.println("Win!");
			}
		} else if (result == Hand.SCISSORS) {
			if (choice == Hand.PAPER) {
				System.out.println("Loss!");
			} else if (choice == Hand.ROCK) {
				System.out.println("Win!");
			}
		}
		return choice;
	}
}
