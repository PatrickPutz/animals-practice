public class Animal {

    private String name;
    private int age;
    private String species;
    private String animalLoud;

    public Animal(String name, int age, String species, String animalLoud) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.animalLoud = animalLoud;
        if (this.age < 0)
            this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0)
            this.age = 0;
        else
            this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String giveAnimalLoud(){
        return getAnimalLoud();
    }

    public String getNameAndAge(){
        return "Name: " + this.name + ", Age: " + this.age;
    }

    public String ageCategory(){
        if (age > 4)
            return "old animal";
        else if(age > 2)
            return "young animal";
        else
            return "baby animal";
    }

}
