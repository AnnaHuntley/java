//create a specific dog
public class AnimalMakerApp{
	public static void main(String[] args){
		Dog dog1=new Dog("Lab");
		Animal a1=new Animal();//interact with superclass
		System.out.println(dog1.getName());
		dog1.hungerCheck();
		dog1.feed();
		dog1.hungerCheck();

		dog1.animalNoise(dog1.dogNoise());//take the method from subclass that return noise

		System.out.println("Generic animal");
		a1.hungerCheck();
		a1.feed();
		a1.animalNoise("Roar");//no overriding, diractly from superclass
	}
}