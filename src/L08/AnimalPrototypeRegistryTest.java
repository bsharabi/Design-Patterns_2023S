package L08;

import static org.junit.jupiter.api.Assertions.*;

class AnimalPrototypeRegistryTest {


    @org.junit.jupiter.api.Test
    void addPrototype() {
        AnimalPrototype animalPrototype = new Dog();
        AnimalPrototypeRegistry a = new AnimalPrototypeRegistry();

        a.addPrototype("dog",animalPrototype);

        assertEquals(a.getPrototype("dog"),animalPrototype);

    }
}