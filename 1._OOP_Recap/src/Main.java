public class Main {
    public static void main(String[] args) {
//        Cow funnySoundingCow = new Cow();
//        System.out.println(funnySoundingCow.collectionSounds());

        Cow firstCow = new Cow();

        // todo static binding, static polymorphism
        // todo happens at: compile time
//        System.out.println(firstCow.sound());
//        System.out.println(firstCow.sound("moooooooOOOOOoooo"));

        // todo dynamic binding, dynamic polymorphism
        // todo happens at: runtime
        String[] foods = {"grass", "hay", "chicken"};
        System.out.println(firstCow.eat(foods));

        Animal animal = new Animal();
        System.out.println(animal.eat(foods));

        // todo superclass: Is-A-relation
        // todo interface: Has-A-relation


        // todo object polymorphism
        Animal cowAnimal = firstCow;
        Cow cowCow = firstCow;
        SoundGenerator cowSounder = firstCow;

        cowAnimal.eat(foods);
        cowCow.eat(foods);
        cowSounder.sound();
        // casting
        ((Cow) cowSounder).eat(foods);

        System.out.println(cowAnimal);
        System.out.println(cowSounder);

        // todo no go, can't instantiate abstract classes
        // Kingdom kingdom = new Kingdom();
        Kingdom kingdom = new Kingdom() {
            @Override
            public void being() {
                System.out.println("for all existing beings");
            }
        };


    }
}

// overloading
// overriding