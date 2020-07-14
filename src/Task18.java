import java.io.*;
public class Task18 {

    public static void main(String[] args) {
        String s;
        int st = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Task18.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                st++;
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        String text;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите изменения для вышеуказанного текста: ");
        int y = 1;
        try (FileWriter fw = new FileWriter("src/Task18.txt")) {
            for (int fin = 0; fin < st; fin++) {
                System.out.print(y + " - ");
                text = br.readLine();
                fw.write(text + "\r\n");
                y++;
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        String textRead;
        try (BufferedReader br2 = new BufferedReader(new FileReader("src/Task18.txt"))) {
            while ((textRead = br2.readLine()) != null) {
                System.out.println(textRead);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}