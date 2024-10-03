import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        try {
            FileWriter fileWriter = new FileWriter("C:\\files\\ksu-java-programming\\stream\\src\\test.txt");

            while (true) {
                String s = scanner.nextLine();
                if (s.isEmpty()) break;
                fileWriter.write(s);
                fileWriter.write("\r\n", 0, 2);
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
