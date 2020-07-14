import java.io.*;

public class Task17 {
    public static void main(String[] args) {
        String s;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Необходимо ввести текст. Для окончания ввода введите строку 'For the Gilneas'");

        try (FileWriter fw = new FileWriter("src/Task17.txt")) {
            do {
                System.out.print(": ");
                s = br.readLine();

                if (s.compareTo("For the Gilneas") == 0) break;
                s = s + "\r\n";
                fw.write(s);
            } while (s.compareTo("For the Gilneas") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода вывода:" + exc);
        }
    }
}

