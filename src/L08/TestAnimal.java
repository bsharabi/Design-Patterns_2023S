package L08;

public class TestAnimal {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cat2 = new Cat();
        Animal dog2 = new Dog();

        makeCopy(dog);
        makeCopy(dog2);
        makeCopy(cat);
        makeCopy(cat2);

    }

    public static Animal makeCopy(Animal animal) {
        Animal copy = null;
        if (animal instanceof Dog)
             copy = new Dog();
        else if(animal instanceof Cat)
            copy= new Cat();
        return copy;
    }

    public static AnimalPrototype makeCopies(Animal animal) {
        return animal.clone();
    }
}
