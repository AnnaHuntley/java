import java.util.*;

public class StringExerApp {
	public static void main(String[] args) {
		String userInput;
		int amLetters;
		int vowels;
		String secondCh;
		int[] positions;
		String replaceV;

		Scanner keyboard = new Scanner(System.in);
		StringExer myString = new StringExer();

		System.out.println("Please enter any words");
		userInput = keyboard.nextLine();
		myString.setUserInput(userInput);


		myString.computeLetters();
		amLetters = myString.getLetters();
		System.out.println(amLetters+" letters in your string");

		myString.computeVowels();
		vowels=myString.getVowels();
		System.out.println(vowels+" vowels in your string");

		myString.computeSecondCh();
		secondCh=myString.getSecondCh();
		System.out.println("Here is every second letters in your string "+secondCh);

		myString.computePositions();
		positions=myString.getPositions();
		System.out.println("Here is positions of every space ");
			for(int i=0;i<positions.length;i++){
				System.out.println(positions[i]);
			}


		myString.computeExclamations();
		replaceV=myString.getReplaceV();
		System.out.println("The vowels replaced with '!': "+replaceV);





	}

}
