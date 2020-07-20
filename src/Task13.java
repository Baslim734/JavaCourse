import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String stroka = in.nextLine();
        System.out.println("Введите вторую строку:");
        String stroka2 = in.nextLine();

        if(stroka.length()>stroka2.length())
        {
            System.out.println("Самая длинная - первая строка:");
            System.out.println(stroka);
        }
        else if(stroka.length()<stroka2.length())
        {
            System.out.println("Самая длинная - вторая строка:");
            System.out.println(stroka2);
        }
        else
        {
            System.out.println("Строки равны.");
        }
    }
}
