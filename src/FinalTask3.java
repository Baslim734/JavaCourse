import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Необходимо ввести курс доллара к рублю (сколько стоит 1 доллар в рублях):");
        double course = input.nextDouble();
        System.out.println("Введите количество рублей:");
        double roubles = input.nextDouble();
        double dollars = roubles / course;
        dollars = Math.round(dollars * 100.0) / 100.0;
        System.out.println("У вас "+ dollars +" доллара(ов).");
    }
}
