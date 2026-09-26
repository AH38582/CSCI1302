package chap11;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Dog d1 = (Dog) a2; // downcasting to call setBreed()

		d1.setBreed("Doberman");
		
		Animal a3 = new Elephant();
		Elephant e1 = (Elephant) a3;
		e1.setLocation("Savannah");

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(a1);
		animals.add(d1);
		animals.add(e1);

		for (int i = 0; i < animals.size(); i++) {
			printObject(animals.get(i));
			System.out.println(animals.get(i).makeNoise());
			System.out.println();
		}
	}
	
	public static void printObject(Object x) {
		System.out.println(x);
	}

}

class Animal {
	private String name;
	private double height, weight;

	public Animal() {
		this("Unidentified Animal", 1.0, 1.0);
	}

	public Animal(String name, double height, double weight) {
		setName(name);
		setHeight(height);
		setWeight(weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String makeNoise() {
		return "Animal noise";
	}

	@Override
	public String toString() {
		return String.format("""
				Name: %s
				Height: %.2f feet
				Weight: %.2f lbs
				""", getName(), getHeight(), getWeight());
	}

}

class Dog extends Animal {
	private boolean hadRabiesShot;
	private String breed;

	public Dog() {
		super("Dog", 5.0, 2.0);
		setBreed("Unidentified dog");
		setHadRabiesShot(true);
	}

	public Dog(String name, double height, double weight, String breed) {
		setBreed(breed);
		setHeight(height);
		setWeight(weight);
	}

	public boolean isHadRabiesShot() {
		return hadRabiesShot;
	}

	public void setHadRabiesShot(boolean hadRabiesShot) {
		this.hadRabiesShot = hadRabiesShot;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String makeNoise() {
		return "Bark";
	}

	@Override
	public String toString() {
		return super.toString() + String.format("""
				Breed: %s
				""", getBreed());
	}

}

class Elephant extends Animal {
	private String location;
	private String gender;
	private String breed;
	
	public Elephant() {
		super("Unidentified elephant", 8.0, 4000);
		setLocation("Unidentified location");
		setGender("Unidentified gender");
	}
	
	public Elephant(String name, double height, double weight, String breed) {
		setHeight(height);
		setWeight(weight);
		setBreed(breed);
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Elephant noise";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("""
				Location: %s
				Gender: %s
				Breed: %s
				""", getLocation(), getGender(), getBreed());
	}
	
	
}
