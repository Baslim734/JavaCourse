import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String Stroka = in.nextLine();
        System.out.println("Введите вторую строку:");
        String Stroka2 = in.nextLine();

        if(Stroka.length()>Stroka2.length()){
            System.out.println("Самая длинная - первая строка:");
            System.out.println(Stroka);
        }
        else if(Stroka.length()<Stroka2.length())
        {
            System.out.println("Самая длинная - вторая строка:");
            System.out.println(Stroka2);
        }
        else
        {
            System.out.println("Строки равны.");
        }
    }
}
