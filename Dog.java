//also blueprint like animal class but specific
public class Dog extends Animal{
	private String name;
	private String breed;
	private int randomBark;
	private String chosenNoise;

	public Dog(String breed){
		this.breed=breed;
		name="Stray";
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public String dogNoise(){
		String[] barkNoise={"bark","yip","yap"};
		randomBark=(int)(Math.random()*3);
		chosenNoise=barkNoise[randomBark];//randon bark ove from the array
		return chosenNoise;
	}
	//overridind the method animalNoise from superclass
	//to say which of 2 methods we talk. we want this animalNoise to call the once fronm superclass
	@Override
	public void animalNoise(String noise){
		for(int i=0;i<3;i++){
			super.animalNoise(chosenNoise);//give the function var noise
		}
	}

}