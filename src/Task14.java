import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = in.nextInt();
        String S = String.valueOf(number);
        System.out.println(S);
        int X = Integer.parseInt(S);
        System.out.println(X);
        Double Y = (double)X;
        System.out.println(Y);

    }
}
