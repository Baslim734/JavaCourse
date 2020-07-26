import java.util.Scanner;
//Сортировка выбором
public class FinalTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Необходимо ввести размер массива: ");

        int size = input.nextInt();
        int array[] = new int[size];

        System.out.println("Необходимо ввести элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Введенный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }

        System.out.println("\nМассив, полученный после сортировки:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}