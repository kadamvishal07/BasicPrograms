package learningPrograms;

import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		System.out.println("enter your string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] splitStr = str.split(" ");
		
		for (String words: splitStr) {
			//char firstChar = words.charAt(0);
			//System.out.print(Character.toUpperCase(firstChar));
			for(int i=0; i<words.length()-1;i++) {
				System.out.print(words.charAt(i));
			}
			char lastLetter = words.charAt(words.length()-1);
			System.out.print(Character.toUpperCase(lastLetter));
			System.out.print(" ");
		}
	}

}
