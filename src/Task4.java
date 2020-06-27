import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String result = in.nextLine();
        int inT = Integer.parseInt(result, 2);
        System.out.println(inT);
    }
}
