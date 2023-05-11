/*
ValidPass.java
Samus Anna
11.05.2023
*/

public class ValidPass {
	// instance variables
	private String userAlias;
	private String result;

	//constructor
	public ValidPass(){
		userAlias="";
		result="VALID";
	}
	//setter
	public void setAlias(String userAlias){
		this.userAlias=userAlias;
	}
	//compute
	public void validate(){
				//check length
			if (userAlias.length()!=24){
				result="NOT VALID";
			}

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
	//getter
	public String getResult(){
		return result;
	}


}