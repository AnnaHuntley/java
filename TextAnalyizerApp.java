import java.util.Scanner;

public class TextAnalyizerApp {
int numVerbs;
public static void main(String args[]){

Scanner keyboard = new Scanner(System.in);
TextAnalyizer ta = new TextAnalyizer();


System.out.println("Enter a sentence");
String userInput = keyboard.nextLine();


ta.setUserInput(userInput);

ta.computeString();

ta.getNumVerbs();

System.out.println(ta.getNumVerbs());

}


}