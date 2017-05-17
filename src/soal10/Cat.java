package soal10;

/**
 * Created by faimm on 5/18/17.
 */
public class Cat extends Animal {

    public Cat(boolean isAlive, String name, int age) {
        this.isAlive = isAlive;
        this.name = name;
        this.age = age;
    }

    public void meow(String input) {
        System.out.println("cat " + input + " " + input + " " + input);
    }
}
