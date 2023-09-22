package L08;

import java.util.HashMap;
import java.util.Map;

/**
 * A class implements the Cloneable interface to indicate to the Object.clone() method that it is legal for that method to make a field-for-field copy of instances of that class.
 * Invoking Object's clone method on an instance that does not implement the Cloneable interface results in the exception CloneNotSupportedException being thrown.
 * By convention, classes that implement this interface should override Object.clone (which is protected) with a public method. See Object.clone() for details on overriding this method.
 * Note that this interface does not contain the clone method. Therefore, it is not possible to clone an object merely by virtue of the fact that it implements this interface. Even if the clone method is invoked reflectively, there is no guarantee that it will succeed.
 * Since:
 * 1.0
 * See Also:
 * CloneNotSupportedException, Object.clone()
 *
 *
 */
// Prototype interface
interface AnimalPrototype extends Cloneable {
    AnimalPrototype clone();
}

class AnimalPrototypeRegistry {

    private Map<String, AnimalPrototype> prototypes = new HashMap<>();

    public void addPrototype(String key, AnimalPrototype prototype) {
        prototypes.put(key, prototype);
    }

    public void removePrototype(String key, AnimalPrototype prototype) {
        prototypes.remove(key);
    }

    public AnimalPrototype getPrototype(String key) {
        return prototypes.get(key);
    }

    public boolean isEmpty() {
        return prototypes.isEmpty();
    }

    public AnimalPrototype cloneAnimal(String key) {
        AnimalPrototype prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}

// Base class: Animal
public class Animal implements AnimalPrototype {
    private String species;

    public Animal() {
        this.species = "Unknown";
    }

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public AnimalPrototype clone() {
        // Create a new instance of the same class
        return new Animal(this.species);
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass: Mammals
class Mammals extends Animal {
    private boolean hasFur;

    public Mammals() {
        super();
        this.hasFur = true;
    }

    public Mammals(String species, boolean hasFur) {
        super(species);
        this.hasFur = hasFur;
    }

    public boolean hasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public AnimalPrototype clone() {
        // Create a new instance of the same class
        return new Mammals(this.getSpecies(), this.hasFur);
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal makes a sound");
    }
}

// Subclass: Dog
class Dog extends Mammals {

    private String breed;

    public Dog() {
        this.breed = "Unknown Breed";
    }

    public Dog(String species, boolean hasFur, String breed) {
        super(species, hasFur);
        this.breed = breed;
    }

    public Dog(Dog other) {
        super(other.getSpecies(), other.hasFur());
        this.breed = other.breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public AnimalPrototype clone() {
        // Create a new instance of the same class
        return new Dog(this);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass: Cat
class Cat extends Mammals {
    private String furColor;

    public Cat() {
        this.furColor = "Unknown Color";
    }

    public Cat(String species, boolean hasFur, String furColor) {
        super(species, hasFur);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public AnimalPrototype clone() {
        // Create a new instance of the same class
        return new Cat(this.getSpecies(), this.hasFur(), this.furColor);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Subclass: Bengal (a specific type of cat)
class Bengal extends Cat {
    private boolean isWild;

    public Bengal() {
        this.isWild = false;
    }

    public Bengal(String species, boolean hasFur, String furColor, boolean isWild) {
        super(species, hasFur, furColor);
        this.isWild = isWild;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    @Override
    public AnimalPrototype clone() {
        // Create a new instance of the same class
        return new Bengal(this.getSpecies(), this.hasFur(), this.getFurColor(), this.isWild);
    }

    @Override
    public void makeSound() {
        System.out.println("Bengal cat makes a sound");
    }
}

class Main {
    public static void main(String[] args) {
        // Create instances of animals using the prototype pattern
        AnimalPrototypeRegistry registry = new AnimalPrototypeRegistry();
        registry.addPrototype("dog", new Dog("Dog", true, "Golden Retriever"));
        registry.addPrototype("cat", new Cat("Cat", true, "Tabby"));
        registry.addPrototype("bengal", new Bengal("Bengal Cat", true, "Spotted", true));


        System.out.println(registry.getPrototype("dog"));
        System.out.println(registry.getPrototype("cat"));
        System.out.println(registry.getPrototype("bengal"));

        AnimalPrototype clonedDog = registry.cloneAnimal("dog");
        AnimalPrototype clonedCat = registry.cloneAnimal("cat");
        AnimalPrototype clonedBengal = registry.cloneAnimal("bengal");

        System.out.println("Address Original Dog: " + clonedDog);
        System.out.println("Address Original Cat: " + clonedCat);
        System.out.println("Address Original Bengal Cat: " + clonedBengal);

        System.out.println("Original Dog: " + ((Dog) clonedDog).getBreed());
        System.out.println("Original Cat: " + ((Cat) clonedCat).getFurColor());
        System.out.println("Original Bengal Cat: " + ((Bengal) clonedBengal).isWild());


    }
}
