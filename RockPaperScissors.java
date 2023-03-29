/*
RockPaperScissors.java
A Samus
20.02.2023
*/

public class RockPaperScissors{

	//data members
	private int userStep;//input
	private int compStep;
	private String result;//input



	//contructor
	public RockPaperScissors(){
		userStep=0;
		compStep=0;
		result="";

	}

	//setters i.e. inputs coming in from the app class
	public void setUserStep(int userStep){
		this.userStep=userStep;
	}

	public void setCompStep(int compStep){
			this.compStep=compStep;
	}

	//compute - process - calculations

	public void compute(){

		if(userStep==1){
			if(compStep==1){result="draw";}
			else if(compStep==2){result="lose";}
			else if(compStep==3){result="win";}
		}
		else if(userStep==2){
			if(compStep==1){result="win";}
			else if(compStep==2){result="draw";}
			else if(compStep==3){result="lose";}

		}
		else if(userStep==3){
			if(compStep==1){result="lose";}
			else if(compStep==2){result="win";}
			else if(compStep==3){result="draw";}

		}



			else{
				result="Chose wrong option";
			}
		//last else in here to pop out an invalid message


}

	//getters - send the data to the app class
	public String getResult(){
		return result;
	}


}//closes the class signature