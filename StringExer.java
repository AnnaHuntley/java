
public class StringExer {
	private String userInput;
	private StringBuffer strBuff;
	private int amLetters;
	private int vowels;
	private String secondCh;
	private int[] positions;
	private String replaceV;



	//private char[]={'o','a','u','e','i','A','O','U','I','E'}
	private String exclamations;

	public StringExer() {
		strBuff = new StringBuffer();

	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;

	}


	public void computeLetters() {
		// compute
		// count the letters
		 for(int i=0;i<userInput.length();i++){
			 if(Character.isLetter(userInput.charAt(i))){
				 amLetters++;
			 }
		 }
	}


	// Counts vowels
	public void computeVowels(){
		for(int i=0;i<userInput.length();i++){
			if(userInput.charAt(i)=='a' || userInput.charAt(i)=='e'||userInput.charAt(i)=='o'||userInput.charAt(i)=='u'||userInput.charAt(i)=='i'||userInput.charAt(i)=='A' || userInput.charAt(i)=='E'||userInput.charAt(i)=='O'||userInput.charAt(i)=='U'||userInput.charAt(i)=='I')
			{
				vowels++;
			}
		}
	}
	// Stores a new String that only contains every second letter
	public void computeSecondCh(){
		for(int i=0;i<userInput.length();i++){
			if(Character.isLetter(userInput.charAt(i))){
				i++;
				strBuff.append(userInput.charAt(i));
		}


			secondCh=strBuff.toString();
		}
	}

	// Stores the positions of each space




	public void computePositions(){

		int pos=0;
		int amCh=0;
		for(int i=0;i<userInput.length();i++){
			if(userInput.charAt(i)==' '){
				amCh++;
			}
		}
		positions=new int[amCh];
		for(int i=0;i<userInput.length();i++){
					if(userInput.charAt(i)==' '){
						positions[pos]=i;
						pos++;
					}
		}

	}



	// Outputs a new String with all vowels are replaced/printed as exclamation
	public void computeExclamations(){
	 replaceV = userInput.replace("a", "!").replace("e", "!").replace("i", "!").replace("o", "!").replace("u", "!").replace("A", "!").replace("E", "!").replace("I", "!").replace("O", "!").replace("U", "!");
		}


	public int getLetters() {

		return amLetters;
	}
	public int getVowels(){
		return vowels;
	}
	public String getSecondCh(){
		return secondCh;
	}
	public int[] getPositions(){
		return positions;
	}
	public String getReplaceV(){
		return replaceV;
	}


}