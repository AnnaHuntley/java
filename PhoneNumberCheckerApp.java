import javax.swing.JOptionPane;
public class PhoneNumberCheckerApp{
	public static void main(String[] args){
		//vars
		String phoneNum;
		String[] prefixes=new String[3];
		String validity;
		String alteredNumber;
		//objects
		PhoneNumberChecker myPhoneNum;
		myPhoneNum=new PhoneNumberChecker();
		//inputs
		phoneNum=JOptionPane.showInputDialog(null,"Enter your phone number");
		//Fill the prefixes array with user input
		for(int i=0;i<prefixes.length;i++){
			prefixes[i]=JOptionPane.showInputDialog(null,"Enter a 3 digit mobile prefix");
		}
		//set/compute
		myPhoneNum.checkNumber(phoneNum,prefixes);
		//get
		validity=myPhoneNum.getValidity();
		alteredNumber=myPhoneNum.getAlteredNumber();
		//output
		JOptionPane.showMessageDialog(null,validity);
		JOptionPane.showMessageDialog(null,"Original: "+phoneNum+"\n New: "+alteredNumber);
	}
}