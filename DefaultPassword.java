public class DefaultPassword {

private String text;  // instance variable
private int n; // instance variable
private String password;  // instance variable

public DefaultPassword(){
// text = "";  // not mandatory
// password = ""; // not mandatory
}

public void setText(String text){
this.text = text;
}

	public void setN(int number){
		n = number;
	}

public void generatePassword(){
            StringBuffer sb = new StringBuffer();
			//get the length of the text

            int len = text.length();
            int position = 1;

            for (int i = 0; i<len; i++){
				//access an indvidual character from the text in the loop and save a character in a variable called c
			char c = text.charAt(i);
			//if the position modules n is not equal to 0
			if (position % n != 0){
				//each space is replaced with an ! mark
				if (c == ' '){
					sb.append('!');

				}
				//else if character is a 'a' or 'e' etc
				else if (c  == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
					//add 'R'
					sb.append('R');
					//but also add back the vowel character.
					sb.append(c);
				} else {
					sb.append(c);
				}
			}

position = position + 1;
             }

            password = sb.toString();
    }

     public String getPassword(){
     	return password;
     }
}
