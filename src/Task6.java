import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число X:");
        double x = in.nextInt();
        System.out.print("Введите число y:");
        double y = in.nextInt();
        System.out.print("Введите число z:");
        double z = in.nextInt();
        double f = (x+y+z)/3;
        System.out.println("Среднее арифмитическое введенных чисел: " + f);
        f = f / 2;
        int i = (int) f;
        if (i > 3)
        {
            System.out.println("Программа выполнена корректно");
        }

    }
}
