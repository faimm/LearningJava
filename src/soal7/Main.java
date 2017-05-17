package soal7;

/**
 * Created by faimm on 5/18/17.
 */
public class Main {

    public static String evenOrOdd(int input) {
        if (input % 2 == 0) return "even";
        else return "odd";
    }

    public static void main(String[] args) {
        int var1 = 1;
        int var2 = 2;
        int var3 = 3;

        System.out.println(evenOrOdd(var1));
        System.out.println(evenOrOdd(var2));
        System.out.println(evenOrOdd(var3));
    }
}
