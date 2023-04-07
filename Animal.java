public class Animal{
	private boolean hunger;
	private String noise;

	public Animal(){
		hunger=true;
	}
	public void animalNoise(String noise){
		this.noise=noise;
		System.out.println(noise);
	}
	public void feed(){
		System.out.println("You feed the animal");
		hunger=false;
	}
	public void hungerCheck(){
		if(hunger){
			System.out.println("This animal looks hungry");
		}
		else{
			System.out.println("This animal looks satisfied");
		}
	}
}