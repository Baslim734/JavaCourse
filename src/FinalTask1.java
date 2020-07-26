import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        String stroka = in.nextLine();
        long number = Long.parseLong(stroka);
        double result = 0;
        int z = 0;
        int length = (int) (Math.log10(number) + 1);
        while(z<length) {
            result = result + number % 10*Math.pow(2, z);
            number = number /10;
            z++;
        }
        int out = (int) result;
        System.out.println(out);
    }
}
