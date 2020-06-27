import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите переменную:");
        int number = in.nextInt();
        int x = 10, y = 5, z = 15;
        if ((number == x) | (number == y) | (number == z)) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}
