package learningPrograms;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		System.out.println("please enter the string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println("input string is: " + str);
		String split[] = str.split(" ");
		// System.out.println(" "+split[0]);

		for (int i = 0; i < split.length; i++) {
			String firstLetter = split[i];
			char firstCapital;
			for (int j = 0; j < firstLetter.length(); j++) {
				if (j == 0) {
					firstCapital = firstLetter.charAt(j);
					System.out.print(" " + Character.toUpperCase(firstCapital));
				} else {
					System.out.print(firstLetter.charAt(j));
				}
			}

		}

	}

}
