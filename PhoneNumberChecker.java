public class PhoneNumberChecker{
	//vars
	private String phoneNum;
	private String[] prefixes;
	private String validity;
	private String numPrefix;
	private String alteredNumber;
	private StringBuffer strBuff;
	//constructor
	public PhoneNumberChecker(){
		strBuff=new StringBuffer();
		validity="Number is invalid: ";
		prefixes=new String[3];
	}
	//set/compute
	public void checkNumber(String phoneNum,String[] prefixes){
		numPrefix=phoneNum.charAt(0)+""+phoneNum.charAt(1)+""+phoneNum.charAt(2);
		if(phoneNum.length()==10){
			if(numPrefix.equals(prefixes[0])||numPrefix.equals(prefixes[1])||numPrefix.equals(prefixes[2])){
				for(int i=0;i<phoneNum.length();i++){
					if(phoneNum.charAt(i)=='0'||phoneNum.charAt(i)=='1'||phoneNum.charAt(i)=='2'||phoneNum.charAt(i)=='3'||phoneNum.charAt(i)=='4'||phoneNum.charAt(i)=='5'||phoneNum.charAt(i)=='6'||phoneNum.charAt(i)=='7'||phoneNum.charAt(i)=='8'||phoneNum.charAt(i)=='9'){
						validity="This is a valid number";
					}
					else{
						validity="It contained a non numeric character";
						break;
					}
				}
			}
			else{
				validity="It does not match the given prefixes";
			}
		}
		else{
			validity="This is not a valid number, needs 10 numbers";
		}

		//now change the number (9-6)
		for(int i=0;i<phoneNum.length();i++){
			if(phoneNum.charAt(i)=='9'){
				strBuff.append('6');
			}
			else{
				strBuff.append(phoneNum.charAt(i));
			}
		}
		alteredNumber=strBuff.toString();

	}
	//get
	public String getValidity(){
		return validity;
	}
	public String getAlteredNumber(){
		return alteredNumber;
	}
}