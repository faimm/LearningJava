package soal10;

/**
 * Created by faimm on 5/18/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("dog desription");
        Dog dog = new Dog(true, "heli", 2);
        dog.animalProperties();
        dog.bark("guk");

        System.out.println("cat desription");
        Cat cat = new Cat(true, "pussy", 5);
        cat.animalProperties();
        cat.meow("meong");
    }
}
