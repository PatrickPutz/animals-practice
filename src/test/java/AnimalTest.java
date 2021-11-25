import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimalTest {
    Animal cat;
    Animal dog;
    Animal bird;
    Animal wolf;

    @BeforeEach
    void setUp() {
        cat = new Animal("Minka", 5, "cat", "meow");
        dog = new Animal("Lucy", 3, "dog", "woof");
        bird = new Animal("Flappy", 1, "bird", "chirp");
        wolf = new Animal("Fluffy", -17, "wolf", "awoo");
    }

    @Test
    void constructor() {
        Animal fish = new Animal("Brutus", 2, "fish", "blubb");
        Assertions.assertEquals("Brutus", fish.getName());
        Assertions.assertEquals(2, fish.getAge());
        Assertions.assertEquals("fish", fish.getSpecies());
        Assertions.assertEquals("blubb", fish.getAnimalLoud());
    }

    @Test
    void giveAnimalLoud() {
        Assertions.assertEquals("meow", cat.giveAnimalLoud());
        Assertions.assertEquals("woof", dog.giveAnimalLoud());
        Assertions.assertEquals("chirp", bird.giveAnimalLoud());
    }

    @Test
    void getNameAndAge() {
        Assertions.assertEquals("Name: Minka, Age: 5", cat.getNameAndAge());
        Assertions.assertEquals("Name: Lucy, Age: 3", dog.getNameAndAge());
        Assertions.assertEquals("Name: Flappy, Age: 1", bird.getNameAndAge());
        Assertions.assertEquals("Name: Fluffy, Age: 0", wolf.getNameAndAge());
    }

    @Test
    void ageCategory() {
        Assertions.assertEquals("baby animal", wolf.ageCategory());
        Assertions.assertEquals("baby animal", bird.ageCategory());
        Assertions.assertEquals("young animal", dog.ageCategory());
        Assertions.assertEquals("old animal", cat.ageCategory());
    }
}
