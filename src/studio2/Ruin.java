package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//for (int day = 1; day <=1; day++);
		//win or lose $1 each turn
		int ruinNum = 0;
		System.out.println ("How many days would you like to play?");
		int totalSimulations = in.nextInt();
		System.out.println ("How much money would you like to start with?");
		int startAmount = in.nextInt();
		System.out.println ("What is your win limit?");
		int winLimit = in.nextInt();
		//int totalSimulations = 100;
		for (int i = 1; i <= totalSimulations; i++)
		{
			int initial = startAmount;
			int limit = winLimit; 
			int totalPlays = 0;
			while(initial < winLimit && initial > 0)
			{
				double winChance = Math.random();
				if (winChance > .5) {
					initial++;
				}
				else {
					initial--;
				}
				//System.out.println (startAmount);
				totalPlays ++;
			}
			System.out.print("Day: " + i);
			System.out.print (" Plays: " + totalPlays);
			if (initial == 0) {
				System.out.println(" Conclusion: ruin");
				ruinNum++;
			}
			else {
				System.out.println(" Conclusion: success");
			}
		}
		double ruinRate = (((double)ruinNum / totalSimulations) * 100);
		System.out.println(ruinRate + "%");


	}
}
