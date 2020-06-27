import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы:");
        int line = in.nextInt();
        System.out.println("Введите количество столбцов матрицы:");
        int column = in.nextInt();
        int[][] matrix = new int[line][column];
        for (int z=0;z<line;z++) {
            for (int i = 0; i < column; i++) {
                System.out.println("Введите значение в ячейку матрицы номер:" + (z+1) + " " + (i+1));
                matrix[z][i] = in.nextInt();
            }
        }
        System.out.println("Итоговая матрица после обработки:");
        System.out.print("\n");
        for (int z=0;z<line;z++) {
            for (int i = 0; i < column; i++) {
                System.out.print(matrix[z][i]*3 + " ");
            }
            System.out.print("\n");
        }
    }
}
