import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку:");
            String Stroka = in.nextLine();
            System.out.println("Ваша строка без пробелов:");
            System.out.println(Stroka.replaceAll(" ", ""));
        }
    }

