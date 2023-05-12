/*
ValidPass.java
Samus Anna
11.05.2023
*/

public class ValidPass {
	// instance variables
	private String userAlias;
	private String result;
	private String passwords[];

	//to modify sting
	StringBuffer sb = new StringBuffer();


	//constructor
	public ValidPass(){
		userAlias="";
		result="VALID";
	}
	//setter
	public void setAlias(String userAlias){
		this.userAlias=userAlias;

	}
	//validate alias
	public void validate(){
				//check length
			if (userAlias.length()>=24){



			//check first 3 letters AIB
			for (int i=0;i<3;i++){
				if (userAlias.charAt(i) != "AIB".charAt(i)) {
					result="NOT VALID";
				}

			}

			//check next two chars are digits 0-9
			for(int i=3;i<5;i++){
				if (userAlias.charAt(i) < '0' || userAlias.charAt(i) > '9'){
					result="NOT VALID";
				}

			}
			//check next 8 chars 49210955
			for (int i=5;i<13;i++){
				//compare chars from alias with "49210955" string
				if (userAlias.charAt(i) != "49210955".charAt(i - 5)) {
					result="NOT VALID";
				}
			}

			//check next 8 chars digits 0-9
			for(int i=13;i<21;i++){
				 if (userAlias.charAt(i) < '0' || userAlias.charAt(i) > '9') {
					result="NOT VALID";
				}

			}

			//check last chars are digits in ascending order
			for (int i = 21; i < 24; i++) {
				if (userAlias.charAt(i) < '0' || userAlias.charAt(i) > '9'){
					result="NOT VALID";
					break;
				}
				//check ascending order, if the current character is less or eq the previous character
				else if(i > 21 && userAlias.charAt(i) <= userAlias.charAt(i - 1)) {
					result="NOT VALID";
					break;
				}

			}
		}
		else {result="NOT VALID";}

	}

	//create arr of passwords

	public void createPassword(int numP, int[] mod){

		String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		    // initialize passwords array with length numP
		    String[] passwords = new String[numP];

		    //loop through array to store strings
		    for (int i=0;i<numP;i++){
		        int modulo=mod[i];//assign element from arr mod to mod var to calc modulo
		        int m=49210955%modulo;//calc remainder

		        // create new StringBuffer for each password
		        StringBuffer sb = new StringBuffer();

		        sb.append(m);//append remainder
		        sb.append('@');//append @

		        //generate 6 random letters from upperCaseLetters String using Math.random
		        for (int j = 0; j < 6; j++) {
		            int randomIndex = (int) (Math.random() * upperCaseLetters.length());
		            char randomChar = upperCaseLetters.charAt(randomIndex);
		            sb.append(randomChar);//append random char to sb
		        }

		        passwords[i] = sb.toString();//convert sb to string and store in array
		    }

		    //set instance variable to passwords array
		    this.passwords = passwords;

	}

	//getters
	public String getResult(){
		return result;
	}
	public String[] getPasswords(){
		return passwords;
	}

}