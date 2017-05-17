package soal9;

/**
 * Created by faimm on 5/18/17.
 */
public class Animal {
    static boolean isAlive;
    static String name;
    static int age;

    public Animal() {
        isAlive = false;
        name = "defaulName";
        age = 0;
    }

    public static void animalProperties() {
        System.out.println("isAlive : " + isAlive);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}
