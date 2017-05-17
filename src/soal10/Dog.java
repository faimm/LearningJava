package soal10;

/**
 * Created by faimm on 5/18/17.
 */
public class Dog extends Animal {

    public Dog(boolean isAlive, String name, int age) {
        this.isAlive = isAlive;
        this.name = name;
        this.age = age;
    }

    public void bark(String input) {
        System.out.println("dog " + input + " " + input + " " + input);
    }
}
