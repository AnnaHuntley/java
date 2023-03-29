/*
Blood.java
A Samus
20.02.2023
*/

public class Blood {
	int age;
	String group;
	String giveTo;
	String receiveFrom;

	public Blood (){
		age=0;
		group="";
		giveTo="";
		receiveFrom="";
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGroup(String group){
		this.group=group;
	}

	public void compute(){
		if (age>=18){
			if(group.equalsIgnoreCase("AB")){
				giveTo="AB";
				receiveFrom="AB, A, B, O";
			}
			else if(group.equalsIgnoreCase("A")){
				giveTo="A and AB";
				receiveFrom="A and O";
			}
			else if(group.equalsIgnoreCase("B")){
				giveTo="B and AB";
				receiveFrom="B and O";
			}

			else if(group.equalsIgnoreCase("B")){
				giveTo="AB, A, B, O";
				receiveFrom="O";
			}

		}


		else {
			System.out.println("You must be over 18");
			}
}

		public String getGive(){

			return giveTo;
		}

		public String getReceive(){
			return receiveFrom;
		}




}

