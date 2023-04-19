
public class TextAnalyizer {
	private String userInput;
	private int numVerbs;



	public TextAnalyizer(){
		userInput="";
		numVerbs=0;


	}

	public void setUserInput(String userInput){
		this.userInput=userInput;

	}
	public void computeString(){
		int count=0;
		for(int i=0; i<userInput.length()-2/* the loop needs to stop three characters before the end of the input string*/;i++){
			if(userInput.charAt(i)=='i'&&userInput.charAt(i+1)=='n'&&userInput.charAt(i+2)=='g'&&(userInput.charAt(i+3)==' '||userInput.charAt(i+3)=='.')){
				numVerbs++;
				i=i+3;//skip over the "ing" sequence once it's been found
			}
			//else { numVerbs=0;}





		}

	}

	public int getNumVerbs(){

		return numVerbs;
	}

}