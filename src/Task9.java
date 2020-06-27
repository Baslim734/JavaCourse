import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int number = in.nextInt();
        int[] array = new int[number];
        for(int i=0;i<number;i++){
            System.out.println("Введите значение номер " + (i+1));
            array[i] = in.nextInt();
        }
        for(int i=0;i<number;i++){
            System.out.println(array[i]*2);
        }
    }
}
